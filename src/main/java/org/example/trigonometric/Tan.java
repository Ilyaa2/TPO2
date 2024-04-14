package org.example.trigonometric;

public class Tan {


    private Sin sin;

    public Tan(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        Cos cos = new Cos(sin);
        return sin.calculate(x, precision) / cos.calculate(x, precision);
    }

}
