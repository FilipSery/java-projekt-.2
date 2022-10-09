package com.engeto.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parse {

    private StatesMap s;
    private List<States>l;

    public StatesMap parse (String source) throws JsonProcessingException {
        ObjectMapper o = new ObjectMapper();
        o.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        s = o.readValue(source, StatesMap.class);
        s.getMapOfStates().size();
        return s;

    }
    public List<States> getArrayList () {
        l = new ArrayList<>(s.getMapOfStates().values());
        Collections.sort(l);
        return l;
    }
    public void exportIntoFile (String fileName, String inputString) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.print(inputString);
        } catch (FileNotFoundException e) {
            System.err.println(e.getLocalizedMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
