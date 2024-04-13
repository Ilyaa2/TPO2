package org.example.trigonometric;

public class Cos {

    private Sin sin;
    public Cos(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        return 1 - sin.calculate(x, precision);
    }


}
