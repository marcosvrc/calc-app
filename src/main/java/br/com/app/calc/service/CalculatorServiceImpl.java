package br.com.app.calc.service;

import br.com.app.calc.factory.CalculatorFactory;
import br.com.app.calc.strategy.IBinaryOperation;
import br.com.app.calc.strategy.IConstOperation;
import br.com.app.calc.strategy.IUnaryOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl  implements ICalculatorService {

    private final CalculatorFactory calculatorFactory;

    @Autowired
    public CalculatorServiceImpl(CalculatorFactory calculatorFactory) {
        this.calculatorFactory = calculatorFactory;
    }

    @Override
    public Double unaryOperation(String operation, Double number) {
        IUnaryOperation unaryOperation = calculatorFactory.createUnaryOperation(operation);
        return unaryOperation.calculate(number);
    }

    @Override
    public Double binaryOperation(String operation, Double number1, Double number2) {
        IBinaryOperation binaryOperation = calculatorFactory.createBinaryOperation(operation);
        return binaryOperation.calculate(number1, number2);
    }

    @Override
    public Double constOperation(String operation) {
        IConstOperation constOperation = calculatorFactory.createConstOperation(operation);
        return constOperation.value();
    }
}
