package com.univesp.odontoservice.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ConsultaEntity {
    
    @Id
    @GeneratedValue
    private Long ID;
    private Long ProfissionalID;
    private String Paciente;
    private Date Data;
    private String Horario;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getProfissionalID() {
        return ProfissionalID;
    }

    public void setProfissionalID(Long ProfissionalID) {
        this.ProfissionalID = ProfissionalID;
    }

    public String getPaciente() {
        return Paciente;
    }

    public void setPaciente(String Paciente) {
        this.Paciente = Paciente;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

}
