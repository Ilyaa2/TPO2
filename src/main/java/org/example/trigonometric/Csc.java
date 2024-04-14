package org.example.trigonometric;

public class Csc {

    private Sin sin;

    public Csc(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        return 1 / sin.calculate(x, precision);
    }
}
