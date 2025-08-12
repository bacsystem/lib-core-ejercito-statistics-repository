package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * EpStatisticsDipereEntity
 * <p>
 * EpStatisticsDipereEntity class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "EP_STATISTICS_DIPERE", indexes = {
    @Index(name = "EP_STATISTICS_DIPERE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDipereEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DIPERE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DIPERE_SEQ", sequenceName = "EP_STATISTICS_DIPERE_SEQ", allocationSize = 1)
    @Column(name = "STD_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STD_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STD_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stdDocument;

    @Size(max = 500)
    @Column(name = "STD_GRADE", length = 500)
    private String stdGrade;

    @Column(name = "STD_VAO_INF")
    private Double stdVaoInf;

    @Column(name = "STD_VAO_CAB")
    private Double stdVaoCab;

    @Column(name = "STD_VAO_ART")
    private Double stdVaoArt;

    @Column(name = "STD_VAO_ING")
    private Double stdVaoIng;

    @Column(name = "STD_VAO_COM")
    private Double stdVaoCom;

    @Column(name = "STD_VAO_INTG")
    private Double stdVaoIntg;

    @Column(name = "STD_VAO_MG")
    private Double stdVaoMg;

    @Column(name = "STD_VAO_INTE")
    private Double stdVaoInte;

    @Column(name = "STD_VAO_INTU")
    private Double stdVaoIntu;

    @Column(name = "STD_VAO_SJE")
    private Double stdVaoSje;

    @Column(name = "STD_VAO_MED")
    private Double stdVaoMed;

    @Column(name = "STD_VAO_ODO")
    private Double stdVaoOdo;

    @Column(name = "STD_VAO_VET")
    private Double stdVaoVet;

    @Column(name = "STD_VAO_FAR")
    private Double stdVaoFar;

    @Column(name = "STD_VAO_SCYTE")
    private Double stdVaoScyte;

    @Column(name = "STD_VEO_INT")
    private Double stdVeoInt;

    @Column(name = "STD_VEO_VET")
    private Double stdVeoVet;

    @Column(name = "STD_VEO_PSIC")
    private Double stdVeoPsic;

    @Column(name = "STD_VEO_PEF")
    private Double stdVeoPef;

    @Column(name = "STD_VEO_SCYTE")
    private Double stdVeoScyte;

    @Size(max = 500)
    @Column(name = "STD_VAO_SERVICE", length = 500)
    private String stdVaoService;

    @Size(max = 500)
    @Column(name = "STD_VAO_PROFESSION", length = 500)
    private String stdVaoProfession;

    @Column(name = "STD_VAO_VACANT")
    private Double stdVaoVacant;

    @Size(max = 500)
    @Column(name = "STD_VE_EMCH", length = 500)
    private String stdVeEmch;

    @Column(name = "STD_VE_VACANT")
    private Double stdVeVacant;

    @Size(max = 500)
    @Column(name = "STD_VAT_SPECIALTY", length = 500)
    private String stdVatSpecialty;

    @Column(name = "STD_VAT_JS")
    private Double stdVatJs;

    @Column(name = "STD_VAT_J")
    private Double stdVatJ;

    @Column(name = "STD_VAT_TCO1")
    private Double stdVatTco1;

    @Column(name = "STD_VAT_TCO2")
    private Double stdVatTco2;

    @Column(name = "STD_VAT_TCO3")
    private Double stdVatTco3;

    @Column(name = "STD_VAT_SO1")
    private Double stdVatSo1;

    @Column(name = "STD_VAT_SO2")
    private Double stdVatSo2;

    @Column(name = "STD_VAT_SO3")
    private Double stdVatSo3;

    @Column(name = "STD_VPT_ETE")
    private Double stdVptEte;

    @Column(name = "STD_VPT_SM")
    private Double stdVptSm;

    @Column(name = "STD_VPT_INST")
    private Double stdVptInst;

    @Column(name = "STD_ETSM_SGTO1")
    private Double stdEtsmSgto1;

    @Column(name = "STD_ETSM_SGTO2")
    private Double stdEtsmSgto2;

    @Column(name = "STD_ETSM_CABO")
    private Double stdEtsmCabo;

    @Column(name = "STD_ETSM_SLDO")
    private Double stdEtsmSldo;

    @Column(name = "STD_ETREE_SGTO1")
    private Double stdEtreeSgto1;

    @Column(name = "STD_ETREE_SGTO2")
    private Double stdEtreeSgto2;

    @Column(name = "STD_ETREE_CABO")
    private Double stdEtreeCabo;

    @Size(max = 500)
    @Column(name = "STD_VPC_ACTION_PERSONAL", length = 500)
    private String stdVpcActionPersonal;

    @Column(name = "STD_VPC_CANDIDATES")
    private Double stdVpcCandidates;

    @Column(name = "STD_VPC_VACANT")
    private Double stdVpcVacant;

    @Column(name = "STD_VPC_ASSIGNED")
    private Double stdVpcAssigned;

    @Size(max = 500)
    @Column(name = "STD_GOC_REGIMEN", length = 500)
    private String stdGocRegimen;

    @Size(max = 500)
    @Column(name = "STD_GOC_NAME", length = 500)
    private String stdGocName;

    @Size(max = 500)
    @Column(name = "STD_GOC_CARGO", length = 500)
    private String stdGocCargo;

    @Column(name = "STD_GOC_VACANT")
    private Double stdGocVacant;


    @Size(max = 500)
    @Column(name = "ST_PLACE", length = 500)
    private String stPlace;

    @Size(max = 400)
    @Column(name = "ST_DIVISION", length = 400)
    private String stDivision;

    @Size(max = 400)
    @Column(name = "ST_DEPENDENCY", length = 400)
    private String stDependency;

    @Size(max = 400)
    @Column(name = "ST_OTHER_STATE", length = 400)
    private String stOtherState;

    @Size(max = 10)
    @Column(name = "ST_NRO", length = 10)
    private String stNro;

    @Column(name = "ST_TOTAL", precision = 10, scale = 3)
    private BigDecimal stTotal;

    @Size(max = 200)
    @Column(name = "ST_TYPE_SHEET", length = 200)
    private String stTypeSheet;

    @Size(max = 200)
    @Column(name = "ST_NAME_SHEET", length = 200)
    private String stNameSheet;

    @Size(max = 120)
    @Column(name = "ST_OBS", length = 120)
    private String stObs;

    @NotNull
    @Column(name = "ST_CREATED_DATE", nullable = false)
    private Instant stCreatedDate;

    @Column(name = "ST_UPDATED_DATE")
    private Instant stUpdatedDate;

}