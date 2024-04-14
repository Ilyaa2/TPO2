package trigonometric;

import org.example.trigonometric.Sin;
import org.example.trigonometric.Tan;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TanTest {


    @Mock
    private Sin mockSin;


    @Test
    void tanTest() {
        double angle = Math.PI / 4;
        double precision = 0.0001;
        double sinResult = Math.sqrt(2) / 2;
        boolean expected = false;

        when(mockSin.calculate(angle, precision)).thenReturn(sinResult);

        Tan tan = new Tan(mockSin);

        double tanDiff = Math.abs(tan.calculate(angle, precision) - Math.tan(angle));

        if (tanDiff <= precision) expected = true;
        Assertions.assertTrue(expected);
    }

}
