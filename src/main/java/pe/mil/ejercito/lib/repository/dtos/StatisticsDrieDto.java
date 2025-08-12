package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsDrieDto
 * <p>
 * StatisticsDrieDto class.
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
public class StatisticsDrieDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String pais;
    private double aeOo;
    private double aeTcos;
    private double apOo;
    private double apTcos;
    private double paeContinent;
    private double vomMyPostulate;
    private double vomMySelected;
    private double vomCapPostulate;
    private double vomCapSelected;
    private double vomPostulate;
    private double vomSelected;
    private double vtmPostulate;
    private double vtmSelected;
    private double pmeeo;
    private double pmeec;
    private double pmeet;
    private double pmees;
    private double pmleo;
    private double pmlet;
    private double pmles;
    private double pmlea;
    private double rpliRbHost;
    private double rpliRbGuest;
    private double rpliRrHost;
    private double rpliRrGuest;
    private double rpliRcHost;
    private double rpliRcGuest;
    private String rpliMeeting;
    private double rplSignedAgreements;
    private double rplScheduledAgreements;
    private double rplExecutedAgreements;

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