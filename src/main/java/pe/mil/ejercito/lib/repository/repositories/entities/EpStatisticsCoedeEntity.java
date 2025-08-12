package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;


/**
 * EpStatisticsCoedeEntity
 * <p>
 * EpStatisticsCoedeEntity class.
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
@Table(name = "EP_STATISTICS_COEDE", indexes = {
    @Index(name = "EP_STATISTICS_COEDE_UN1", columnList = "STC_UUID", unique = true)
})
public class EpStatisticsCoedeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_COEDE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_COEDE_SEQ", sequenceName = "EP_STATISTICS_COEDE_SEQ", allocationSize = 1)
    @Column(name = "STC_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STC_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STC_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stcDocument;

    @Size(max = 500)
    @Column(name = "STC_COUNTRY", length = 500)
    private String stcCountry;

    @Size(max = 500)
    @Column(name = "STC_YEAR", length = 500)
    private String stcYear;

    @Size(max = 500)
    @Column(name = "STC_ARMS", length = 500)
    private String stcArms;

    @Size(max = 500)
    @Column(name = "STC_REASON", length = 500)
    private String stcReason;

    @Size(max = 500)
    @Column(name = "STC_CAREER", length = 500)
    private String stcCareer;

    @Size(max = 500)
    @Column(name = "STC_SCHOOL", length = 500)
    private String stcSchool;

    @Size(max = 500)
    @Column(name = "STC_COURSES", length = 500)
    private String stcCourses;

    @Column(name = "STC_M")
    private Double stcM;

    @Column(name = "STC_F")
    private Double stcF;

    @Column(name = "ST_ENE")
    private Double stEne;

    @Column(name = "ST_FEB")
    private Double stFeb;

    @Column(name = "ST_MAR")
    private Double stMar;

    @Column(name = "ST_ABR")
    private Double stAbr;

    @Column(name = "ST_MAY")
    private Double stMay;

    @Column(name = "ST_JUN")
    private Double stJun;

    @Column(name = "ST_JUL")
    private Double stJul;

    @Column(name = "ST_AGO")
    private Double stAgo;

    @Column(name = "ST_SET")
    private Double stSet;

    @Column(name = "ST_OCT")
    private Double stOct;

    @Column(name = "ST_NOV")
    private Double stNov;

    @Column(name = "ST_DIC")
    private Double stDic;

    @Column(name = "STC_BASIC")
    private Double stcBasic;

    @Column(name = "STC_INTERMEDIATE")
    private Double stcIntermediate;

    @Column(name = "STC_ADVANCED")
    private Double stcAdvanced;

    @Column(name = "STC_STTE")
    private Double stcStte;

    @Column(name = "STC_TTE")
    private Double stcTte;

    @Column(name = "STC_CAP")
    private Double stcCap;

    @Column(name = "STC_MY")
    private Double stcMy;

    @Column(name = "STC_TTE_CRL")
    private Double stcTteCrl;

    @Column(name = "STC_CRL")
    private Double stcCrl;

    @Column(name = "STC_SO3")
    private Double stcSo3;

    @Column(name = "STC_SO2")
    private Double stcSo2;

    @Column(name = "STC_SO1")
    private Double stcSo1;

    @Column(name = "STC_TCO3")
    private Double stcTco3;

    @Column(name = "STC_TCO2")
    private Double stcTco2;

    @Column(name = "STC_TCO1")
    private Double stcTco1;

    @Column(name = "STC_TCOJ")
    private Double stcTcoj;

    @Column(name = "STC_TCOJS")
    private Double stcTcojs;

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