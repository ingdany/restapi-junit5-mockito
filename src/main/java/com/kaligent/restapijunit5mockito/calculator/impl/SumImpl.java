package com.kaligent.restapijunit5mockito.calculator.impl;

import com.kaligent.restapijunit5mockito.calculator.Sum;

public class SumImpl implements Sum {

    @Override
    public int result(int a, int b) {
        return a+b;
    }

}
