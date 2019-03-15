package com.titulation.student.configurator.domain.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Student implements Serializable {

    @Id
    private String idAlumno;
    private String nombreAlumno;
    @Column(name = "Papellido")
    private String pApellido;
    @Column(name = "Mapellido")
    private String mApellido;
    private String nombreCompleto;
    @OneToOne
    @PrimaryKeyJoinColumn(name="id_escuela", referencedColumnName="id_escuela")
    private Campus idEscuela;
    @OneToOne
    @PrimaryKeyJoinColumn(name="id_carrera", referencedColumnName="id_carrera")
    private Career idCarrera;

    public String getId() {
        return idAlumno;
    }

    public void setId(String id) {
        this.idAlumno = id;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getmApellido() {
        return mApellido;
    }

    public void setmApellido(String mApellido) {
        this.mApellido = mApellido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Campus getCampus() {
        return idEscuela;
    }

    public void setCampus(Campus campus) {
        this.idEscuela = campus;
    }

    public Career getCareer() {
        return idCarrera;
    }

    public void setCareer(Career career) {
        this.idCarrera = career;
    }
    
}
