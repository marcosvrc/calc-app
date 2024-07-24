package br.com.app.calc.controller;

import br.com.app.calc.service.ICalculatorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculator/v1")
public class CalculatorController {

    private final ICalculatorService calculatorService;

    @Autowired
    public CalculatorController (ICalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @Operation(summary = "Calculate Unary Operation")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Calculate Unary Operation")
    })

    @Parameters({
            @Parameter(name = "operation", description = "Operation for Calculate Unary: cos / sin / tan / log / pow / sqrt", required = true, example = "cos"),
            @Parameter(name = "number", description = "First number", required = true)
    })
    @GetMapping("/calculate/unary/{operation}/{number}")
    public Double unaryOperation(
            @PathVariable("operation") String operation,
            @PathVariable("number") Double number) {
        return calculatorService.unaryOperation(operation, number);
    }

    @Operation(summary = "Calculate Binary Operation")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Calculate Binary Operation")
    })

    @Parameters({
            @Parameter(name = "operation", description = "Operation for Calculate Binary: sum / div / mult / sub / pow", required = true, example = "sum"),
            @Parameter(name = "number1", description = "First number", required = true),
            @Parameter(name = "number2", description = "Second number", required = true)
    })
    @GetMapping("/calculate/binary/{operation}/{number1}/{number2}")
    public Double binaryOperation(
            @PathVariable("operation") String operation,
            @PathVariable("number1") Double number1,
            @PathVariable("number2") Double number2) {
        return calculatorService.binaryOperation(operation, number1, number2);
    }

    @Operation(summary = "Return value of a constant operation")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Return value of a constant operation")
    })
    @Parameters({
            @Parameter(name = "operation", description = "Operation for Const Value: pi / euler / random", required = true, example = "pi")
    })
    @GetMapping("/const/{operation}")
    public Double constOperation( @PathVariable("operation") String operation) {
        return calculatorService.constOperation(operation);
    }
}
