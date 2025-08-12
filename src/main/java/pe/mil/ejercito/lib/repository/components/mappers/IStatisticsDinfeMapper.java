package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDinfeDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDinfeEntity;

import java.util.List;

/**
 * IStatisticsDinfeMapper
 * <p>
 * IStatisticsDinfeMapper interface.
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
public interface IStatisticsDinfeMapper {

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

    @Mapping(target = "stdDetail", source = "detail")
    @Mapping(target = "stdAges", source = "ages")
    @Mapping(target = "stdMuseum", source = "museum")
    @Mapping(target = "stdFee", source = "fee")
    @Mapping(target = "stdDescription", source = "description")
    @Mapping(target = "stEneA", source = "eneA")
    @Mapping(target = "stEneB", source = "eneB")
    @Mapping(target = "stEneC", source = "eneC")
    @Mapping(target = "stFebA", source = "febA")
    @Mapping(target = "stFebB", source = "febB")
    @Mapping(target = "stFebC", source = "febC")
    @Mapping(target = "stMarA", source = "marA")
    @Mapping(target = "stMarB", source = "marB")
    @Mapping(target = "stMarC", source = "marC")
    @Mapping(target = "stAbrA", source = "abrA")
    @Mapping(target = "stAbrB", source = "abrB")
    @Mapping(target = "stAbrC", source = "abrC")
    @Mapping(target = "stMayA", source = "mayA")
    @Mapping(target = "stMayB", source = "mayB")
    @Mapping(target = "stMayC", source = "mayC")
    @Mapping(target = "stJunA", source = "junA")
    @Mapping(target = "stJunB", source = "junB")
    @Mapping(target = "stJunC", source = "junC")
    @Mapping(target = "stJulA", source = "julA")
    @Mapping(target = "stJulB", source = "julB")
    @Mapping(target = "stJulC", source = "julC")
    @Mapping(target = "stAgoA", source = "agoA")
    @Mapping(target = "stAgoB", source = "agoB")
    @Mapping(target = "stAgoC", source = "agoC")
    @Mapping(target = "stSetA", source = "septA")
    @Mapping(target = "stSetB", source = "septB")
    @Mapping(target = "stSetC", source = "septC")
    @Mapping(target = "stOctA", source = "octA")
    @Mapping(target = "stOctB", source = "octB")
    @Mapping(target = "stOctC", source = "octC")
    @Mapping(target = "stNovA", source = "novA")
    @Mapping(target = "stNovB", source = "novB")
    @Mapping(target = "stNovC", source = "novC")
    @Mapping(target = "stDicA", source = "dicA")
    @Mapping(target = "stDicB", source = "dicB")
    @Mapping(target = "stDicC", source = "dicC")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDinfeEntity mapperToEntity(StatisticsDinfeDto source);

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

    @Mapping(target = "detail", source = "stdDetail")
    @Mapping(target = "ages", source = "stdAges")
    @Mapping(target = "museum", source = "stdMuseum")
    @Mapping(target = "fee", source = "stdFee")
    @Mapping(target = "description", source = "stdDescription")
    @Mapping(target = "eneA", source = "stEneA")
    @Mapping(target = "eneB", source = "stEneB")
    @Mapping(target = "eneC", source = "stEneC")
    @Mapping(target = "febA", source = "stFebA")
    @Mapping(target = "febB", source = "stFebB")
    @Mapping(target = "febC", source = "stFebC")
    @Mapping(target = "marA", source = "stMarA")
    @Mapping(target = "marB", source = "stMarB")
    @Mapping(target = "marC", source = "stMarC")
    @Mapping(target = "abrA", source = "stAbrA")
    @Mapping(target = "abrB", source = "stAbrB")
    @Mapping(target = "abrC", source = "stAbrC")
    @Mapping(target = "mayA", source = "stMayA")
    @Mapping(target = "mayB", source = "stMayB")
    @Mapping(target = "mayC", source = "stMayC")
    @Mapping(target = "junA", source = "stJunA")
    @Mapping(target = "junB", source = "stJunB")
    @Mapping(target = "junC", source = "stJunC")
    @Mapping(target = "julA", source = "stJulA")
    @Mapping(target = "julB", source = "stJulB")
    @Mapping(target = "julC", source = "stJulC")
    @Mapping(target = "agoA", source = "stAgoA")
    @Mapping(target = "agoB", source = "stAgoB")
    @Mapping(target = "agoC", source = "stAgoC")
    @Mapping(target = "septA", source = "stSetA")
    @Mapping(target = "septB", source = "stSetB")
    @Mapping(target = "septC", source = "stSetC")
    @Mapping(target = "octA", source = "stOctA")
    @Mapping(target = "octB", source = "stOctB")
    @Mapping(target = "octC", source = "stOctC")
    @Mapping(target = "novA", source = "stNovA")
    @Mapping(target = "novB", source = "stNovB")
    @Mapping(target = "novC", source = "stNovC")
    @Mapping(target = "dicA", source = "stDicA")
    @Mapping(target = "dicB", source = "stDicB")
    @Mapping(target = "dicC", source = "stDicC")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDinfeDto mapperToDto(EpStatisticsDinfeEntity source);

    List<StatisticsDinfeDto> mapperToList(Iterable<EpStatisticsDinfeEntity> entities);
}