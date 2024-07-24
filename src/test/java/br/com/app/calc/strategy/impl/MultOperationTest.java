package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("MultOperation Test")
class MultOperationTest {

    private final MultOperation multOperation = new MultOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = multOperation.calculate(6.0, 3.0);
        assertEquals(18.0, result, 0.0001, "The calculate method should return the correct mult result");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = multOperation.getName();
        assertEquals(OperationEnum.MULT.getOperation(), name, "The getName method should return the correct operation name");
    }
}
