package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("PowOperation Test")
class PowOperationTest {

    private final PowOperation powOperation = new PowOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = powOperation.calculate(2.0, 3.0);
        assertEquals(8.0, result, 0.0001, "The calculate method should return the correct power value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = powOperation.getName();
        assertEquals(OperationEnum.POW.getOperation(), name, "The getName method should return the correct operation name");
    }
}