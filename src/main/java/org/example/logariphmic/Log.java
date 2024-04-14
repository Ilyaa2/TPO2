package org.example.logariphmic;

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
}
