package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IUnaryOperation;

public class TanOperation implements IUnaryOperation {

    @Override
    public String getName() {
        return OperationEnum.TAN.getOperation();
    }

    @Override
    public Double calculate(Double number) {
        return Math.tan(number);
    }
}
