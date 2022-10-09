package com.engeto.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class StatesMap {

    @JsonProperty (value = "last_updated")
    private String lastUpdated;
    private String disclaimer;
    private String rates;
    private Map<String, States> mapOfStates = new HashMap<>();

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public Map<String, States> getMapOfStates() {
        return mapOfStates;
    }

    public void setMapOfStates(Map<String, States> mapOfStates) {
        this.mapOfStates = mapOfStates;
    }
}
