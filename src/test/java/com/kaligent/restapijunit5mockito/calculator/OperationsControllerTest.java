package com.kaligent.restapijunit5mockito.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class OperationsControllerTest {

    OperationsController operations = new OperationsController();

    @DisplayName("Positive Test Add Method")
    @Test
    public void is_correct_add_method() {
        assertEquals(5, operations.add(2, 3));
    }

    @DisplayName("Negative Test Add Method")
    @Test
    public void is_incorrect_add_method() {
        assertNotEquals(0, operations.add(2, 3));
    }

    @DisplayName("Positive Test for Subtract")
    @Test
    public void is_correct_substract_method() {
        assertEquals(1, operations.subtract(2, 1));
    }

    @Test
    public void is_correct_multiply_method() {
        assertEquals(8, operations.multiply(2, 4));
    }

    @Test
    public void is_correct_divide_method() {
        assertEquals(2, operations.divide(4, 2), "Divide correct");
    }

    @Test
    public void is_correct_square_method() {
        assertEquals(64, operations.square(8), "Square method passed!!!");
    }
}
