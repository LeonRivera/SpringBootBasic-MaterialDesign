package mx.com.leonrv3.materialexamplespring.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;


@Data
@Entity
@Table(name = "hotdog")
@ToString
public class HotDog implements Serializable{

    static final Long serialVersionUID= 2L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String nombre;

    @Column(name = "tipo_salchicha")
    private String tipoSalchicha;

    @Column(name = "tipo_pan")
    private String tipoPan;

    private String descripcion;
    
}
