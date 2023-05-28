package com.giseggi.designpattern.factorypattern.impl;

import com.giseggi.designpattern.factorypattern.Operation;

public class Addition implements Operation {
    @Override
    public int cal(int num1, int num2) {
        return num1 + num2;
    }
}
