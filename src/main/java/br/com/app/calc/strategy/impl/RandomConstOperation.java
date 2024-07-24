package br.com.app.calc.strategy.impl;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IConstOperation;

public class RandomConstOperation implements IConstOperation {

    @Override
    public String getName() {
        return OperationEnum.RANDOM.getOperation();
    }

    @Override
    public Double value() {
        return Math.random();
    }
}
