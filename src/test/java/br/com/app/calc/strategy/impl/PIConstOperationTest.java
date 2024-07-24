package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("PIConstOperation Test")
class PIConstOperationTest {

    private final PIConstOperation piConstOperation = new PIConstOperation();

    @Test
    @DisplayName("Test value method")
    void testValue() {
        Double result = piConstOperation.value();
        assertEquals(Math.PI, result, 0.0001, "The value method should return the correct PI value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = piConstOperation.getName();
        assertEquals(OperationEnum.PI.getOperation(), name, "The getName method should return the correct operation name");
    }
}