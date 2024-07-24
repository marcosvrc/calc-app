package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IUnaryOperation;

public class SinOperation implements IUnaryOperation {

    @Override
    public Double calculate(Double number) {
        return Math.sin(number);
    }

    @Override
    public String getName() {
        return OperationEnum.SIN.getOperation();
    }
}
