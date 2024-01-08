package com.example.myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtractPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    // ... more test cases for different scenarios
}

