package org.example.trigonometric;

public class Tan {


    private Sin sin;
    public Tan(Sin sin){
        this.sin = sin;
    }

    public double calculate(double x, double precision) {
        return sin.calculate(x,precision) / (1- Math.pow(sin.calculate(x,precision), 2));
    }

}
