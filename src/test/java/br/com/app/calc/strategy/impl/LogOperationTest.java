package br.com.app.calc.strategy.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("LogOperation Test")
class LogOperationTest {

    private final LogOperation logOperation = new LogOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = logOperation.calculate(Math.E);
        assertEquals(1.0, result, 0.0001, "The calculate method should return the correct logarithm value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = logOperation.getName();
        assertEquals("log", name, "The getName method should return the correct operation name");
    }
}