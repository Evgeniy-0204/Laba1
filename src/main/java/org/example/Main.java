package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор (арабские и римские числа I-X)");
        System.out.println("Введите выражение (например: 2 + 3 или IV * II):");

        String input = scanner.nextLine().trim();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Неверный формат ввода! Используйте: число оператор число");
            return;
        }

        String number1Str = parts[0];
        String operator = parts[1];
        String number2Str = parts[2];

        try {
            if (NumberIdentifier.isArabicNumber(number1Str) && NumberIdentifier.isArabicNumber(number2Str)) {
                int num1 = Integer.parseInt(number1Str);
                int num2 = Integer.parseInt(number2Str);
                ArabicCalcs calculator = new ArabicCalcs(num1, num2);
                int result = performOperation(calculator, operator);
                System.out.println("Результат: " + result);

            } else if (NumberIdentifier.isRomanNumber(number1Str) && NumberIdentifier.isRomanNumber(number2Str)) {
                int num1 = RomanCalcs.romanToArabic(number1Str);
                int num2 = RomanCalcs.romanToArabic(number2Str);
                RomanCalcs calculator = new RomanCalcs(num1, num2);
                int result = performOperation(calculator, operator);
                String romanResult = RomanCalcs.arabicToRoman(result);
                System.out.println("Результат: " + romanResult);

            } else {
                System.out.println("Ошибка: используйте только арабские или только римские числа (I-X)");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static int performOperation(Calculations calculator, String operator) {
        switch (operator) {
            case "+":
                return calculator.addition();
            case "-":
                return calculator.subtraction();
            case "*":
                return calculator.multiplication();
            case "/":
                return calculator.division();
            default:
                throw new IllegalArgumentException("Неверный оператор: " + operator);
        }
    }
}