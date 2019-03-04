package org.my.calculator;

public class CalculatorImpl implements Calculator {
    public int add(int i, int i1) {
        return i+i1;
    }

    public int subtract(int i, int i1) {
        return i-i1;
    }

    public int multiply(int i, int i1) {
        return i*i1;
    }

    public float devide(int i, int i1) {
        return ((float) i)/i1;
    }
}
