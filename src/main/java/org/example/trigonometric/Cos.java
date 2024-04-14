package org.example.trigonometric;

public class Cos {

    private Sin sin;
    public Cos(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        return Math.sqrt(1 - Math.pow(sin.calculate(x, precision), 2));
    }


}
