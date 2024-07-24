package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("EulerConstOperation Test")
class EulerConstOperationTest {

    private final EulerConstOperation eulerConstOperation = new EulerConstOperation();

    @Test
    @DisplayName("Test value method")
    void testValue() {
        Double result = eulerConstOperation.value();
        assertEquals(Math.E, result, 0.0001, "The value method should return the correct Euler's number value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = eulerConstOperation.getName();
        assertEquals(OperationEnum.EULER.getOperation(), name, "The getName method should return the correct operation name");
    }
}