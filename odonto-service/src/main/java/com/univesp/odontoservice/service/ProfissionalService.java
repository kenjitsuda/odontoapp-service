package com.univesp.odontoservice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import com.univesp.odontoservice.controller.dto.ProfissionalResponse;
import com.univesp.odontoservice.repository.AgendaRepository;
import com.univesp.odontoservice.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
    
    private final ProfissionalRepository profissionalRepository;
    private final AgendaRepository agendaRepository;

    public ProfissionalService(ProfissionalRepository profissionalRepository, AgendaRepository agendaRepository) {
        this.profissionalRepository = profissionalRepository;
        this.agendaRepository = agendaRepository;
    }

    public ProfissionalResponse profissional() throws ParseException {
        var aux = profissionalRepository.findProfissionais();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String data = "10/10/2024";
        java.util.Date date = df.parse(data);
        // if you really need java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        var aux2 = agendaRepository.findAgendaEntity(sqlDate, 1);
        return null;
    }
}
