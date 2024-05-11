package com.univesp.odontoservice.utils;

import org.json.JSONArray;

public class NovaAgenda {

    public static JSONArray novaAgenda() {
        JSONArray jsonHorarios = new JSONArray();
        jsonHorarios.put("09:00");
        jsonHorarios.put("09:30");
        jsonHorarios.put("10:00");
        jsonHorarios.put("10:30");
        jsonHorarios.put("11:00");
        jsonHorarios.put("11:30");
        jsonHorarios.put("13:00");
        jsonHorarios.put("13:30");
        jsonHorarios.put("14:00");
        jsonHorarios.put("14:30");
        jsonHorarios.put("15:00");
        jsonHorarios.put("15:30");
        jsonHorarios.put("16:00");
        jsonHorarios.put("16:30");
        return jsonHorarios;
    }
    
}
