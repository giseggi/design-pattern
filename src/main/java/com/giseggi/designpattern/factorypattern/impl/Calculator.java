package com.giseggi.designpattern.factorypattern.impl;

import com.giseggi.designpattern.factorypattern.Operation;
import com.giseggi.designpattern.factorypattern.OperatorFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Calculator {

    private final OperatorFactory operatorFactory;

    public int calculate(int num1, int num2, String operator) {
        Operation operation = operatorFactory.getOperation(operator).orElseThrow(IllegalArgumentException::new);

        return operation.cal(num1, num2);
    }
}
