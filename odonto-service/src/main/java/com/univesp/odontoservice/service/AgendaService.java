package com.univesp.odontoservice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.json.JSONArray;
import org.springframework.stereotype.Service;

import com.univesp.odontoservice.controller.dto.AgendaRequest;
import com.univesp.odontoservice.controller.dto.AgendaResponse;
import com.univesp.odontoservice.repository.AgendaRepository;
import com.univesp.odontoservice.utils.NovaAgenda;

@Service
public class AgendaService {

    private final AgendaRepository agendaRepository;

    public AgendaService(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    public AgendaResponse agenda(AgendaRequest request) throws ParseException {
        String data = request.data();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = df.parse(data);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        var aux = agendaRepository.findAgendaEntity(sqlDate, request.profissional());

        if (aux == null) {
            JSONArray jsonHorarios = NovaAgenda.novaAgenda();
            agendaRepository.insertAgenda(request.profissional(), sqlDate, jsonHorarios.toString());
            return new AgendaResponse(jsonHorarios.toString());
        }
        return new AgendaResponse(aux.getAgenda());
    }
    
}
