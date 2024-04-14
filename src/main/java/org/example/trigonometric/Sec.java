package org.example.trigonometric;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public class Sec {
    private Sin sin;

    public Sec(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        Cos cos = new Cos(sin);
        return 1 / cos.calculate(x, precision);
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
