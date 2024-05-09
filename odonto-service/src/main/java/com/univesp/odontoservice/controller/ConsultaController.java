package com.univesp.odontoservice.controller;

import java.text.ParseException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.univesp.odontoservice.controller.dto.ConsultaRequest;
import com.univesp.odontoservice.controller.dto.ConsultaResponse;
import com.univesp.odontoservice.service.ConsultaService;

@RestController
public class ConsultaController {

    private final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @PostMapping("v1/consulta")
    ResponseEntity<ConsultaResponse> consulta(@RequestBody ConsultaRequest request) throws ParseException {

        return new ResponseEntity<>(consultaService.consulta(request), HttpStatus.OK);
    }
    
}
