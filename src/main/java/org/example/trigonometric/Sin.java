package org.example.trigonometric;

import java.math.BigDecimal;

public class Sin {

    public double calculate(double x, double precision) {
        double sinX = 0;
        int sign = 1;
        int i = 0;
        while (sinX - Math.sin(x) > precision) {
            int power = 2 * i + 1;
            double term = sign * Math.pow(x, power) / factorial(power);
            sinX += term;
            sign *= -1;
            i++;
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
}
