package pe.mil.ejercito.lib.repository.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;

/**
 * StatisticsDipereDto
 * <p>
 * StatisticsCoteDto class.
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
public class StatisticsDipereDto implements Serializable {

    private static final long serialVersionUID = -2570922323177277888L;

    private String grade;
    private String vaoService;
    private String vaoProfession;
    private String vatSpecialty;
    private String vpcActionPersonal;
    private String gocRegimen;
    private String gocName;
    private String gocCargo;
    private double vaoInf;
    private double vaoCab;
    private double vaoArt;
    private double vaoIng;
    private double vaoCom;
    private double vaoIntg;
    private double vaoMg;
    private double vaoInte;
    private double vaoIntu;
    private double vaoSje;
    private double vaoMed;
    private double vaoOdo;
    private double vaoVet;
    private double vaoFar;
    private double vaoScyte;
    private double veoInt;
    private double veoVet;
    private double veoPsic;
    private double veoPef;
    private double veoScyte;
    private double vaoVacant;
    private String veEmch;
    private double veVacant;
    private double vatJs;
    private double vatJ;
    private double vatTco1;
    private double vatTco2;
    private double vatTco3;
    private double vatSo1;
    private double vatSo2;
    private double vatSo3;
    private double vptEte;
    private double vptSm;
    private double vptInst;
    private double etsmSgto1;
    private double etsmSgto2;
    private double etsmCabo;
    private double etsmSldo;
    private double etreeSgto1;
    private double etreeSgto2;
    private double etreeCabo;
    private double vpcCandidates;
    private double vpcVacant;
    private double vpcAssigned;
    private double gocVacant;

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