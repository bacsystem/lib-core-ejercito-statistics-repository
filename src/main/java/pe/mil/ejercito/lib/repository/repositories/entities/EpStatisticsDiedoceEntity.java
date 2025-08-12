package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsDiedoceEntity
 * <p>
 * EpStatisticsDiedoceEntity class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EP_STATISTICS_DIEDOCE", indexes = {
    @Index(name = "EP_STATISTICS_DIEDOCE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDiedoceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DIEDOCE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DIEDOCE_SEQ", sequenceName = "EP_STATISTICS_DIEDOCE_SEQ", allocationSize = 1)
    @Column(name = "STD_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STD_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STD_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stdDocument;


    @Size(max = 500)
    @Column(name = "ST_CCMM", length = 500)
    private String stCcmm;

    @Column(name = "STD_IM_OO_3")
    private Double stdImOo3;

    @Column(name = "STD_IM_TCOS_3")
    private Double stdImTcos3;

    @Column(name = "STD_IM_OO_4")
    private Double stdImOo4;

    @Column(name = "STD_IM_TCOS_4")
    private Double stdImTcos4;

    @Column(name = "STD_IM_OO_5")
    private Double stdImOo5;

    @Column(name = "STD_IM_TCOS_5")
    private Double stdImTcos5;

    @Column(name = "STD_PAR_A_3")
    private Double stdParA3;

    @Column(name = "STD_PAR_D_3")
    private Double stdParD3;

    @Column(name = "STD_PAR_A_4")
    private Double stdParA4;

    @Column(name = "STD_PAR_D_4")
    private Double stdParD4;

    @Column(name = "STD_PAR_A_5")
    private Double stdParA5;

    @Column(name = "STD_PAR_D_5")
    private Double stdParD5;

    @Column(name = "STD_PA_M_3")
    private Double stdPaM3;

    @Column(name = "STD_PA_F_3")
    private Double stdPaF3;

    @Column(name = "STD_PA_M_4")
    private Double stdPaM4;

    @Column(name = "STD_PA_F_4")
    private Double stdPaF4;

    @Column(name = "STD_PA_M_5")
    private Double stdPaM5;

    @Column(name = "STD_PA_F_5")
    private Double stdPaF5;

    @Size(max = 500)
    @Column(name = "STD_VPEO_DETAIL", length = 500)
    private String stdVpeoDetail;

    @Size(max = 500)
    @Column(name = "STD_VPEO_SCHOOL", length = 500)
    private String stdVpeoSchool;

    @Size(max = 500)
    @Column(name = "STD_VPEO_COURSE", length = 500)
    private String stdVpeoCourse;

    @Column(name = "STD_VPEO_VACANT")
    private Double stdVpeoVacant;

    @Size(max = 500)
    @Column(name = "STD_VPET_GRADE", length = 500)
    private String stdVpetGrade;

    @Size(max = 500)
    @Column(name = "STD_VPET_SCHOOL", length = 500)
    private String stdVpetSchool;

    @Size(max = 500)
    @Column(name = "STD_VPET_COURSE", length = 500)
    private String stdVpetCourse;

    @Column(name = "STD_VPET_VACANT")
    private Double stdVpetVacant;

    @Size(max = 500)
    @Column(name = "STD_PCE_PAIS", length = 500)
    private String stdPcePais;

    @Column(name = "STD_PCE_OO")
    private Double stdPceOo;

    @Column(name = "STD_PCE_CAD")
    private Double stdPceCad;

    @Column(name = "STD_PCE_TCOS")
    private Double stdPceTcos;

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

    @Column(name = "ST_TOTAL")
    private Double stTotal;

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