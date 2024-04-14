package org.example.trigonometric;

public class Sec {
    private Sin sin;

    public Sec(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        Cos cos = new Cos(sin);
        return 1 / cos.calculate(x, precision);
    }

}
