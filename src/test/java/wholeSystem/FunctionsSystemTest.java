package wholeSystem;

import org.example.FunctionsSystem;
import org.example.logariphmic.Ln;
import org.example.logariphmic.Log;
import org.example.trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collection;

import static java.lang.Double.NaN;
import static java.lang.Double.isNaN;
import static org.junit.jupiter.api.Assertions.assertEquals;
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

    static Collection<Object[]> dataForLog() {
        return Arrays.asList(new Object[][]{
                {0.2, 0.0001, 0.2277}, //input, precision, expectedResult
                {0.015, 0.000000000000001, -2.017},
                {4, 0.000000000000001, -0.234},
                {1, 0.000000000000001, NaN},
                {11.61, 0.000000000000001, 0}
        });
    }

    @ParameterizedTest
    @MethodSource("dataForLog")
    void TestLog(double input, double precision, double expected) {
        when(mockLog2.calculate(input, precision)).thenReturn(Math.log(input) / Math.log(2));
        when(mockLog3.calculate(input, precision)).thenReturn(Math.log(input) / Math.log(3));
        when(mockLog5.calculate(input, precision)).thenReturn(Math.log(input) / Math.log(5));
        FunctionsSystem functionsSystem = new FunctionsSystem(mockSin, mockCos, mockTan, mockCot, mockSec, mockCsc, mockLog3, mockLog5, mockLog2, mockLn);
        if (isNaN(expected)) {
            assertEquals(expected, functionsSystem.calculate(input, precision));
        } else {
            var diff = Math.abs(functionsSystem.calculate(input, precision) - expected);
            Assertions.assertTrue(diff <= 0.001);
        }
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
