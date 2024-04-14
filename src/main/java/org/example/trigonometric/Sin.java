package org.example.trigonometric;

import org.example.Main;

import java.math.BigDecimal;

public class Sin {

    public double calculate(double x, double precision) {
//        double sinX = x;
//        int sign = -1;
//        int i = 0;
        double sinX = 0;
        double term = x; // Первый член ряда
        int sign = 1;
        int n = 1;
//        do {
//            int power = 2 * i + 1;
//            double term = sign * Math.pow(x, power) / factorial(power);
//            sinX += term;
//            sign *= -1;
//            i++;
//        } while (Math.abs(Math.sin(x) - sinX) > precision);
        while (Math.abs(term) >= precision) {
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
