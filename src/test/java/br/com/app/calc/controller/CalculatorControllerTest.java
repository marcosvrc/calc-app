package br.com.app.calc.controller;

import br.com.app.calc.service.ICalculatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.List;

import static org.hamcrest.Matchers.matchesPattern;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

 @WebMvcTest(CalculatorController.class)
 @DisplayName("Calculator Controller Test")
 class CalculatorControllerTest {

     @Autowired
     private MockMvc mockMvc;

     @MockBean
     private ICalculatorService calculatorService;

     @Test
     @DisplayName("GET /unary/{operation}/{number} - Success")
     void testUnaryOperation() throws Exception {
         given(calculatorService.unaryOperation("sqrt", 4.0)).willReturn(2.0);

         mockMvc.perform(get("/calculator/v1/calculate/unary/sqrt/4.0"))
                 .andExpect(status().isOk())
                 .andExpect(content().string("2.0"));
        }

        @Test
        @DisplayName("GET /binary/{operation}/{number1}/{number2} - Success")
        void testBinaryOperation() throws Exception {
            given(calculatorService.binaryOperation("sum", 2.0, 3.0)).willReturn(5.0);

            mockMvc.perform(get("/calculator/v1/calculate/binary/sum/2.0/3.0"))
                    .andExpect(status().isOk())
                    .andExpect(content().string("5.0"));
        }

        @Test
        @DisplayName("GET /const/{operation} - Success")
        void testConstOperation() throws Exception {
            given(calculatorService.constOperation("pi")).willReturn(Math.PI);

            mockMvc.perform(get("/calculator/v1/const/pi"))
                    .andExpect(status().isOk())
                    .andExpect(content().string(String.valueOf(Math.PI)));
        }
}