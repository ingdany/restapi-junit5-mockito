package com.kaligent.restapijunit5mockito.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.*;

// import com.kaligent.restapijunit5mockito.calculator.*;
import com.kaligent.restapijunit5mockito.calculator.impl.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.List;

public class MixOperationsTest {

    @Mock
    List<String> mockList;

    @InjectMocks
    MixOperationsImpl mockMixOperationsImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void multiplyTest() {
        MixOperations mixOperations = new MixOperationsImpl();
        assertEquals(mixOperations.multiply(2, 3), 6);
    }

    @Test
    public void multiplySumTest() {
        Sum sum = new SumImpl();
        MixOperations mixOperations = new MixOperationsImpl();
        mixOperations.setSum(sum);
        assertEquals(mixOperations.multiplySum(2, 3, 2), 12);
    }

    @Test
    public void multiplySumMockito() {
        Sum sum = Mockito.mock(Sum.class);
        when(sum.result(2, 3)).thenReturn(5);

        MixOperations mixOperations = new MixOperationsImpl();
        mixOperations.setSum(sum);
        assertEquals(mixOperations.multiplySum(2, 3, 2), 10);
    }

    @Test
    public void operationsListMockito() {
        mockList.add("Sum");

        when(mockList.get(0)).thenReturn("Sum");
        when(mockList.size()).thenReturn(1);
        assertEquals("Sum", mockList.get(0));
        assertEquals(1, mockList.size());

        assertEquals(mockMixOperationsImpl.getOperations().get(0), "Divide");
        assertEquals(mockMixOperationsImpl.getOperations().size(), 1);
    }
}
