package org.example;

public class NumberIdentifier {
    private String number;

    public NumberIdentifier(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public static boolean isArabicNumber(String number){
        try{
            int value = Integer.parseInt(number);
            return (value>=1 && value<=10);
        }
        catch (NumberFormatException exception){
            return false;
        }
    }

    public static boolean isRomanNumber(String number){
        String[] romanNumbers = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        for (int i = 0; i<romanNumbers.length ; i++){
            if (number.equals(romanNumbers[i])){
                return true;
            }
        }
        return false;
    }
}
