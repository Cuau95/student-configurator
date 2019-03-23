package com.titulation.student.configurator.domain.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "escuelas")
public class Campus implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEscuela;
    private String nombreEscuela;
    @OneToMany(mappedBy="escuela")
    private List<Student> students;

    public int getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(int id) {
        this.idEscuela = id;
    }

    public String getNombreEscuela() {
        return nombreEscuela;
    }

    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

}
