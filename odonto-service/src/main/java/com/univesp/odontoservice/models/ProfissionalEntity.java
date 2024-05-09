package com.univesp.odontoservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ProfissionalEntity {
    
    @Id
    @GeneratedValue
    private Long ProfissionalID;

    private String Profissional;

    private String Especialidade;

    public Long getProfissionalID() {
        return ProfissionalID;
    }

    public void setProfissionalID(Long ProfissionalID) {
        this.ProfissionalID = ProfissionalID;
    }

    public String getProfissional() {
        return Profissional;
    }

    public void setProfissional(String Profissional) {
        this.Profissional = Profissional;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

}
