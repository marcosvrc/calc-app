package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IConstOperation;

public class PIConstOperation implements IConstOperation {

    @Override
    public String getName() {
        return OperationEnum.PI.getOperation();
    }

    @Override
    public Double value() {
        return Math.PI;
    }
}
