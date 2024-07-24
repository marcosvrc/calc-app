package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TanOperation Test")
class TanOperationTest {

    private final TanOperation tanOperation = new TanOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = tanOperation.calculate(Math.PI / 4);
        assertEquals(1.0, result, 0.0001, "The calculate method should return the correct tangent value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = tanOperation.getName();
        assertEquals(OperationEnum.TAN.getOperation(), name, "The getName method should return the correct operation name");
    }
}