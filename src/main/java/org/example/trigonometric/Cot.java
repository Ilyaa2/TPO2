package org.example.trigonometric;

public class Cot {

    private Sin sin;

    public Cot(Sin sin) {
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        Tan tan = new Tan(sin);
        return 1 / tan.calculate(x, precision);
    }
}
