package trigonometric;


import org.example.trigonometric.Sec;
import org.example.trigonometric.Sin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SecTest {

    @Mock
    private Sin mockSin;

    @Test
    void secTest() {
        double angle = Math.PI / 4;
        double precision = 0.0001;
        double sinResult = Math.sqrt(2) / 2;
        boolean expected = false;

        when(mockSin.calculate(angle, precision)).thenReturn(sinResult);

        Sec sec = new Sec(mockSin);

        double tanDiff = Math.abs(sec.calculate(angle, precision) - 1 / Math.cos(angle));

        if (tanDiff <= precision) expected = true;
        Assertions.assertTrue(expected);

    }
}
