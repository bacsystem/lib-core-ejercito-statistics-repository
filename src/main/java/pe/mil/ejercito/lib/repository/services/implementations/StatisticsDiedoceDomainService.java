package pe.mil.ejercito.lib.repository.services.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pe.mil.ejercito.lib.repository.components.mappers.IStatisticsDiedoceMapper;
import pe.mil.ejercito.lib.repository.components.validations.IStatisticsDiedoceValidation;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDiedoceDto;
import pe.mil.ejercito.lib.repository.repositories.IEpDocumentRegisterRepository;
import pe.mil.ejercito.lib.repository.repositories.IEpStatisticsDiedoceRepository;
import pe.mil.ejercito.lib.repository.repositories.entities.EpDocumentRegisterEntity;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDiedoceEntity;
import pe.mil.ejercito.lib.repository.services.contracts.IStatisticsDiedoceDomainService;
import pe.mil.ejercito.lib.utils.componets.enums.ProcessResult;
import pe.mil.ejercito.lib.utils.componets.enums.ResponseEnum;
import pe.mil.ejercito.lib.utils.componets.exceptions.CommonException;
import pe.mil.ejercito.lib.utils.services.base.ReactorServiceBase;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static pe.mil.ejercito.lib.utils.constants.BaseLoggerServicesConstant.*;

/**
 * StatisticsDiedoceDomainService
 * <p>
 * StatisticsDiedoceDomainService class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@Log4j2
@Service
public class StatisticsDiedoceDomainService extends ReactorServiceBase implements IStatisticsDiedoceDomainService {

    private final IEpStatisticsDiedoceRepository repository;
    private final IEpDocumentRegisterRepository documentRegisterRepository;
    private final IStatisticsDiedoceMapper mapper;

    public StatisticsDiedoceDomainService(final IEpStatisticsDiedoceRepository repository,
                                          final IEpDocumentRegisterRepository documentRegisterRepository,
                                          final IStatisticsDiedoceMapper mapper) {
        super("StatisticAeDomainService");
        this.repository = repository;
        this.documentRegisterRepository = documentRegisterRepository;
        this.mapper = mapper;
    }


    @Override
    public Mono<StatisticsDiedoceDto> saveEntity(StatisticsDiedoceDto dto) {
        return doOnSave(dto)
            .flatMap(this::doOnValidateResponse)
            .doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<StatisticsDiedoceDto> doOnValidateResponse(StatisticsDiedoceDto dto) {
        return IStatisticsDiedoceValidation.doOnValidationResponse().apply(dto)
            .flatMap(validation -> {
                if (ProcessResult.PROCESS_FAILED.equals(validation.getProcessResult())) {
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_ERROR, ResponseEnum.ERROR_INVALID_RESPONSE_DATA, validation.getErrors()));
                }
                return Mono.just(dto);
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_OR_UPDATE_VALIDATION_RESPONSE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    private Mono<StatisticsDiedoceDto> doOnSave(StatisticsDiedoceDto dto) {
        return Mono.just(dto)
            .flatMap(request -> {
                final EpStatisticsDiedoceEntity persistenceEntity = this.mapper.mapperToEntity(request);

                final Optional<EpDocumentRegisterEntity> documentRegisterEntity = this.documentRegisterRepository.findByUuId(request.getDocument());
                if (documentRegisterEntity.isEmpty()) {
                    log.error(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR);
                    return Mono.error(() -> new CommonException(MICROSERVICE_SERVICE_DOMAIN_ENTITY_SAVE_FIND_BY_UUID_NOT_EXIST_FORMAT_ERROR, ResponseEnum.NOT_FOUNT_ENTITY, List.of(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_UPDATE_BY_UUID_INVALID_FORMAT_ERROR)));
                }

                persistenceEntity.setUuId(UUID.randomUUID().toString());
                persistenceEntity.setStdDocument(documentRegisterEntity.get());
                persistenceEntity.setStCreatedDate(Instant.now());

                final EpStatisticsDiedoceEntity entityResult = this.repository.save(persistenceEntity);
                return Mono.just(this.mapper.mapperToDto(entityResult));
            }).doOnSuccess(success -> log.debug(MICROSERVICE_SERVICE_DOMAIN_ENTITY_ON_SAVE_FORMAT_SUCCESS))
            .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}