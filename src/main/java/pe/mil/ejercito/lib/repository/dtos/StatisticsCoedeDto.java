package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsCoedeDto
 * <p>
 * StatisticsCoedeDto class.
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
public class StatisticsCoedeDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String country;
    private String year;
    private String arms;
    private String reason;
    private String career;
    private String school;
    private String courses;
    private double male;
    private double female;

    private double ene;
    private double feb;
    private double mar;
    private double abr;
    private double may;
    private double jun;
    private double jul;
    private double ago;
    private double set;
    private double oct;
    private double nov;
    private double dic;
    private double basic;
    private double intermediate;
    private double advanced;
    private double stte;
    private double tte;
    private double cap;
    private double my;
    private double tteCrl;
    private double crl;
    private double so3;
    private double so2;
    private double so1;
    private double tco3;
    private double tco2;
    private double tco1;
    private double tcoj;
    private double tcojs;

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