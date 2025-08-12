package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsCoedeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsCoedeEntity;

import java.util.List;

/**
 * IStatisticsCoedeMapper
 * <p>
 * IStatisticsCoedeMapper interface.
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
public interface IStatisticsCoedeMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stcDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stOtherState", source = "otherState")

    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stcCountry", source = "country")
    @Mapping(target = "stcYear", source = "year")
    @Mapping(target = "stcArms", source = "arms")
    @Mapping(target = "stcReason", source = "reason")
    @Mapping(target = "stcCareer", source = "career")
    @Mapping(target = "stcSchool", source = "school")
    @Mapping(target = "stcCourses", source = "courses")
    @Mapping(target = "stcM", source = "male")
    @Mapping(target = "stcF", source = "female")
    @Mapping(target = "stEne", source = "ene")
    @Mapping(target = "stFeb", source = "feb")
    @Mapping(target = "stMar", source = "mar")
    @Mapping(target = "stAbr", source = "abr")
    @Mapping(target = "stMay", source = "may")
    @Mapping(target = "stJun", source = "jun")
    @Mapping(target = "stJul", source = "jul")
    @Mapping(target = "stAgo", source = "ago")
    @Mapping(target = "stSet", source = "set")
    @Mapping(target = "stOct", source = "oct")
    @Mapping(target = "stNov", source = "nov")
    @Mapping(target = "stDic", source = "dic")
    @Mapping(target = "stcBasic", source = "basic")
    @Mapping(target = "stcIntermediate", source = "intermediate")
    @Mapping(target = "stcAdvanced", source = "advanced")
    @Mapping(target = "stcStte", source = "stte")
    @Mapping(target = "stcTte", source = "tte")
    @Mapping(target = "stcCap", source = "cap")
    @Mapping(target = "stcMy", source = "my")
    @Mapping(target = "stcTteCrl", source = "tteCrl")
    @Mapping(target = "stcCrl", source = "crl")
    @Mapping(target = "stcSo3", source = "so3")
    @Mapping(target = "stcSo2", source = "so2")
    @Mapping(target = "stcSo1", source = "so1")
    @Mapping(target = "stcTco3", source = "tco3")
    @Mapping(target = "stcTco2", source = "tco2")
    @Mapping(target = "stcTco1", source = "tco1")
    @Mapping(target = "stcTcoj", source = "tcoj")
    @Mapping(target = "stcTcojs", source = "tcojs")

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsCoedeEntity mapperToEntity(StatisticsCoedeDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stcDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")


    @Mapping(target = "country", source = "stcCountry")
    @Mapping(target = "year", source = "stcYear")
    @Mapping(target = "arms", source = "stcArms")
    @Mapping(target = "reason", source = "stcReason")
    @Mapping(target = "career", source = "stcCareer")
    @Mapping(target = "school", source = "stcSchool")
    @Mapping(target = "courses", source = "stcCourses")
    @Mapping(target = "male", source = "stcM")
    @Mapping(target = "female", source = "stcF")
    @Mapping(target = "ene", source = "stEne")
    @Mapping(target = "feb", source = "stFeb")
    @Mapping(target = "mar", source = "stMar")
    @Mapping(target = "abr", source = "stAbr")
    @Mapping(target = "may", source = "stMay")
    @Mapping(target = "jun", source = "stJun")
    @Mapping(target = "jul", source = "stJul")
    @Mapping(target = "ago", source = "stAgo")
    @Mapping(target = "set", source = "stSet")
    @Mapping(target = "oct", source = "stOct")
    @Mapping(target = "nov", source = "stNov")
    @Mapping(target = "dic", source = "stDic")
    @Mapping(target = "basic", source = "stcBasic")
    @Mapping(target = "intermediate", source = "stcIntermediate")
    @Mapping(target = "advanced", source = "stcAdvanced")
    @Mapping(target = "stte", source = "stcStte")
    @Mapping(target = "tte", source = "stcTte")
    @Mapping(target = "cap", source = "stcCap")
    @Mapping(target = "my", source = "stcMy")
    @Mapping(target = "tteCrl", source = "stcTteCrl")
    @Mapping(target = "crl", source = "stcCrl")
    @Mapping(target = "so3", source = "stcSo3")
    @Mapping(target = "so2", source = "stcSo2")
    @Mapping(target = "so1", source = "stcSo1")
    @Mapping(target = "tco3", source = "stcTco3")
    @Mapping(target = "tco2", source = "stcTco2")
    @Mapping(target = "tco1", source = "stcTco1")
    @Mapping(target = "tcoj", source = "stcTcoj")
    @Mapping(target = "tcojs", source = "stcTcojs")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsCoedeDto mapperToDto(EpStatisticsCoedeEntity source);

    List<StatisticsCoedeDto> mapperToList(Iterable<EpStatisticsCoedeEntity> entities);
}