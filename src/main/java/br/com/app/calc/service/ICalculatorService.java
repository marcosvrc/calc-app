package br.com.app.calc.service;

public interface ICalculatorService {

    Double unaryOperation(String operation, Double number);
    Double binaryOperation(String operation, Double number1, Double number2);
    Double constOperation(String operation);
}
