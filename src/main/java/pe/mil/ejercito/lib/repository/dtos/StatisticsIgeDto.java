package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsIgeDto
 * <p>
 * StatisticsIgeDto class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil
 * @since 19/05/2024
 */
@ToString
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatisticsIgeDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private double aqHousing;
    private double aqAbuseAuthority;
    private double aqContracts;
    private double aqDebts;
    private double aqPension;
    private double aqFamilyProblems;
    private double aqDecoration;
    private double aqJudicialAssignment;
    private double aqDeficienciesAdministrative;
    private double aqReview;
    private double aqInvestigations;
    private double aqEvacuation;
    private double aqOther;
    private double inspectionPositiveAspect;
    private double inspectionDeficiency;
    private double inspectionObservations;
    private double inspectionIrregularities;
    private String provostTypification;
    private double provostOo;
    private double provostTcos;
    private double provostTroop;
    private double mindefInformation;
    private double mindefRecommendations;
    private double mindefImplemented;
    private double mindefProgress;
    private double mindefPending;
    private double mindefAdvance;

    private Long id;
    private String uuId;
    private String document;
    private String place;
    private String division;
    private String dependency;
    private String otherState;
    private String nro;
    private double total;
    private String typeSheet;
    private String nameSheet;
    private String obs;
    private Instant created;
    private Instant updated;
}