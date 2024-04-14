package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class CsvWriter {
    public static void writeResultToCSV(ArrayList<Pair> results, Writer out) {

        try (CSVPrinter printer = CSVFormat.DEFAULT.print(out)) {
            printer.printRecord("x", "y");
            for (Pair pair: results){
                printer.printRecord(pair.x, pair.y);
            }
        } catch (IOException e) {
            System.out.println("Wrong filename");
        }
    }

    public static class Pair {
        double x;
        double y;

        Pair(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
}
