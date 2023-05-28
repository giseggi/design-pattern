package com.giseggi.designpattern.factorypattern;

import com.giseggi.designpattern.factorypattern.impl.Addition;
import com.giseggi.designpattern.factorypattern.impl.Subtraction;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class OperatorFactory {

    private Map<String, Operation> operationMap;

    OperatorFactory(){
        operationMap = new HashMap<>();
        operationMap.put("add", new Addition());
        operationMap.put("subtract", new Subtraction());
    }

    public Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}
