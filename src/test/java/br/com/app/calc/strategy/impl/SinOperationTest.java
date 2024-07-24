package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SinOperation Test")
class SinOperationTest {

    private final SinOperation sinOperation = new SinOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = sinOperation.calculate(Math.PI / 2);
        assertEquals(1.0, result, 0.0001, "The calculate method should return the correct sine value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = sinOperation.getName();
        assertEquals(OperationEnum.SIN.getOperation(), name, "The getName method should return the correct operation name");
    }
}