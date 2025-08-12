package pe.mil.ejercito.lib.repository.services.contracts;

import pe.mil.ejercito.lib.repository.dtos.StatisticsDieDto;
import pe.mil.ejercito.lib.utils.services.interfaces.ISaveDomainEntity;
import reactor.core.publisher.Mono;

/**
 * IStatisticsDieDomainService
 * <p>
 * IStatisticsDieDomainService interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
public interface IStatisticsDieDomainService extends
    ISaveDomainEntity<Mono<StatisticsDieDto>, StatisticsDieDto> {
}