package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTests {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        assertEquals(5, calculator.add(2,3));
        assertEquals(-1, calculator.add(-2, 1));
    }

    @Test
    public void testDivideByZero_Success(){

     Exception exception = assertThrows(IllegalArgumentException.class, ()->
     {
         calculator.divide(1,0);
     });

     assertEquals("Can not divide by 0", exception.getMessage());
    }

}