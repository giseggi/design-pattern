package com.giseggi.designpattern.factorypattern.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void add() {
        assertDoesNotThrow(() -> calculator.calculate(1, 2, "add"));
        assertEquals(3, calculator.calculate(1, 2, "add"));
        assertEquals(1, calculator.calculate(2, 1, "subtract"));
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(1, 1, "multiply"));
    }
}