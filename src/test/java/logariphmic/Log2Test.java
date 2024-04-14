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
public class Log2Test {
    int base = 2;

    @Mock
    private Ln mockLn;

    @Test
    void log2Test() {
        double x = 8;
        double precision = 0.0001;
        double expectedAnswer = 3;

        when(mockLn.calculate(x, precision)).thenReturn(Math.log(x));
        when(mockLn.calculate(base, precision)).thenReturn(Math.log(base));

        Log log = new Log(mockLn, base);
        var result = log.calculate(x, precision);
        double diff = Math.abs(result - expectedAnswer);
        Assertions.assertTrue(diff <= precision);
    }
}
