package org.example.trigonometric;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public class Cot {

    private Sin sin;

    public Cot(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        Tan tan = new Tan(sin);
        return 1 / tan.calculate(x, precision);
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
