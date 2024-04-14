package org.example.trigonometric;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.io.Writer;

public class Csc {

    private Sin sin;

    public Csc(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        return 1 / sin.calculate(x, precision);
    }
}
