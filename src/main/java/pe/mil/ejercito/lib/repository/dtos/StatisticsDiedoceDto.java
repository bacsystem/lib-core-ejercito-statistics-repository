package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsDiedoceDto
 * <p>
 * StatisticsDiedoceDto class.
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
public class StatisticsDiedoceDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String cmm;
    private double imOo3;
    private double imTcos3;
    private double imOo4;
    private double imTcos4;
    private double imOo5;
    private double imTcos5;
    private double parA3;
    private double parD3;
    private double parA4;
    private double parD4;
    private double parA5;
    private double parD5;
    private double paM3;
    private double paF3;
    private double paM4;
    private double paF4;
    private double paM5;
    private double paF5;
    private String vpeoDetail;
    private String vpeoSchool;
    private String vpeoCourse;
    private double vpeoVacant;
    private String vpetGrade;
    private String vpetSchool;
    private String vpetCourse;
    private double vpetVacant;
    private String pcePais;
    private double pceOo;
    private double pceCad;
    private double pceTcos;

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