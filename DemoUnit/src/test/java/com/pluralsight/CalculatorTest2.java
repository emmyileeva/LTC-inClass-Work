package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest2 {

    @Test
    void subtract_shouldReturnSubtractionOfTwoNumbers() {
        // arrange
        int firstNumber = 4;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator cn = new Calculator();
        // act
        int acctualFunctionResult = cn.subtract(firstNumber, secondNumber);
        // assert
        assertEquals(expectedResult, acctualFunctionResult);
    }
}