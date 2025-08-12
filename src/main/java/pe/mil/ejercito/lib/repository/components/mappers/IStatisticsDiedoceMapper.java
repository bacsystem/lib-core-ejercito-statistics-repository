package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDiedoceDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDiedoceEntity;

import java.util.List;

/**
 * IStatisticsDiedoceMapper
 * <p>
 * IStatisticsDiedoceMapper interface.
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
public interface IStatisticsDiedoceMapper {

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

    @Mapping(target = "stCcmm", source = "cmm")
    @Mapping(target = "stdImOo3", source = "imOo3")
    @Mapping(target = "stdImTcos3", source = "imTcos3")
    @Mapping(target = "stdImOo4", source = "imOo4")
    @Mapping(target = "stdImTcos4", source = "imTcos4")
    @Mapping(target = "stdImOo5", source = "imOo5")
    @Mapping(target = "stdImTcos5", source = "imTcos5")
    @Mapping(target = "stdParA3", source = "parA3")
    @Mapping(target = "stdParD3", source = "parD3")
    @Mapping(target = "stdParA4", source = "parA4")
    @Mapping(target = "stdParD4", source = "parD4")
    @Mapping(target = "stdParA5", source = "parA5")
    @Mapping(target = "stdParD5", source = "parD5")
    @Mapping(target = "stdPaM3", source = "paM3")
    @Mapping(target = "stdPaF3", source = "paF3")
    @Mapping(target = "stdPaM4", source = "paM4")
    @Mapping(target = "stdPaF4", source = "paF4")
    @Mapping(target = "stdPaM5", source = "paM5")
    @Mapping(target = "stdPaF5", source = "paF5")
    @Mapping(target = "stdVpeoDetail", source = "vpeoDetail")
    @Mapping(target = "stdVpeoSchool", source = "vpeoSchool")
    @Mapping(target = "stdVpeoCourse", source = "vpeoCourse")
    @Mapping(target = "stdVpeoVacant", source = "vpeoVacant")
    @Mapping(target = "stdVpetGrade", source = "vpetGrade")
    @Mapping(target = "stdVpetSchool", source = "vpetSchool")
    @Mapping(target = "stdVpetCourse", source = "vpetCourse")
    @Mapping(target = "stdVpetVacant", source = "vpetVacant")
    @Mapping(target = "stdPcePais", source = "pcePais")
    @Mapping(target = "stdPceOo", source = "pceOo")
    @Mapping(target = "stdPceCad", source = "pceCad")
    @Mapping(target = "stdPceTcos", source = "pceTcos")
    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDiedoceEntity mapperToEntity(StatisticsDiedoceDto source);

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


    @Mapping(target = "cmm", source = "stCcmm")
    @Mapping(target = "imOo3", source = "stdImOo3")
    @Mapping(target = "imTcos3", source = "stdImTcos3")
    @Mapping(target = "imOo4", source = "stdImOo4")
    @Mapping(target = "imTcos4", source = "stdImTcos4")
    @Mapping(target = "imOo5", source = "stdImOo5")
    @Mapping(target = "imTcos5", source = "stdImTcos5")
    @Mapping(target = "parA3", source = "stdParA3")
    @Mapping(target = "parD3", source = "stdParD3")
    @Mapping(target = "parA4", source = "stdParA4")
    @Mapping(target = "parD4", source = "stdParD4")
    @Mapping(target = "parA5", source = "stdParA5")
    @Mapping(target = "parD5", source = "stdParD5")
    @Mapping(target = "paM3", source = "stdPaM3")
    @Mapping(target = "paF3", source = "stdPaF3")
    @Mapping(target = "paM4", source = "stdPaM4")
    @Mapping(target = "paF4", source = "stdPaF4")
    @Mapping(target = "paM5", source = "stdPaM5")
    @Mapping(target = "paF5", source = "stdPaF5")
    @Mapping(target = "vpeoDetail", source = "stdVpeoDetail")
    @Mapping(target = "vpeoSchool", source = "stdVpeoSchool")
    @Mapping(target = "vpeoCourse", source = "stdVpeoCourse")
    @Mapping(target = "vpeoVacant", source = "stdVpeoVacant")
    @Mapping(target = "vpetGrade", source = "stdVpetGrade")
    @Mapping(target = "vpetSchool", source = "stdVpetSchool")
    @Mapping(target = "vpetCourse", source = "stdVpetCourse")
    @Mapping(target = "vpetVacant", source = "stdVpetVacant")
    @Mapping(target = "pcePais", source = "stdPcePais")
    @Mapping(target = "pceOo", source = "stdPceOo")
    @Mapping(target = "pceCad", source = "stdPceCad")
    @Mapping(target = "pceTcos", source = "stdPceTcos")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDiedoceDto mapperToDto(EpStatisticsDiedoceEntity source);

    List<StatisticsDiedoceDto> mapperToList(Iterable<EpStatisticsDiedoceEntity> entities);
}