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
        //when(mockSin.calculate(0.2, precision)).thenReturn(Math.sin(0.2));
        //when(mockCos.calculate(0.2, precision)).thenReturn(Math.cos(0.2));
        //when(mockCot.calculate(0.2, precision)).thenReturn(Math.cos(0.2) / Math.sin(0.2));
        //when(mockCsc.calculate(0.2, precision)).thenReturn(1 / Math.sin(0.2));
        //when(mockSec.calculate(0.2, precision)).thenReturn(1 / Math.cos(0.2));
        //when(mockTan.calculate(0.2, precision)).thenReturn(Math.tan(0.2));

        when(mockLog2.calculate(0.2, precision)).thenReturn(Math.log(0.2) / Math.log(2));
        when(mockLog3.calculate(0.2, precision)).thenReturn(Math.log(0.2) / Math.log(3));
        when(mockLog5.calculate(0.2, precision)).thenReturn(Math.log(0.2) / Math.log(5));

        FunctionsSystem functionsSystem = new FunctionsSystem(mockSin, mockCos, mockTan, mockCot, mockSec, mockCsc, mockLog3, mockLog5, mockLog2, mockLn);

        var result = functionsSystem.calculate(input, precision);
        var diff = Math.abs(expectedResult - result);
        //System.out.println(result);
        Assertions.assertTrue(diff <= precision);
    }
}
