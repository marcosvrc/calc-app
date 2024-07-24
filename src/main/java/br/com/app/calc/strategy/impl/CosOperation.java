package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IUnaryOperation;

public class CosOperation implements IUnaryOperation {

    @Override
    public Double calculate(Double number) {
        return Math.cos(number);
    }

    @Override
    public String getName() {
        return OperationEnum.COS.getOperation();
    }
}
