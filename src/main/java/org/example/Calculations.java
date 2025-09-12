package org.example;

public abstract class Calculations {
    protected int number1;
    protected int number2;

    public Calculations(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public abstract int addition();
    public abstract int subtraction();
    public abstract int multiplication();
    public abstract int division();
}
