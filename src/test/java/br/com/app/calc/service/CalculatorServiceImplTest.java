package br.com.app.calc.service;

import br.com.app.calc.factory.CalculatorFactory;
import br.com.app.calc.strategy.IBinaryOperation;
import br.com.app.calc.strategy.IConstOperation;
import br.com.app.calc.strategy.IUnaryOperation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@DisplayName("Calculator Service Implementation Test")
class CalculatorServiceImplTest {

    @Mock
    private CalculatorFactory calculatorFactory;

    @Mock
    private IUnaryOperation unaryOperation;

    @Mock
    private IBinaryOperation binaryOperation;

    @Mock
    private IConstOperation constOperation;

    @InjectMocks
    private CalculatorServiceImpl calculatorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @DisplayName("Test unaryOperation method")
    void testUnaryOperation() {
        given(calculatorFactory.createUnaryOperation("sqrt")).willReturn(unaryOperation);
        given(unaryOperation.calculate(4.0)).willReturn(2.0);

        Double result = calculatorService.unaryOperation("sqrt", 4.0);
        assertEquals(2.0, result, "The unaryOperation method should return the correct result");
    }

    @Test
    @DisplayName("Test binaryOperation method")
    void testBinaryOperation() {
        given(calculatorFactory.createBinaryOperation("add")).willReturn(binaryOperation);
        given(binaryOperation.calculate(2.0, 3.0)).willReturn(5.0);

        Double result = calculatorService.binaryOperation("add", 2.0, 3.0);
        assertEquals(5.0, result, "The binaryOperation method should return the correct result");
    }

    @Test
    @DisplayName("Test constOperation method")
    void testConstOperation() {
        given(calculatorFactory.createConstOperation("pi")).willReturn(constOperation);
        given(constOperation.value()).willReturn(Math.PI);

        Double result = calculatorService.constOperation("pi");
        assertEquals(Math.PI, result, "The constOperation method should return the correct result");
    }

}


