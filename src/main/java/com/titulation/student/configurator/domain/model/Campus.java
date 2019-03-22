package com.titulation.student.configurator.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="escuelas")
public class Campus implements Serializable {

    @OneToMany(mappedBy = "idEscuela", fetch=FetchType.LAZY)
    private List<Student> student;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEscuela;
    private String nombreEscuela;

    public Integer getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(Integer id) {
        this.idEscuela = id;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }
    
}
