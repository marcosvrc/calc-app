package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SqrtOperation Test")
class SqrtOperationTest {

    private final SqrtOperation sqrtOperation = new SqrtOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = sqrtOperation.calculate(16.0);
        assertEquals(4.0, result, 0.0001, "The calculate method should return the correct square root value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = sqrtOperation.getName();
        assertEquals(OperationEnum.SQRT.getOperation(), name, "The getName method should return the correct operation name");
    }
}