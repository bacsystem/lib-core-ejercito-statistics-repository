package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsDinfeEntity
 * <p>
 * EpStatisticsDinfeEntity class.
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
@Table(name = "EP_STATISTICS_DINFE", indexes = {
    @Index(name = "EP_STATISTICS_DINFE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDinfeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DINFE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DINFE_SEQ", sequenceName = "EP_STATISTICS_DINFE_SEQ", allocationSize = 1)
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
    @Column(name = "STD_DETAIL", length = 500)
    private String stdDetail;

    @Size(max = 500)
    @Column(name = "STD_AGES", length = 500)
    private String stdAges;

    @Size(max = 500)
    @Column(name = "STD_MUSEUM", length = 500)
    private String stdMuseum;

    @Size(max = 500)
    @Column(name = "STD_FEE", length = 500)
    private String stdFee;

    @Size(max = 500)
    @Column(name = "STD_DESCRIPTION", length = 500)
    private String stdDescription;

    @Column(name = "ST_ENE_A")
    private Double stEneA;

    @Column(name = "ST_ENE_B")
    private Double stEneB;

    @Column(name = "ST_ENE_C")
    private Double stEneC;

    @Column(name = "ST_FEB_A")
    private Double stFebA;

    @Column(name = "ST_FEB_B")
    private Double stFebB;

    @Column(name = "ST_FEB_C")
    private Double stFebC;

    @Column(name = "ST_MAR_A")
    private Double stMarA;

    @Column(name = "ST_MAR_B")
    private Double stMarB;

    @Column(name = "ST_MAR_C")
    private Double stMarC;

    @Column(name = "ST_ABR_A")
    private Double stAbrA;

    @Column(name = "ST_ABR_B")
    private Double stAbrB;

    @Column(name = "ST_ABR_C")
    private Double stAbrC;

    @Column(name = "ST_MAY_A")
    private Double stMayA;

    @Column(name = "ST_MAY_B")
    private Double stMayB;

    @Column(name = "ST_MAY_C")
    private Double stMayC;

    @Column(name = "ST_JUN_A")
    private Double stJunA;

    @Column(name = "ST_JUN_B")
    private Double stJunB;

    @Column(name = "ST_JUN_C")
    private Double stJunC;

    @Column(name = "ST_JUL_A")
    private Double stJulA;

    @Column(name = "ST_JUL_B")
    private Double stJulB;

    @Column(name = "ST_JUL_C")
    private Double stJulC;

    @Column(name = "ST_AGO_A")
    private Double stAgoA;

    @Column(name = "ST_AGO_B")
    private Double stAgoB;

    @Column(name = "ST_AGO_C")
    private Double stAgoC;

    @Column(name = "ST_SET_A")
    private Double stSetA;

    @Column(name = "ST_SET_B")
    private Double stSetB;

    @Column(name = "ST_SET_C")
    private Double stSetC;

    @Column(name = "ST_OCT_A")
    private Double stOctA;

    @Column(name = "ST_OCT_B")
    private Double stOctB;

    @Column(name = "ST_OCT_C")
    private Double stOctC;

    @Column(name = "ST_NOV_A")
    private Double stNovA;

    @Column(name = "ST_NOV_B")
    private Double stNovB;

    @Column(name = "ST_NOV_C")
    private Double stNovC;

    @Column(name = "ST_DIC_A")
    private Double stDicA;

    @Column(name = "ST_DIC_B")
    private Double stDicB;

    @Column(name = "ST_DIC_C")
    private Double stDicC;

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