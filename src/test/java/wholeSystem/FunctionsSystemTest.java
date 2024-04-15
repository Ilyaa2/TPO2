package wholeSystem;

import org.example.FunctionsSystem;
import org.example.logariphmic.Ln;
import org.example.logariphmic.Log;
import org.example.trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.lang.Double.NaN;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FunctionsSystemTest {
    @Mock
    private Sin mockSin;
    @Mock
    private Cos mockCos;
    @Mock
    private Cot mockCot;
    @Mock
    private Csc mockCsc;
    @Mock
    private Sec mockSec;
    @Mock
    private Tan mockTan;
    @Mock
    private Ln mockLn;
    @Mock
    private Log mockLog2;
    @Mock
    private Log mockLog3;
    @Mock
    private Log mockLog5;

    @Test
    void extremumTest() {
        double input = 0.2;
        double precision = 0.0001;
        double expectedResult = 0.2277;

        when(mockLog2.calculate(0.2, precision)).thenReturn(Math.log(0.2) / Math.log(2));
        when(mockLog3.calculate(0.2, precision)).thenReturn(Math.log(0.2) / Math.log(3));
        when(mockLog5.calculate(0.2, precision)).thenReturn(Math.log(0.2) / Math.log(5));

        FunctionsSystem functionsSystem = new FunctionsSystem(mockSin, mockCos, mockTan, mockCot, mockSec, mockCsc, mockLog3, mockLog5, mockLog2, mockLn);

        var result = functionsSystem.calculate(input, precision);
        var diff = Math.abs(expectedResult - result);
        //System.out.println(result);
        Assertions.assertTrue(diff <= precision);
    }

    @Test
    void trigonometricTest() {
        double input = -4.202;
        double precision = 0.0001;
        double expectedResult = 3981.0886775189692;
        when(mockSin.calculate(input, precision)).thenReturn(Math.sin(input));
        when(mockCos.calculate(input, precision)).thenReturn(Math.cos(input));
        when(mockCot.calculate(input, precision)).thenReturn(Math.cos(input) / Math.sin(input));
        when(mockCsc.calculate(input, precision)).thenReturn(1 / Math.sin(input));
        when(mockSec.calculate(input, precision)).thenReturn(1 / Math.cos(input));
        when(mockTan.calculate(input, precision)).thenReturn(Math.tan(input));

        FunctionsSystem functionsSystem = new FunctionsSystem(mockSin, mockCos, mockTan, mockCot, mockSec, mockCsc, mockLog3, mockLog5, mockLog2, mockLn);

        var result = functionsSystem.calculate(input, precision);
        var diff = Math.abs(expectedResult - result);
        System.out.println(result);
        Assertions.assertTrue(diff <= precision);
    }

    @Test
    void trigonometricTest1() {
        double input = -10.478;
        double precision = 0.0001;
        double expectedResult = 3414.2606844805628;
        when(mockSin.calculate(input, precision)).thenReturn(Math.sin(input));
        when(mockCos.calculate(input, precision)).thenReturn(Math.cos(input));
        when(mockCot.calculate(input, precision)).thenReturn(Math.cos(input) / Math.sin(input));
        when(mockCsc.calculate(input, precision)).thenReturn(1 / Math.sin(input));
        when(mockSec.calculate(input, precision)).thenReturn(1 / Math.cos(input));
        when(mockTan.calculate(input, precision)).thenReturn(Math.tan(input));

        FunctionsSystem functionsSystem = new FunctionsSystem(mockSin, mockCos, mockTan, mockCot, mockSec, mockCsc, mockLog3, mockLog5, mockLog2, mockLn);

        var result = functionsSystem.calculate(input, precision);
        var diff = Math.abs(expectedResult - result);
        System.out.println(result);
        Assertions.assertTrue(diff <= precision);
    }
}
