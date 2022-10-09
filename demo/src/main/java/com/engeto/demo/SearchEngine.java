package com.engeto.demo;

public class SearchEngine {
    public String getLowestVatRate (Parse input, int howMany) {
        String output = "Top " + howMany + " countries with the lowest vat rate: \n";
        for (int i = 0; i<howMany; i++) {
            output += input.getArrayList().get(i);
        }
        return output;
    }
    public String getHighestVatRate(Parse input, int howMany) {
        String output = "Top " + howMany + " countries with the highest vat rate: \n";
        for (int i = input.getArrayList().size()-howMany; i<input.getArrayList().size(); i++) {
            output += input.getArrayList().get(i);
        }
        return output;
    }
}
