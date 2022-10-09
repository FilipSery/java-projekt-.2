package com.engeto.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class States implements Comparable <States> {
    private String country;
    @JsonProperty (value = "standard_rate")
    private double standardRate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getStandardRate() {
        return standardRate;
    }

    public void setStandardRate(double standardRate) {
        this.standardRate = standardRate;
    }

    @Override
    public int compareTo(States o) {
        return 0;
    }

    @Override
    public String toString() {
        return "States{" +
                "country='" + country + '\'' +
                ", standardRate=" + standardRate +
                '}';
    }
}
