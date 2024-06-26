package trigonometric;

import org.example.Main;
import org.example.trigonometric.Sin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinTest {


    @Test
    public void sinTest() {
        Sin sin = new Sin();
        double precision = 0.0001;
        double angle = Math.PI / 2;
        boolean expected = false;

        double sinDiff = Math.abs(sin.calculate(angle, precision) - Math.sin(angle));

        if (sinDiff <= precision) expected = true;
        Assertions.assertTrue(expected);
    }


    @Test
    public void sinTest1() {
        Sin sin = new Sin();
        double precision = 0.0001;
        double angle = Math.PI / 4;
        boolean expected = false;

        double sinDiff = Math.abs(sin.calculate(angle, precision) - Math.sin(angle));

        if (sinDiff <= precision) expected = true;
        Assertions.assertTrue(expected);
    }


}
