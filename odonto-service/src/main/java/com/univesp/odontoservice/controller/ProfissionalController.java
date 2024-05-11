package com.univesp.odontoservice.controller;

import java.text.ParseException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univesp.odontoservice.controller.dto.ProfissionalResponse;
import com.univesp.odontoservice.service.ProfissionalService;

@RestController
public class ProfissionalController {

    private final ProfissionalService profissionalService;

    public ProfissionalController(ProfissionalService profissionalService) {
        this.profissionalService = profissionalService;
    }

    @GetMapping("v1/profissional")
    ResponseEntity<ProfissionalResponse> profissionais() throws ParseException {
        return new ResponseEntity<>(profissionalService.profissional(), HttpStatus.OK);
    }
    
}