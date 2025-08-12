package pe.mil.ejercito.lib.repository.components.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValueMappingStrategy;
import pe.mil.ejercito.lib.repository.dtos.StatisticsDipereDto;
import pe.mil.ejercito.lib.repository.repositories.entities.EpStatisticsDipereEntity;

import java.util.List;

/**
 * IStatisticsDipereMapper
 * <p>
 * IStatisticsDipereMapper interface.
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
public interface IStatisticsDipereMapper {

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

    @Mapping(target = "stdGrade", source = "grade")
    @Mapping(target = "stdVaoService", source = "vaoService")
    @Mapping(target = "stdVaoProfession", source = "vaoProfession")
    @Mapping(target = "stdVatSpecialty", source = "vatSpecialty")
    @Mapping(target = "stdVpcActionPersonal", source = "vpcActionPersonal")
    @Mapping(target = "stdGocRegimen", source = "gocRegimen")
    @Mapping(target = "stdGocName", source = "gocName")
    @Mapping(target = "stdGocCargo", source = "gocCargo")

    @Mapping(target = "stdVaoInf", source = "vaoInf")
    @Mapping(target = "stdVaoCab", source = "vaoCab")
    @Mapping(target = "stdVaoArt", source = "vaoArt")
    @Mapping(target = "stdVaoIng", source = "vaoIng")
    @Mapping(target = "stdVaoCom", source = "vaoCom")
    @Mapping(target = "stdVaoIntg", source = "vaoIntg")
    @Mapping(target = "stdVaoMg", source = "vaoMg")
    @Mapping(target = "stdVaoInte", source = "vaoInte")
    @Mapping(target = "stdVaoIntu", source = "vaoIntu")
    @Mapping(target = "stdVaoSje", source = "vaoSje")
    @Mapping(target = "stdVaoMed", source = "vaoMed")
    @Mapping(target = "stdVaoOdo", source = "vaoOdo")
    @Mapping(target = "stdVaoVet", source = "vaoVet")
    @Mapping(target = "stdVaoFar", source = "vaoFar")
    @Mapping(target = "stdVaoScyte", source = "vaoScyte")
    @Mapping(target = "stdVeoInt", source = "veoInt")
    @Mapping(target = "stdVeoVet", source = "veoVet")
    @Mapping(target = "stdVeoPsic", source = "veoPsic")
    @Mapping(target = "stdVeoPef", source = "veoPef")
    @Mapping(target = "stdVeoScyte", source = "veoScyte")
    @Mapping(target = "stdVaoVacant", source = "vaoVacant")
    @Mapping(target = "stdVeEmch", source = "veEmch")
    @Mapping(target = "stdVeVacant", source = "veVacant")
    @Mapping(target = "stdVatJs", source = "vatJs")
    @Mapping(target = "stdVatJ", source = "vatJ")
    @Mapping(target = "stdVatTco1", source = "vatTco1")
    @Mapping(target = "stdVatTco2", source = "vatTco2")
    @Mapping(target = "stdVatTco3", source = "vatTco3")
    @Mapping(target = "stdVatSo1", source = "vatSo1")
    @Mapping(target = "stdVatSo2", source = "vatSo2")
    @Mapping(target = "stdVatSo3", source = "vatSo3")
    @Mapping(target = "stdVptEte", source = "vptEte")
    @Mapping(target = "stdVptSm", source = "vptSm")
    @Mapping(target = "stdVptInst", source = "vptInst")
    @Mapping(target = "stdEtsmSgto1", source = "etsmSgto1")
    @Mapping(target = "stdEtsmSgto2", source = "etsmSgto2")
    @Mapping(target = "stdEtsmCabo", source = "etsmCabo")
    @Mapping(target = "stdEtsmSldo", source = "etsmSldo")
    @Mapping(target = "stdEtreeSgto1", source = "etreeSgto1")
    @Mapping(target = "stdEtreeSgto2", source = "etreeSgto2")
    @Mapping(target = "stdEtreeCabo", source = "etreeCabo")
    @Mapping(target = "stdVpcCandidates", source = "vpcCandidates")
    @Mapping(target = "stdVpcVacant", source = "vpcVacant")
    @Mapping(target = "stdVpcAssigned", source = "vpcAssigned")
    @Mapping(target = "stdGocVacant", source = "gocVacant")


    @Mapping(target = "stCreatedDate", source = "created")
    @Mapping(target = "stUpdatedDate", source = "updated")
    EpStatisticsDipereEntity mapperToEntity(StatisticsDipereDto source);

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


    @Mapping(target = "grade", source = "stdGrade")
    @Mapping(target = "vaoService", source = "stdVaoService")
    @Mapping(target = "vaoProfession", source = "stdVaoProfession")
    @Mapping(target = "vatSpecialty", source = "stdVatSpecialty")
    @Mapping(target = "vpcActionPersonal", source = "stdVpcActionPersonal")
    @Mapping(target = "gocRegimen", source = "stdGocRegimen")
    @Mapping(target = "gocName", source = "stdGocName")
    @Mapping(target = "gocCargo", source = "stdGocCargo")

    @Mapping(target = "vaoInf", source = "stdVaoInf")
    @Mapping(target = "vaoCab", source = "stdVaoCab")
    @Mapping(target = "vaoArt", source = "stdVaoArt")
    @Mapping(target = "vaoIng", source = "stdVaoIng")
    @Mapping(target = "vaoCom", source = "stdVaoCom")
    @Mapping(target = "vaoIntg", source = "stdVaoIntg")
    @Mapping(target = "vaoMg", source = "stdVaoMg")
    @Mapping(target = "vaoInte", source = "stdVaoInte")
    @Mapping(target = "vaoIntu", source = "stdVaoIntu")
    @Mapping(target = "vaoSje", source = "stdVaoSje")
    @Mapping(target = "vaoMed", source = "stdVaoMed")
    @Mapping(target = "vaoOdo", source = "stdVaoOdo")
    @Mapping(target = "vaoVet", source = "stdVaoVet")
    @Mapping(target = "vaoFar", source = "stdVaoFar")
    @Mapping(target = "vaoScyte", source = "stdVaoScyte")
    @Mapping(target = "veoInt", source = "stdVeoInt")
    @Mapping(target = "veoVet", source = "stdVeoVet")
    @Mapping(target = "veoPsic", source = "stdVeoPsic")
    @Mapping(target = "veoPef", source = "stdVeoPef")
    @Mapping(target = "veoScyte", source = "stdVeoScyte")


    @Mapping(target = "vaoVacant", source = "stdVaoVacant")
    @Mapping(target = "veEmch", source = "stdVeEmch")
    @Mapping(target = "veVacant", source = "stdVeVacant")
    @Mapping(target = "vatJs", source = "stdVatJs")
    @Mapping(target = "vatJ", source = "stdVatJ")
    @Mapping(target = "vatTco1", source = "stdVatTco1")
    @Mapping(target = "vatTco2", source = "stdVatTco2")
    @Mapping(target = "vatTco3", source = "stdVatTco3")
    @Mapping(target = "vatSo1", source = "stdVatSo1")
    @Mapping(target = "vatSo2", source = "stdVatSo2")
    @Mapping(target = "vatSo3", source = "stdVatSo3")
    @Mapping(target = "vptEte", source = "stdVptEte")
    @Mapping(target = "vptSm", source = "stdVptSm")
    @Mapping(target = "vptInst", source = "stdVptInst")
    @Mapping(target = "etsmSgto1", source = "stdEtsmSgto1")
    @Mapping(target = "etsmSgto2", source = "stdEtsmSgto2")
    @Mapping(target = "etsmCabo", source = "stdEtsmCabo")
    @Mapping(target = "etsmSldo", source = "stdEtsmSldo")
    @Mapping(target = "etreeSgto1", source = "stdEtreeSgto1")
    @Mapping(target = "etreeSgto2", source = "stdEtreeSgto2")
    @Mapping(target = "etreeCabo", source = "stdEtreeCabo")
    @Mapping(target = "vpcCandidates", source = "stdVpcCandidates")
    @Mapping(target = "vpcVacant", source = "stdVpcVacant")
    @Mapping(target = "vpcAssigned", source = "stdVpcAssigned")
    @Mapping(target = "gocVacant", source = "stdGocVacant")


    @Mapping(target = "created", source = "stCreatedDate")
    @Mapping(target = "updated", source = "stUpdatedDate")
    StatisticsDipereDto mapperToDto(EpStatisticsDipereEntity source);

    List<StatisticsDipereDto> mapperToList(Iterable<EpStatisticsDipereEntity> entities);
}