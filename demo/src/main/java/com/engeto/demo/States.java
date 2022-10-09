package com.engeto.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class States implements Comparable <States> {

    private String country;

    @JsonProperty ("standard_rate")
    private Double standardRate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getStandardRate() {
        return standardRate;
    }

    public void setStandardRate(double standardRate) {
        this.standardRate = standardRate;
    }

    @Override
    public int compareTo(States o) {
        return (int) (this.standardRate - o.getStandardRate());
    }

    @Override
    public String toString() {
        return country +", standard rate = " + standardRate +" \n";
    }
}
