package com.kaligent.restapijunit5mockito.calculator.impl;

import java.util.List;

import com.kaligent.restapijunit5mockito.calculator.*;

public class MixOperationsImpl implements MixOperations {

    private Sum sum;
    private List<String> operations;

    @Override
    public Sum getSum() {
        return sum;
    }

    @Override
    public void setSum(Sum sum) {
        this.sum = sum;
    }

    @Override
    public int multiplySum(int a, int b, int multiply) {
        return sum.result(a, b) * multiply;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public List<String> getOperations() {
        return operations;
    }

    @Override
    public void setOperations(List<String> operations) {
        this.operations = operations;
    }
}
