package org.example;

import org.example.logariphmic.Ln;
import org.example.logariphmic.Log;
import org.example.trigonometric.*;

import javax.naming.PartialResultException;

public class FunctionsSystem {

    private Sin sin;
    private Cos cos;
    private Tan tan;
    private Cot cot;
    private Sec sec;
    private Csc csc;
    private Log log_3;
    private Log log_5;
    private Log log_2;
    private Ln ln;

    public FunctionsSystem(Sin sin, Cos cos, Tan tan, Cot cot, Sec sec, Csc csc, Log log_3, Log log_5, Log log_2, Ln ln) {
        this.sin = sin;
        this.cos = cos;
        this.tan = tan;
        this.cot = cot;
        this.sec = sec;
        this.csc = csc;
        this.log_3 = log_3;
        this.log_2 = log_2;
        this.log_5 = log_5;
        this.ln = ln;
    }

    public double calculate(double x, double precision) {
        double result = 0;
        if (x <= 0) {
//            result = ((Math.pow(Math.pow((Math.pow((((((Math.pow(csc.calculate(x, precision), 3) * sin.calculate(x, precision) * sin.calculate(x, precision) + Math.pow(sec.calculate(x, precision), 2))
//                    / tan.calculate(x, precision) / cot.calculate(x, precision))
//                    + Math.pow(sec.calculate(x, precision), 3)) + csc.calculate(x, precision))
//                    * sin.calculate(x, precision)), 3) + (Math.pow(tan.calculate(x, precision), 2) - sec.calculate(x, precision)))
//                    / cos.calculate(x, precision), 3), 2) / cot.calculate(x, precision))
//                    / Math.pow(Math.pow(cos.calculate(x, precision) / ((cos.calculate(x, precision) - csc.calculate(x, precision))
//                    / (sec.calculate(x, precision))), 2) * tan.calculate(x, precision), 3)
//
//
//                    + Math.pow((csc.calculate(x, precision) + (tan.calculate(x, precision) + Math.pow(cot.calculate(x, precision) * (cos.calculate(x, precision) + (Math.pow(tan.calculate(x, precision), 2) *
//                    ((tan.calculate(x, precision)) / (sin.calculate(x, precision))))), 3)))
//
//
//                    + (sec.calculate(x, precision) - csc.calculate(x, precision))
//                    / Math.pow(sin.calculate(x, precision) - ((sec.calculate(x, precision) - sin.calculate(x, precision) - sec.calculate(x, precision)) + (cos.calculate(x, precision) *
//                    ((cot.calculate(x, precision) - Math.pow(sec.calculate(x, precision), 2) * ((sin.calculate(x, precision) + sin.calculate(x, precision))) / (Math.pow(csc.calculate(x, precision), 3)))) / (sin.calculate(x, precision)))), 3), 2));

            result = (((Math.pow(Math.pow(((Math.pow((((((((((Math.pow(csc.calculate(x,precision), 3)) * sin.calculate(x, precision)) * sin.calculate(x, precision) ) + Math.pow(sec.calculate(x,precision), 2)) / tan.calculate(x, precision)) / cot.calculate(x,precision) ) + Math.pow(sec.calculate(x,precision), 3)) + csc.calculate(x,precision)) * sin.calculate(x,precision)), 3) + (Math.pow(tan.calculate(x,precision), 2) - sec.calculate(x,precision) )) / Math.pow(cos.calculate(x,precision), 2)), 3), 2) / Math.pow(cot.calculate(x, precision), 3)) / Math.pow(((cos.calculate(x, precision) / Math.pow(((cos.calculate(x, precision) - csc.calculate(x, precision)  ) / sec.calculate(x, precision)), 2)) * tan.calculate(x, precision) ), 3)) + Math.pow(((csc.calculate(x, precision) + (tan.calculate(x, precision) + Math.pow((cot.calculate(x, precision) * (cos.calculate(x, precision) + (Math.pow(tan.calculate(x, precision), 2) * (tan.calculate(x, precision) / sin.calculate(x, precision))))), 3))) + ((sec.calculate(x, precision) - csc.calculate(x, precision)  ) / (sin.calculate(x, precision) - (((sec.calculate(x,precision) - sin.calculate(x, precision)  ) - sec.calculate(x, precision)  ) + (cos.calculate(x, precision) * Math.pow((((cot.calculate(x, precision) - Math.pow(sec.calculate(x, precision), 2)) * Math.pow(((sin.calculate(x, precision) + sin.calculate(x, precision) ) / Math.pow(csc.calculate(x, precision), 3)), 3)) / sin.calculate(x,precision) ), 3)))))), 2));
        } else {
            result = (Math.pow((((log_3.calculate(x, precision) + log_3.calculate(x, precision)) - log_2.calculate(x, precision)) / log_3.calculate(x, precision)), 2) *
                    (Math.pow(log_5.calculate(x, precision), 3) - log_2.calculate(x, precision)));
        }
        return result;
    }

}
