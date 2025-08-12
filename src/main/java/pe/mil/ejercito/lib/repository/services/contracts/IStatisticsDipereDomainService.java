package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDipereDto;
import pe.mil.ejercito.lib.utils.services.interfaces.ISaveDomainEntity;
import reactor.core.publisher.Mono;

/**
 * IStatisticsDipereDomainService
 * <p>
 * IStatisticsDipereDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDipereDomainService extends

    ISaveDomainEntity<Mono<StatisticsDipereDto>, StatisticsDipereDto> {
}