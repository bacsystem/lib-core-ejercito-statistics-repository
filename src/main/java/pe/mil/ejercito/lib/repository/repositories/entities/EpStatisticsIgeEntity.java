package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsIgeEntity
 * <p>
 * EpStatisticsIgeEntity class.
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
@Table(name = "EP_STATISTICS_IGE")
public class EpStatisticsIgeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_IGE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_IGE_SEQ", sequenceName = "EP_STATISTICS_IGE_SEQ", allocationSize = 1)
    @Column(name = "STI_ID", nullable = false)
    private Long id;

    @Size(max = 36)
    @NotNull
    @Column(name = "STI_UUID", nullable = false, length = 36)
    private String uuId;

    @ToString.Exclude
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STI_DOCUMENT", nullable = false)
    private EpDocumentRegisterEntity stiDocument;

    @Column(name = "STI_AQ_HOUSING")
    private Double stiAqHousing;

    @Column(name = "STI_AQ_ABUSE_AUTHORITY")
    private Double stiAqAbuseAuthority;

    @Column(name = "STI_AQ_CONTRACTS")
    private Double stiAqContracts;

    @Column(name = "STI_AQ_DEBTS")
    private Double stiAqDebts;

    @Column(name = "STI_AQ_PENSION")
    private Double stiAqPension;

    @Column(name = "STI_AQ_FAMILY_PROBLEMS")
    private Double stiAqFamilyProblems;

    @Column(name = "STI_AQ_DECORATION")
    private Double stiAqDecoration;

    @Column(name = "STI_AQ_JUDICIAL_ASSIGNMENT")
    private Double stiAqJudicialAssignment;

    @Column(name = "STI_AQ_DEFICIENCIES_ADMINISTRATIVE")
    private Double stiAqDeficienciesAdministrative;

    @Column(name = "STI_AQ_REVIEW")
    private Double stiAqReview;

    @Column(name = "STI_AQ_INVESTIGATIONS")
    private Double stiAqInvestigations;

    @Column(name = "STI_AQ_EVACUATION")
    private Double stiAqEvacuation;

    @Column(name = "STI_AQ_OTHER")
    private Double stiAqOther;

    @Column(name = "STI_INSPECTION_POSITIVE_ASPECT")
    private Double stiInspectionPositiveAspect;

    @Column(name = "STI_INSPECTION_DEFICIENCY")
    private Double stiInspectionDeficiency;

    @Column(name = "STI_INSPECTION_OBSERVATIONS")
    private Double stiInspectionObservations;

    @Column(name = "STI_INSPECTION_IRREGULARITIES")
    private Double stiInspectionIrregularities;

    @Size(max = 500)
    @Column(name = "STI_PROVOST_TYPIFICATION", length = 500)
    private String stiProvostTypification;

    @Column(name = "STI_PROVOST_OO")
    private Double stiProvostOo;

    @Column(name = "STI_PROVOST_TCOS")
    private Double stiProvostTcos;

    @Column(name = "STI_PROVOST_TROOP")
    private Double stiProvostTroop;

    @Column(name = "STI_MINDEF_INFORMATION")
    private Double stiMindefInformation;

    @Column(name = "STI_MINDEF_RECOMMENDATIONS")
    private Double stiMindefRecommendations;

    @Column(name = "STI_MINDEF_IMPLEMENTED")
    private Double stiMindefImplemented;

    @Column(name = "STI_MINDEF_PROGRESS")
    private Double stiMindefProgress;

    @Column(name = "STI_MINDEF_PENDING")
    private Double stiMindefPending;

    @Column(name = "STI_MINDEF_ADVANCE")
    private Double stiMindefAdvance;

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