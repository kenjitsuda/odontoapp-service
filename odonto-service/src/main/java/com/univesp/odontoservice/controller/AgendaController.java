package com.univesp.odontoservice.controller;

import java.text.ParseException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.univesp.odontoservice.controller.dto.AgendaRequest;
import com.univesp.odontoservice.controller.dto.AgendaResponse;
import com.univesp.odontoservice.service.AgendaService;

@RestController
public class AgendaController {

    private final AgendaService agendaService;

    public AgendaController(AgendaService agendaService) {
        this.agendaService = agendaService;
    }

    @PostMapping("v1/agenda")
        ResponseEntity<AgendaResponse> profissionais(@RequestBody AgendaRequest request) throws ParseException {
        return new ResponseEntity<>(agendaService.agenda(request), HttpStatus.OK);
    }
    
}
