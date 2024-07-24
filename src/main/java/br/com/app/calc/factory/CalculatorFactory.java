package br.com.app.calc.factory;

import br.com.app.calc.enums.OperationEnum;
import br.com.app.calc.strategy.IBinaryOperation;
import br.com.app.calc.strategy.IConstOperation;
import br.com.app.calc.strategy.IUnaryOperation;
import br.com.app.calc.strategy.impl.*;
import org.springframework.stereotype.Component;

@Component
public class CalculatorFactory {

    public IBinaryOperation createBinaryOperation(String operation) {
       if (operation.equals(OperationEnum.SUM.getOperation())) {
           return new SumOperation();
       } else if(operation.equals(OperationEnum.SUB.getOperation())) {
           return new SubOperation();
       } else if(operation.equals(OperationEnum.MULT.getOperation())) {
           return new MultOperation();
       } else if(operation.equals(OperationEnum.DIV.getOperation())) {
           return new DivOperation();
       }else if(operation.equals(OperationEnum.POW.getOperation())) {
               return new PowOperation();
       } else {
           return null;
       }
    }

    public IUnaryOperation createUnaryOperation(String operation) {
        if (operation.equals(OperationEnum.LOG.getOperation())) {
            return new LogOperation();
        } else if(operation.equals(OperationEnum.COS.getOperation())) {
            return new CosOperation();
        } else if(operation.equals(OperationEnum.SIN.getOperation())){
            return new SinOperation();
        } else if(operation.equals(OperationEnum.TAN.getOperation())){
            return new TanOperation();
        } else if(operation.equals(OperationEnum.SQRT.getOperation())){
            return new SqrtOperation();
        } else {
            return null;
        }
    }

    public IConstOperation createConstOperation(String operation) {
        if (operation.equals(OperationEnum.PI.getOperation())) {
            return new PIConstOperation();
        } else if(operation.equals(OperationEnum.EULER.getOperation())) {
            return new EulerConstOperation();
        } else if(operation.equals(OperationEnum.RANDOM.getOperation())) {
            return new RandomConstOperation();
        } else {
            return null;
        }
    }
}
