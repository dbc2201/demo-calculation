package com.niit.bep.s1.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        // 1. Arrange - arrange all the data you need for calling the method under test.
        double firstNumber = 10.0;
        double secondNumber = 20.0;
        double expectedResult = 30.0;

        // 2. Act - call the method under test.
        double actualResult = main.add(firstNumber, secondNumber);

        // 3. Assert - check whether the expected result and actual result match
        Assertions.assertEquals(expectedResult, actualResult, "Please check the add() method");
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}