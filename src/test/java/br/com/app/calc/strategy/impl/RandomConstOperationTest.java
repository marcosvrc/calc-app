package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("RandomConstOperation Test")
class RandomConstOperationTest {

    private final RandomConstOperation randomConstOperation = new RandomConstOperation();

    @Test
    @DisplayName("Test value method")
    void testValue() {
        Double result = randomConstOperation.value();
        assertTrue(result >= 0.0 && result <= 1.0, "The value method should return a value between 0.0 and 1.0");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = randomConstOperation.getName();
        assertEquals(OperationEnum.RANDOM.getOperation(), name, "The getName method should return the correct operation name");
    }
}