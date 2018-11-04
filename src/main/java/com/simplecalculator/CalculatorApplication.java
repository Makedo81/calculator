package com.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
       //    SpringApplication.run(CalculatorApplication.class, args);
       //  }

        Calculator calculator = new Calculator();

        calculator.addAToB(15, 6);
        calculator.substractAFromB(5, 2);
        calculator.aDivideB(18, 6);
        calculator.aMultiplyB(61, 3);
    }
}