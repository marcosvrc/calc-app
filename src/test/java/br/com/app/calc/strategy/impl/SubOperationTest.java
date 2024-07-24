package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SubOperation Test")
class SubOperationTest {

    private final SubOperation subOperation = new SubOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = subOperation.calculate(6.0, 3.0);
        assertEquals(3.0, result, 0.0001, "The calculate method should return the correct sub result");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = subOperation.getName();
        assertEquals(OperationEnum.SUB.getOperation(), name, "The getName method should return the correct operation name");
    }
}
