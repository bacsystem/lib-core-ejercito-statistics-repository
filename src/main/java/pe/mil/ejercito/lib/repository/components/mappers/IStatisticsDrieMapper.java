package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDrieDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDrieEntity;

import java.util.List;

/**
 * IStatisticsDrieMapper
 * <p>
 * IStatisticsDrieMapper interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL)
public interface IStatisticsDrieMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stdDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stOtherState", source = "otherState")

    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stPais", source = "pais")
    @Mapping(target = "stdAeOo", source = "aeOo")
    @Mapping(target = "stdAeTcos", source = "aeTcos")
    @Mapping(target = "stdApOo", source = "apOo")
    @Mapping(target = "stdApTcos", source = "apTcos")
    @Mapping(target = "stdPaeContinent", source = "paeContinent")
    @Mapping(target = "stdVomMyPostulate", source = "vomMyPostulate")
    @Mapping(target = "stdVomMySelected", source = "vomMySelected")
    @Mapping(target = "stdVomCapPostulate", source = "vomCapPostulate")
    @Mapping(target = "stdVomCapSelected", source = "vomCapSelected")
    @Mapping(target = "stdVomPostulate", source = "vomPostulate")
    @Mapping(target = "stdVomSelected", source = "vomSelected")
    @Mapping(target = "stdVtmPostulate", source = "vtmPostulate")
    @Mapping(target = "stdVtmSelected", source = "vtmSelected")
    @Mapping(target = "stdPmeeo", source = "pmeeo")
    @Mapping(target = "stdPmeec", source = "pmeec")
    @Mapping(target = "stdPmeet", source = "pmeet")
    @Mapping(target = "stdPmees", source = "pmees")
    @Mapping(target = "stdPmleo", source = "pmleo")
    @Mapping(target = "stdPmlet", source = "pmlet")
    @Mapping(target = "stdPmles", source = "pmles")
    @Mapping(target = "stdRpliRbHost", source = "rpliRbHost")
    @Mapping(target = "stdRpliRbGuest", source = "rpliRbGuest")
    @Mapping(target = "stdRpliRrHost", source = "rpliRrHost")
    @Mapping(target = "stdRpliRrGuest", source = "rpliRrGuest")
    @Mapping(target = "stdRpliRcHost", source = "rpliRcHost")
    @Mapping(target = "stdRpliRcGuest", source = "rpliRcGuest")
    @Mapping(target = "stdRpliMeeting", source = "rpliMeeting")
    @Mapping(target = "stdRplSignedAgreements", source = "rplSignedAgreements")
    @Mapping(target = "stdRplScheduledAgreements", source = "rplScheduledAgreements")
    @Mapping(target = "stdRplExecutedAgreements", source = "rplExecutedAgreements")


    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDrieEntity mapperToEntity(StatisticsDrieDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stdDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")


    @Mapping(target = "pais", source = "stPais")
    @Mapping(target = "aeOo", source = "stdAeOo")
    @Mapping(target = "aeTcos", source = "stdAeTcos")
    @Mapping(target = "apOo", source = "stdApOo")
    @Mapping(target = "apTcos", source = "stdApTcos")
    @Mapping(target = "paeContinent", source = "stdPaeContinent")
    @Mapping(target = "vomMyPostulate", source = "stdVomMyPostulate")
    @Mapping(target = "vomMySelected", source = "stdVomMySelected")
    @Mapping(target = "vomCapPostulate", source = "stdVomCapPostulate")
    @Mapping(target = "vomCapSelected", source = "stdVomCapSelected")
    @Mapping(target = "vomPostulate", source = "stdVomPostulate")
    @Mapping(target = "vomSelected", source = "stdVomSelected")
    @Mapping(target = "vtmPostulate", source = "stdVtmPostulate")
    @Mapping(target = "vtmSelected", source = "stdVtmSelected")
    @Mapping(target = "pmeeo", source = "stdPmeeo")
    @Mapping(target = "pmeec", source = "stdPmeec")
    @Mapping(target = "pmeet", source = "stdPmeet")
    @Mapping(target = "pmees", source = "stdPmees")
    @Mapping(target = "pmleo", source = "stdPmleo")
    @Mapping(target = "pmlet", source = "stdPmlet")
    @Mapping(target = "pmles", source = "stdPmles")
    @Mapping(target = "pmlea", source = "stdPmlea")
    @Mapping(target = "rpliRbHost", source = "stdRpliRbHost")
    @Mapping(target = "rpliRbGuest", source = "stdRpliRbGuest")
    @Mapping(target = "rpliRrHost", source = "stdRpliRrHost")
    @Mapping(target = "rpliRrGuest", source = "stdRpliRrGuest")
    @Mapping(target = "rpliRcHost", source = "stdRpliRcHost")
    @Mapping(target = "rpliRcGuest", source = "stdRpliRcGuest")
    @Mapping(target = "rpliMeeting", source = "stdRpliMeeting")
    @Mapping(target = "rplSignedAgreements", source = "stdRplSignedAgreements")
    @Mapping(target = "rplScheduledAgreements", source = "stdRplScheduledAgreements")
    @Mapping(target = "rplExecutedAgreements", source = "stdRplExecutedAgreements")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDrieDto mapperToDto(EpStatisticsDrieEntity source);

    List<StatisticsDrieDto> mapperToList(Iterable<EpStatisticsDrieEntity> entities);
}