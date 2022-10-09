package com.engeto.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Parse {

    static StatesMap s;
    List<States>l;

    public StatesMap parse (String source) throws JsonProcessingException {
        ObjectMapper o = new ObjectMapper();
        o.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        s = o.readValue(source, StatesMap.class);
        s.getMapOfStates().size();
        return s;

    }

}
