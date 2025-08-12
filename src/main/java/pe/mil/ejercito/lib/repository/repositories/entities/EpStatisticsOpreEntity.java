package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsOpreEntity
 * <p>
 * EpStatisticsOpreEntity class.
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
@Table(name = "EP_STATISTICS_OPRE")
public class EpStatisticsOpreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_OPRE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_OPRE_SEQ", sequenceName = "EP_STATISTICS_OPRE_SEQ", allocationSize = 1)
    @Column(name = "STO_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STO_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STO_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stoDocument;

    @Column(name = "STO_PRE_PIA")
    private Double stoPrePia;

    @Column(name = "STO_PRE_PIM")
    private Double stoPrePim;

    @Size(max = 200)
    @Column(name = "STO_PRE_DETAIL", length = 200)
    private String stoPreDetail;

    @Size(max = 200)
    @Column(name = "STO_PROD_PROGRAM", length = 200)
    private String stoProdProgram;

    @Column(name = "STO_PROD_PIM")
    private Double stoProdPim;

    @Column(name = "STO_PROD_EXEC")
    private Double stoProdExec;

    @Column(name = "STO_PROD_BALANCE")
    private Double stoProdBalance;

    @Column(name = "STO_MINDEF_PIA")
    private Double stoMindefPia;

    @Column(name = "STO_MINDEF_PIM")
    private Double stoMindefPim;

    @Column(name = "STO_MINDEF_CERTIFICATE")
    private Double stoMindefCertificate;

    @Column(name = "STO_MINDEF_YEAR")
    private Double stoMindefYear;

    @Column(name = "STO_MINDEF_MONTH")
    private Double stoMindefMonth;

    @Column(name = "STO_MINDEF_ACCRUAL")
    private Double stoMindefAccrual;

    @Column(name = "STO_MINDEF_TURNED")
    private Double stoMindefTurned;

    @Column(name = "STO_MINDEF_ADVANCE")
    private Double stoMindefAdvance;

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