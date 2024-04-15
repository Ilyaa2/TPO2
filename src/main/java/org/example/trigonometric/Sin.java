package org.example.trigonometric;

import static java.lang.Double.isNaN;


public class Sin {

    public double calculate(double x, double precision) {
        double sinX = 0;
        double term = x; // Первый член ряда
        int sign = 1;
        int n = 1;

        while (Math.abs(term) >= precision) {
            if (isNaN(sinX)) {
                return sinX;
            }
            sinX += term;
            n += 2;
            sign *= -1;
            term = sign * Math.pow(x, n) / factorial(n);
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
