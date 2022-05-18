package mx.com.leonrv3.materialexamplespring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;


@Data
@Entity
@ToString
public class HotDog implements Serializable{

    static final Long serialVersionUID= 2L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "tipo_salchicha")
    private String tipoSalchicha;

    @Column(name = "tipo_pan")
    private String tipoPan;




    
}
