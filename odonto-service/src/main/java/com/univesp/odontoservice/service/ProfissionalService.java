package com.univesp.odontoservice.service;

import java.text.ParseException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.univesp.odontoservice.controller.dto.ProfissionalResponse;
import com.univesp.odontoservice.repository.ProfissionalRepository;

@Service
public class ProfissionalService {
    
    private final ProfissionalRepository profissionalRepository;

    public ProfissionalService(ProfissionalRepository profissionalRepository) {
        this.profissionalRepository = profissionalRepository;
    }

    public ProfissionalResponse profissional() throws ParseException {
        var aux = profissionalRepository.findProfissionais();
        JSONArray array = new JSONArray();
        aux.forEach(profissional -> {
            JSONObject jsonProfissional = new JSONObject(new Gson().toJson(profissional));
            array.put(jsonProfissional);
        });

        return new ProfissionalResponse(array.toString());
    }
}
