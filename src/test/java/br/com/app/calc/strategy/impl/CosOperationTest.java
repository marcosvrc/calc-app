package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("CosOperation Test")
public class CosOperationTest {

    private final CosOperation cosOperation = new CosOperation();

    @Test
    @DisplayName("Test calculate method")
    void testCalculate() {
        Double result = cosOperation.calculate(Math.PI / 3);
        assertEquals(0.5, result, 0.0001, "The calculate method should return the correct cosine value");
    }

    @Test
    @DisplayName("Test getName method")
    void testGetName() {
        String name = cosOperation.getName();
        assertEquals(OperationEnum.COS.getOperation(), name, "The getName method should return the correct operation name");
    }
}
