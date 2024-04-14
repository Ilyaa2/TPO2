package org.example.logariphmic;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public class Log {
    private final Ln ln;
    private final int base;

    public Log(Ln ln, int base) {
        if (base < 0) throw new ArithmeticException("Неправильное основание");
        this.ln = ln;
        this.base = base;
    }

    public double calculate(double x, double precision){
        return ln.calculate(x, precision) / ln.calculate(this.base, precision);
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
