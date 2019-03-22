package com.titulation.student.configurator.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="carreras")
public class Career implements Serializable {

    @OneToMany(mappedBy = "idCarrera", fetch=FetchType.LAZY)
    private Student student;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCarrera;
    private String nombreCarrera;

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
}
