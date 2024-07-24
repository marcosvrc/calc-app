package br.com.app.calc.enums;

public enum OperationEnum {
    SUM("sum"),
    SUB("sub"),
    MULT("mult"),
    DIV("div"),
    SIN("sin"),
    COS("cos"),
    TAN("tan"),
    SQRT("sqrt"),
    POW("pow"),
    LOG("log"),
    EULER("euler"),
    RANDOM("random"),
    PI("pi");

    private final String operation;

    OperationEnum(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

}
