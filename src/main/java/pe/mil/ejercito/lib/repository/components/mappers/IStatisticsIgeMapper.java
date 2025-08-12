package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsIgeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsIgeEntity;

import java.util.List;

/**
 * IStatisticsIgeMapper
 * <p>
 * IStatisticsIgeMapper interface.
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
public interface IStatisticsIgeMapper {
    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stiDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stOtherState", source = "otherState")

    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stiAqHousing", source = "aqHousing")
    @Mapping(target = "stiAqAbuseAuthority", source = "aqAbuseAuthority")
    @Mapping(target = "stiAqContracts", source = "aqContracts")
    @Mapping(target = "stiAqDebts", source = "aqDebts")
    @Mapping(target = "stiAqPension", source = "aqPension")
    @Mapping(target = "stiAqFamilyProblems", source = "aqFamilyProblems")
    @Mapping(target = "stiAqDecoration", source = "aqDecoration")
    @Mapping(target = "stiAqJudicialAssignment", source = "aqJudicialAssignment")
    @Mapping(target = "stiAqDeficienciesAdministrative", source = "aqDeficienciesAdministrative")
    @Mapping(target = "stiAqReview", source = "aqReview")
    @Mapping(target = "stiAqInvestigations", source = "aqInvestigations")
    @Mapping(target = "stiAqEvacuation", source = "aqEvacuation")
    @Mapping(target = "stiAqOther", source = "aqOther")
    @Mapping(target = "stiInspectionPositiveAspect", source = "inspectionPositiveAspect")
    @Mapping(target = "stiInspectionDeficiency", source = "inspectionDeficiency")
    @Mapping(target = "stiInspectionObservations", source = "inspectionObservations")
    @Mapping(target = "stiInspectionIrregularities", source = "inspectionIrregularities")
    @Mapping(target = "stiProvostTypification", source = "provostTypification")
    @Mapping(target = "stiProvostOo", source = "provostOo")
    @Mapping(target = "stiProvostTcos", source = "provostTcos")
    @Mapping(target = "stiProvostTroop", source = "provostTroop")
    @Mapping(target = "stiMindefInformation", source = "mindefInformation")
    @Mapping(target = "stiMindefRecommendations", source = "mindefRecommendations")
    @Mapping(target = "stiMindefImplemented", source = "mindefImplemented")
    @Mapping(target = "stiMindefProgress", source = "mindefProgress")
    @Mapping(target = "stiMindefPending", source = "mindefPending")
    @Mapping(target = "stiMindefAdvance", source = "mindefAdvance")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsIgeEntity mapperToEntity(StatisticsIgeDto source);


    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stiDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")


    @Mapping(target = "aqHousing", source = "stiAqHousing")
    @Mapping(target = "aqAbuseAuthority", source = "stiAqAbuseAuthority")
    @Mapping(target = "aqContracts", source = "stiAqContracts")
    @Mapping(target = "aqDebts", source = "stiAqDebts")
    @Mapping(target = "aqPension", source = "stiAqPension")
    @Mapping(target = "aqFamilyProblems", source = "stiAqFamilyProblems")
    @Mapping(target = "aqDecoration", source = "stiAqDecoration")
    @Mapping(target = "aqJudicialAssignment", source = "stiAqJudicialAssignment")
    @Mapping(target = "aqDeficienciesAdministrative", source = "stiAqDeficienciesAdministrative")
    @Mapping(target = "aqReview", source = "stiAqReview")
    @Mapping(target = "aqInvestigations", source = "stiAqInvestigations")
    @Mapping(target = "aqEvacuation", source = "stiAqEvacuation")
    @Mapping(target = "aqOther", source = "stiAqOther")
    @Mapping(target = "inspectionPositiveAspect", source = "stiInspectionPositiveAspect")
    @Mapping(target = "inspectionDeficiency", source = "stiInspectionDeficiency")
    @Mapping(target = "inspectionObservations", source = "stiInspectionObservations")
    @Mapping(target = "inspectionIrregularities", source = "stiInspectionIrregularities")
    @Mapping(target = "provostTypification", source = "stiProvostTypification")
    @Mapping(target = "provostOo", source = "stiProvostOo")
    @Mapping(target = "provostTcos", source = "stiProvostTcos")
    @Mapping(target = "provostTroop", source = "stiProvostTroop")
    @Mapping(target = "mindefInformation", source = "stiMindefInformation")
    @Mapping(target = "mindefRecommendations", source = "stiMindefRecommendations")
    @Mapping(target = "mindefImplemented", source = "stiMindefImplemented")
    @Mapping(target = "mindefProgress", source = "stiMindefProgress")
    @Mapping(target = "mindefPending", source = "stiMindefPending")
    @Mapping(target = "mindefAdvance", source = "stiMindefAdvance")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsIgeDto mapperToDto(EpStatisticsIgeEntity source);

    List<StatisticsIgeDto> mapperToList(Iterable<EpStatisticsIgeEntity> entities);
}