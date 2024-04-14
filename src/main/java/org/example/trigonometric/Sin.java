package org.example.trigonometric;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public class Sin {

    public double calculate(double x, double precision) {
        double sinX = 0;
        double term = x; // Первый член ряда
        int sign = 1;
        int n = 1;

        while (Math.abs(term) >= precision) {
            sinX += term;
            n += 2;
            sign *= -1;
            term = sign * Math.pow(x, n) / factorial(n);
        }

        return sinX;
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
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
