package logariphmic;

import org.example.logariphmic.Ln;
import org.example.logariphmic.Log;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Log3Test {
    int base = 3;

    @Mock
    private Ln mockLn;

    @Test
    void log3Test1() {
        double x = 81;
        double precision = 0.0001;
        double expectedAnswer = 4;

        when(mockLn.calculate(x, precision)).thenReturn(Math.log(x));
        when(mockLn.calculate(base, precision)).thenReturn(Math.log(base));

        Log log = new Log(mockLn, base);
        var result = log.calculate(x, precision);
        double diff = Math.abs(result - expectedAnswer);
        Assertions.assertTrue(diff <= precision);
    }

    @Test
    void log3Test2() {
        double x = 3;
        double precision = 0.0001;
        double expectedAnswer = 1;

        when(mockLn.calculate(x, precision)).thenReturn(Math.log(x));
        when(mockLn.calculate(base, precision)).thenReturn(Math.log(base));

        Log log = new Log(mockLn, base);
        var result = log.calculate(x, precision);
        double diff = Math.abs(result - expectedAnswer);
        Assertions.assertTrue(diff <= precision);
    }

    @Test
    void log3Test3() {
        double x = 243;
        double precision = 0.0001;
        double expectedAnswer = 5;

        when(mockLn.calculate(x, precision)).thenReturn(Math.log(x));
        when(mockLn.calculate(base, precision)).thenReturn(Math.log(base));

        Log log = new Log(mockLn, base);
        var result = log.calculate(x, precision);
        double diff = Math.abs(result - expectedAnswer);
        Assertions.assertTrue(diff <= precision);
    }
}
