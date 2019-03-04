package org.my.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {
    private Calculator calculator = new CalculatorImpl();

    @Test
    public void simpleTest(){
        Assert.assertTrue(1<2);
    }

    @Test
    public void add() {
        int res = calculator.add(1, 2);
        Assert.assertTrue(res==3);
        /*if (res!=3){
            throw new Error();
        }*/
    }

    @Test
    public void subtract() {
        int res = calculator.subtract(1,2);
        Assert.assertSame(res, -1);

    }

    @Test
    public void multiply() {
        int res = calculator.multiply(3, 2);
        Assert.assertSame(res, 6);
    }

    @Test
    public void devide () {
        float res = calculator.devide(10, 4);
        Assert.assertTrue(res==2.5);
        }
    }