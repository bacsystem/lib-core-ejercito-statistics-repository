package pe.mil.ejercito.lib.repository.repositories.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

/**
 * EpStatisticsDrieEntity
 * <p>
 * EpStatisticsDrieEntity class.
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
@Table(name = "EP_STATISTICS_DRIE", indexes = {
    @Index(name = "EP_STATISTICS_DRIE_UN1", columnList = "STD_UUID", unique = true)
})
public class EpStatisticsDrieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EP_STATISTICS_DRIE_SEQ")
    @SequenceGenerator(name = "EP_STATISTICS_DRIE_SEQ", sequenceName = "EP_STATISTICS_DRIE_SEQ", allocationSize = 1)
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
    @Column(name = "ST_PAIS", length = 500)
    private String stPais;

    @Column(name = "STD_AE_OO")
    private Double stdAeOo;

    @Column(name = "STD_AE_TCOS")
    private Double stdAeTcos;

    @Column(name = "STD_AP_OO")
    private Double stdApOo;

    @Column(name = "STD_AP_TCOS")
    private Double stdApTcos;

    @Column(name = "STD_PAE_CONTINENT")
    private Double stdPaeContinent;

    @Column(name = "STD_VOM_MY_POSTULATE")
    private Double stdVomMyPostulate;

    @Column(name = "STD_VOM_MY_SELECTED")
    private Double stdVomMySelected;

    @Column(name = "STD_VOM_CAP_POSTULATE")
    private Double stdVomCapPostulate;

    @Column(name = "STD_VOM_CAP_SELECTED")
    private Double stdVomCapSelected;

    @Column(name = "STD_VOM_POSTULATE")
    private Double stdVomPostulate;

    @Column(name = "STD_VOM_SELECTED")
    private Double stdVomSelected;

    @Column(name = "STD_VTM_POSTULATE")
    private Double stdVtmPostulate;

    @Column(name = "STD_VTM_SELECTED")
    private Double stdVtmSelected;

    @Column(name = "STD_PMEEO")
    private Double stdPmeeo;

    @Column(name = "STD_PMEEC")
    private Double stdPmeec;

    @Column(name = "STD_PMEET")
    private Double stdPmeet;

    @Column(name = "STD_PMEES")
    private Double stdPmees;

    @Column(name = "STD_PMLEO")
    private Double stdPmleo;

    @Column(name = "STD_PMLET")
    private Double stdPmlet;

    @Column(name = "STD_PMLES")
    private Double stdPmles;

    @Column(name = "STD_PMLEA")
    private Double stdPmlea;

    @Column(name = "STD_RPLI_RB_HOST")
    private Double stdRpliRbHost;

    @Column(name = "STD_RPLI_RB_GUEST")
    private Double stdRpliRbGuest;

    @Column(name = "STD_RPLI_RR_HOST")
    private Double stdRpliRrHost;

    @Column(name = "STD_RPLI_RR_GUEST")
    private Double stdRpliRrGuest;

    @Column(name = "STD_RPLI_RC_HOST")
    private Double stdRpliRcHost;

    @Column(name = "STD_RPLI_RC_GUEST")
    private Double stdRpliRcGuest;

    @Column(name = "STD_RPLI_MEETING")
    private Double stdRpliMeeting;

    @Column(name = "STD_RPL_SIGNED_AGREEMENTS")
    private Double stdRplSignedAgreements;

    @Column(name = "STD_RPL_SCHEDULED_AGREEMENTS")
    private Double stdRplScheduledAgreements;

    @Column(name = "STD_RPL_EXECUTED_AGREEMENTS")
    private Double stdRplExecutedAgreements;

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