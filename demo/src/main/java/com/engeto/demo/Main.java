package com.engeto.demo;

import java.io.IOException;

public class Main {
    public static void main (String [] args) throws IOException, InterruptedException {
        final String line = "====================";
        final String fileName = "top-states-file.txt";

        APICaller a = new APICaller();
        String s = a.getAPI();
        Parse p = new Parse();
        p.parse(s);
        SearchEngine se = new SearchEngine();
        String statesWithHighestVatRate = se.getHighestVatRate(p, 3).toString();
        String statesWithLowestVatRate = se.getLowestVatRate(p,3).toString();
        String output = statesWithHighestVatRate +"\n" +statesWithLowestVatRate;

        System.out.println(statesWithHighestVatRate);
        System.out.println(line);
        System.out.println(statesWithLowestVatRate);
        System.out.println(line);
        System.out.println("Importing into file: "+ fileName);
        p.exportIntoFile(fileName, output);
    }
}
