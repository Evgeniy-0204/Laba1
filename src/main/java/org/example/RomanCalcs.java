package org.example;
import java.util.Map;
import java.util.HashMap;

public class RomanCalcs extends ArabicCalcs{
    private static final Map<Integer, String> romanNumbers = new HashMap<>();

    static {
        romanNumbers.put(100, "C");
        romanNumbers.put(90, "XC");
        romanNumbers.put(81, "LXXXI");
        romanNumbers.put(80, "LXXX");
        romanNumbers.put(72, "LXXII");
        romanNumbers.put(70, "LXX");
        romanNumbers.put(64, "LXIV");
        romanNumbers.put(63, "LXIII");
        romanNumbers.put(60, "LX");
        romanNumbers.put(56, "LVI");
        romanNumbers.put(54, "LIV");
        romanNumbers.put(50, "L");
        romanNumbers.put(49, "XLIX");
        romanNumbers.put(48, "XLVIII");
        romanNumbers.put(45, "XLV");
        romanNumbers.put(42, "XLII");
        romanNumbers.put(40, "XL");
        romanNumbers.put(36, "XXXVI");
        romanNumbers.put(35, "XXXV");
        romanNumbers.put(32, "XXXII");
        romanNumbers.put(30, "XXX");
        romanNumbers.put(28, "XXVIII");
        romanNumbers.put(27, "XXVII");
        romanNumbers.put(25, "XXV");
        romanNumbers.put(24, "XXIV");
        romanNumbers.put(21, "XXI");
        romanNumbers.put(20, "XX");
        romanNumbers.put(19, "XIX");
        romanNumbers.put(18, "XVIII");
        romanNumbers.put(17, "XVII");
        romanNumbers.put(16, "XVI");
        romanNumbers.put(15, "XV");
        romanNumbers.put(14, "XIV");
        romanNumbers.put(13, "III");
        romanNumbers.put(12, "XII");
        romanNumbers.put(11, "XI");
        romanNumbers.put(10, "X");
        romanNumbers.put(9, "IX");
        romanNumbers.put(8, "VIII");
        romanNumbers.put(7, "VII");
        romanNumbers.put(6, "VI");
        romanNumbers.put(5, "V");
        romanNumbers.put(4, "IV");
        romanNumbers.put(3, "III");
        romanNumbers.put(2, "II");
        romanNumbers.put(1, "I");
    }

    public RomanCalcs(int number1, int number2){
        super(number1, number2);
    }

    public static int romanToArabic(String roman){
        switch (roman){
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                throw new IllegalArgumentException("Неверное римское число" + roman);
        }
    }

    public static String arabicToRoman(int number){
        if (number <= 0){
            throw new IllegalArgumentException("Римские числа не могут быть меньше или равны 0");
        }

        return romanNumbers.get(number);
    }
}
