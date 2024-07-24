package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    @DisplayName("DivOperation Test")
    class DivOperationTest {

        private final DivOperation divOperation = new DivOperation();

        @Test
        @DisplayName("Test calculate method")
        void testCalculate() {
            Double result = divOperation.calculate(6.0, 3.0);
            assertEquals(2.0, result, 0.0001, "The calculate method should return the correct division result");
        }

        @Test
        @DisplayName("Test getName method")
        void testGetName() {
            String name = divOperation.getName();
            assertEquals(OperationEnum.DIV.getOperation(), name, "The getName method should return the correct operation name");
        }
}
