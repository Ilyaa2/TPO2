package trigonometric;

import org.example.trigonometric.Cos;
import org.example.trigonometric.Sin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CosTest {

    @Mock
    private Sin mockSin;


    @Test
    void cosTest() {
        double angle = Math.PI / 4;
        double precision = 0.0001;
        double sinResult = Math.sqrt(2) / 2;
        boolean expected = false;
        when(mockSin.calculate(angle, precision)).thenReturn(sinResult);

        Cos cos = new Cos(mockSin);

        double tanDiff = Math.abs(cos.calculate(angle, precision) - Math.cos(angle));

        if (tanDiff <= precision) expected = true;
        Assertions.assertTrue(expected);
    }

    @Test
    void cosTest1() {
        double angle = Math.PI / 2;
        double precision = 0.0001;
        double sinResult = 1;
        boolean expected = false;
        when(mockSin.calculate(angle, precision)).thenReturn(sinResult);

        Cos cos = new Cos(mockSin);

        double tanDiff = Math.abs(cos.calculate(angle, precision) - Math.cos(angle));

        if (tanDiff <= precision) expected = true;
        Assertions.assertTrue(expected);
    }
}
