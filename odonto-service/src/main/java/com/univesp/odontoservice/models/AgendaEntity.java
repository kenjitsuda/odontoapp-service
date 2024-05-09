package com.univesp.odontoservice.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AgendaEntity {
    
    @Id
    @GeneratedValue
    private Long ID;
    private Long ProfissionalID;
    private Date Data;
    private String Agenda;

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

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getAgenda() {
        return Agenda;
    }

    public void setAgenda(String Agenda) {
        this.Agenda = Agenda;
    }

}
