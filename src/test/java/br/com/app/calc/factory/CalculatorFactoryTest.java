package br.com.app.calc.factory;

import br.com.app.calc.strategy.impl.*;
import br.com.app.calc.enums.OperationEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CalculatorFactory Test")
class CalculatorFactoryTest {

    private final CalculatorFactory calculatorFactory = new CalculatorFactory();

    @Test
    @DisplayName("Test createBinaryOperation method")
    void testCreateBinaryOperation() {
        assertInstanceOf(SumOperation.class, calculatorFactory.createBinaryOperation(OperationEnum.SUM.getOperation()));
        assertInstanceOf(SubOperation.class, calculatorFactory.createBinaryOperation(OperationEnum.SUB.getOperation()));
        assertInstanceOf(MultOperation.class, calculatorFactory.createBinaryOperation(OperationEnum.MULT.getOperation()));
        assertInstanceOf(DivOperation.class, calculatorFactory.createBinaryOperation(OperationEnum.DIV.getOperation()));
        assertInstanceOf(PowOperation.class, calculatorFactory.createBinaryOperation(OperationEnum.POW.getOperation()));
        assertNull(calculatorFactory.createBinaryOperation("invalid"));
    }

    @Test
    @DisplayName("Test createUnaryOperation method")
    void testCreateUnaryOperation() {
        assertInstanceOf(LogOperation.class, calculatorFactory.createUnaryOperation(OperationEnum.LOG.getOperation()));
        assertInstanceOf(CosOperation.class, calculatorFactory.createUnaryOperation(OperationEnum.COS.getOperation()));
        assertInstanceOf(SinOperation.class, calculatorFactory.createUnaryOperation(OperationEnum.SIN.getOperation()));
        assertInstanceOf(TanOperation.class, calculatorFactory.createUnaryOperation(OperationEnum.TAN.getOperation()));
        assertInstanceOf(SqrtOperation.class, calculatorFactory.createUnaryOperation(OperationEnum.SQRT.getOperation()));
        assertNull(calculatorFactory.createUnaryOperation("invalid"));
    }

    @Test
    @DisplayName("Test createConstOperation method")
    void testCreateConstOperation() {
        assertInstanceOf(PIConstOperation.class, calculatorFactory.createConstOperation(OperationEnum.PI.getOperation()));
        assertInstanceOf(EulerConstOperation.class, calculatorFactory.createConstOperation(OperationEnum.EULER.getOperation()));
        assertInstanceOf(RandomConstOperation.class, calculatorFactory.createConstOperation(OperationEnum.RANDOM.getOperation()));
        assertNull(calculatorFactory.createConstOperation("invalid"));
    }
}