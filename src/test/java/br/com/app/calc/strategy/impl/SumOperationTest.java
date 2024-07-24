package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SumOperation Test")
class SumOperationTest {

    private final SumOperation sumOperation = new SumOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = sumOperation.calculate(6.0, 3.0);
        assertEquals(9.0, result, 0.0001, "The calculate method should return the correct sum result");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = sumOperation.getName();
        assertEquals(OperationEnum.SUM.getOperation(), name, "The getName method should return the correct operation name");
    }
}
