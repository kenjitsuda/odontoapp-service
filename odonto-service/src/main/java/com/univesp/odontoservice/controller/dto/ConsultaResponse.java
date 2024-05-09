package com.univesp.odontoservice.controller.dto;

import java.util.List;

public record ConsultaResponse(List<Agenda> agenda) {
    public record Agenda(String nome, List<String> horarios) {}
}
