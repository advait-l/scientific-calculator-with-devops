package com.mycompany.app;

import org.junit.*;

import static org.junit.Assert.*;


public class AppTest 
{
    private App scientificCalculator;

    @Before
    public void setup(){
        scientificCalculator = new App();
    }

    // Square Root
    @Test
    public void squareRootTruePositive(){
        assertEquals(scientificCalculator.sqrt(49), 7, 0.2f);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals(scientificCalculator.sqrt(49), 5, 0.2f);
    }

    // Factorial
    @Test
    public void factorialTruePositive(){
        assertEquals(scientificCalculator.fact(5), 120, 0.2f);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals(scientificCalculator.fact(4), 120, 0.2f);
    }

    // Natural Logarithm
    @Test
    public void naturalLogarithmTruePositive(){
        assertEquals(scientificCalculator.nlog(1), 0, 0.2f);
    }

    @Test
    public void naturalLogarithmFalsePositive(){
        assertNotEquals(scientificCalculator.nlog(5), 10, 0.2f);
    }

    // Exponent
    @Test
    public void exponentTruePositive(){
        assertEquals(scientificCalculator.exp(2, 3), 8, 0.2f);
    }

    @Test
    public void exponentFalsePositive(){
        assertNotEquals(scientificCalculator.exp(4, 3), 16, 0.2f);
    }


}
