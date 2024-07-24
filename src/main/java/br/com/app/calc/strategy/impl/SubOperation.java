package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IBinaryOperation;

public class SubOperation implements IBinaryOperation {

    @Override
    public Double calculate(Double number1, Double number2) {
        return number1 - number2;
    }

    @Override
    public String getName() {
        return OperationEnum.SUB.getOperation();
    }
}
