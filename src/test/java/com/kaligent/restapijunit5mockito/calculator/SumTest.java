package com.kaligent.restapijunit5mockito.calculator;

// import com.kaligent.restapijunit5mockito.calculator.Sum;
import com.kaligent.restapijunit5mockito.calculator.impl.SumImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    public void sumResultTest() {
        int a = 2;
        int b = 2;
        Sum sum = new SumImpl();
        assertEquals(sum.result(a, b), 4);
    }

}
