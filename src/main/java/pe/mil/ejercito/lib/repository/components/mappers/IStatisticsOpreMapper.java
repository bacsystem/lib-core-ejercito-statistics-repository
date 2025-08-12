package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsOpreDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsOpreEntity;

import java.util.List;

/**
 * IStatisticsOpreMapper
 * <p>
 * IStatisticsOpreMapper interface.
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
public interface IStatisticsOpreMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "stoDocument.uuId", source = "document")
    @Mapping(target = "stPlace", source = "place")
    @Mapping(target = "stDivision", source = "division")
    @Mapping(target = "stDependency", source = "dependency")
    @Mapping(target = "stTypeSheet", source = "typeSheet")
    @Mapping(target = "stNameSheet", source = "nameSheet")
    @Mapping(target = "stOtherState", source = "otherState")

    @Mapping(target = "stObs", source = "obs")
    @Mapping(target = "stTotal", source = "total")
    @Mapping(target = "stNro", source = "nro")

    @Mapping(target = "stoPreDetail", source = "preDetail")
    @Mapping(target = "stoProdProgram", source = "prodProgram")
    @Mapping(target = "stoPrePia", source = "prePia")
    @Mapping(target = "stoPrePim", source = "prePim")
    @Mapping(target = "stoProdPim", source = "prodPim")
    @Mapping(target = "stoProdExec", source = "prodExec")
    @Mapping(target = "stoProdBalance", source = "prodBalance")
    @Mapping(target = "stoMindefPia", source = "mindefPia")
    @Mapping(target = "stoMindefPim", source = "mindefPim")
    @Mapping(target = "stoMindefCertificate", source = "mindefCertificate")
    @Mapping(target = "stoMindefYear", source = "mindefYear")
    @Mapping(target = "stoMindefMonth", source = "mindefMonth")
    @Mapping(target = "stoMindefAccrual", source = "mindefAccrual")
    @Mapping(target = "stoMindefTurned", source = "mindefTurned")
    @Mapping(target = "stoMindefAdvance", source = "mindefAdvance")
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

    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsOpreEntity mapperToEntity(StatisticsOpreDto source);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "uuId", source = "uuId")
    @Mapping(target = "document", source = "stoDocument.uuId")
    @Mapping(target = "place", source = "stPlace")
    @Mapping(target = "division", source = "stDivision")
    @Mapping(target = "dependency", source = "stDependency")
    @Mapping(target = "otherState", source = "stOtherState")
    @Mapping(target = "total", source = "stTotal")
    @Mapping(target = "nro", source = "stNro")
    @Mapping(target = "typeSheet", source = "stTypeSheet")
    @Mapping(target = "nameSheet", source = "stNameSheet")
    @Mapping(target = "obs", source = "stObs")


    @Mapping(target = "preDetail", source = "stoPreDetail")
    @Mapping(target = "prodProgram", source = "stoProdProgram")
    @Mapping(target = "prePia", source = "stoPrePia")
    @Mapping(target = "prePim", source = "stoPrePim")
    @Mapping(target = "prodPim", source = "stoProdPim")
    @Mapping(target = "prodExec", source = "stoProdExec")
    @Mapping(target = "prodBalance", source = "stoProdBalance")
    @Mapping(target = "mindefPia", source = "stoMindefPia")
    @Mapping(target = "mindefPim", source = "stoMindefPim")
    @Mapping(target = "mindefCertificate", source = "stoMindefCertificate")
    @Mapping(target = "mindefYear", source = "stoMindefYear")
    @Mapping(target = "mindefMonth", source = "stoMindefMonth")
    @Mapping(target = "mindefAccrual", source = "stoMindefAccrual")
    @Mapping(target = "mindefTurned", source = "stoMindefTurned")
    @Mapping(target = "mindefAdvance", source = "stoMindefAdvance")
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


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsOpreDto mapperToDto(EpStatisticsOpreEntity source);

    List<StatisticsOpreDto> mapperToList(Iterable<EpStatisticsOpreEntity> entities);
}