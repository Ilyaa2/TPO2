package org.example.trigonometric;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public class Cos {

    private Sin sin;
    public Cos(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        return Math.sqrt(1 - Math.pow(sin.calculate(x, precision), 2));
    }

    public double writeResultToCSV(double x, double precision, Writer out) {
        double res = calculate(x, precision);
        try (CSVPrinter printer = CSVFormat.DEFAULT.print(out)) {
            printer.printRecord(x, res);
        } catch (IOException e) {
            System.out.println("Wrong filename");
        }
        return res;
    }
}
