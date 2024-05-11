package com.univesp.odontoservice.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.springframework.stereotype.Service;

import com.univesp.odontoservice.controller.dto.ConsultaRequest;
import com.univesp.odontoservice.controller.dto.ConsultaResponse;
import com.univesp.odontoservice.repository.AgendaRepository;
import com.univesp.odontoservice.repository.ConsultaRepository;

@Service
public class ConsultaService {

    private final AgendaRepository agendaRepository;
    private final ConsultaRepository consultaRepository;

    public ConsultaService(AgendaRepository agendaRepository, ConsultaRepository consultaRepository) {
        this.agendaRepository = agendaRepository;
        this.consultaRepository = consultaRepository;
    }

    public ConsultaResponse consulta(ConsultaRequest request) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String data = request.data();
        java.util.Date date = df.parse(data);
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        var agenda = agendaRepository.findAgendaEntity(sqlDate, request.profissionalID());
        JSONArray array = new JSONArray(agenda.getAgenda());
        List<String> horariosList = new ArrayList<String>();
        for (int i=0;i<array.length();i++) {
            if (!array.getString(i).equals(request.horario())) {
                horariosList.add(array.getString(i));
            }
        }

        JSONArray array2 = new JSONArray(horariosList);
        agendaRepository.updateAgenda(request.profissionalID(), sqlDate, array2.toString());

        consultaRepository.insertConsulta(request.profissionalID(), request.nomePaciente(), sqlDate, request.horario());

        return new ConsultaResponse("sucesso");
    }

}
