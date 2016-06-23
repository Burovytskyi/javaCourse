package com.Burovitskiy.app.Calculator;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testPlus() throws Exception {
        Calculator calculator = new Calculator();
        calculator.plus(2, 4);
        assertEquals(6, (int) calculator.getResult());
    }

    @Test
    public void testMinus() throws Exception {
        Calculator calculator = new Calculator();
        calculator.minus(5, 3);
        assertEquals(2, (int) calculator.getResult());
    }

    @Test
    public void testMultiply() throws Exception {
        Calculator calculator = new Calculator();
        calculator.multiply(3, 3);
        assertEquals(9, (int) calculator.getResult());
    }

    @Test
    public void testDiv() throws Exception {
        Calculator calculator = new Calculator();
        calculator.div(6, 2);
        assertEquals(3, (int) calculator.getResult());
    }


}