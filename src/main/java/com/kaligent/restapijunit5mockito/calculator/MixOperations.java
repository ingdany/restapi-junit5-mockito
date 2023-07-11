package com.kaligent.restapijunit5mockito.calculator;

import java.util.List;

public interface MixOperations {

    public Sum getSum();

    public void setSum(Sum sum);

    public int multiplySum(int a, int b, int multiply);

    public int multiply(int a, int b);

    public List<String> getOperations();

    public void setOperations(List<String> operations);
}