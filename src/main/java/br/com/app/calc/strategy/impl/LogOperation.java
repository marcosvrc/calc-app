package br.com.app.calc.strategy.impl;

import br.com.app.calc.strategy.IUnaryOperation;

public class LogOperation implements IUnaryOperation {

    @Override
    public Double calculate(Double number) {
        return Math.log(number);
    }

    @Override
    public String getName() {
        return "log";
    }
}
