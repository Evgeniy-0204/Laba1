package org.example;

public class ArabicCalcs extends Calculations {

    public ArabicCalcs(int number1, int number2) {
        super(number1, number2);
    }

    @Override
    public int addition() {
        return number1 + number2;
    }

    @Override
    public int subtraction() {
        return number1 - number2;
    }

    @Override
    public int multiplication() {
        return number1 * number2;
    }

    @Override
    public int division() {
        if (number2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return number1 / number2;
    }
}

