package br.com.app.calc.strategy;

public interface IBinaryOperation extends IOperation {

    Double calculate(Double number1, Double number2);
    
}
