package org.example;


import org.example.logariphmic.Ln;
import org.example.logariphmic.Log;
import org.example.trigonometric.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        writeLogarithmicCsv();
        writeFunctionsSystemCsv();
    }

    public static void writeLogarithmicCsv() {
        try (FileWriter lnFile = new FileWriter("src/main/resources/csv/ln.csv");
             FileWriter log2File = new FileWriter("src/main/resources/csv/log2.csv");
             FileWriter log3File = new FileWriter("src/main/resources/csv/log3.csv");
             FileWriter log5File = new FileWriter("src/main/resources/csv/log5.csv")
        ) {
            var precision = 0.00001;
            var ln = new Ln();
            var log2 = new Log(ln, 2);
            var log3 = new Log(ln, 3);
            var log5 = new Log(ln, 5);

            var listLog2 = new ArrayList<CsvWriter.Pair>();
            var listLog3 = new ArrayList<CsvWriter.Pair>();
            var listLog5 = new ArrayList<CsvWriter.Pair>();
            var listLn = new ArrayList<CsvWriter.Pair>();
            for (double i = 0.1; i <= 2d; i += 0.1) {
                listLog2.add(new CsvWriter.Pair(i, log2.calculate(i, precision)));
                listLog3.add(new CsvWriter.Pair(i, log3.calculate(i, precision)));
                listLog5.add(new CsvWriter.Pair(i, log5.calculate(i, precision)));
                listLn.add(new CsvWriter.Pair(i, ln.calculate(i, precision)));
            }
            CsvWriter.writeResultToCSV(listLog2, log2File);
            CsvWriter.writeResultToCSV(listLog3, log3File);
            CsvWriter.writeResultToCSV(listLog5, log5File);
            CsvWriter.writeResultToCSV(listLn, lnFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFunctionsSystemCsv(){
        try (FileWriter FunctionsSystemFile = new FileWriter("src/main/resources/csv/systemFunctions.csv")){
            var precision = 0.00001;
            Sin sin = new Sin();
            Ln ln = new Ln();
            var functionsSystem = new FunctionsSystem(sin, new Cos(sin), new Tan(sin), new Cot(sin), new Sec(sin), new Csc(sin), new Log(ln, 3), new Log(ln, 5), new Log(ln, 2), ln);
            var functionsResultList = new ArrayList<CsvWriter.Pair>();
            for (double i = 0.1; i <= 2d; i += 0.1) {
                functionsResultList.add(new CsvWriter.Pair(i, functionsSystem.calculate(i, precision)));
            }
            CsvWriter.writeResultToCSV(functionsResultList, FunctionsSystemFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}