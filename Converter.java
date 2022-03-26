package com.company;

public class Converter {
    public static int toArabic(String number) throws Exception {

        if (number.equals("")) return 0;
        if (number.indexOf("C") == 0) return 100 + toArabic(number.substring(1));
        if (number.indexOf("XC") == 0) return 90 + toArabic(number.substring(2));
        if (number.indexOf("L") == 0) return 50 + toArabic(number.substring(1));
        if (number.indexOf("XL") == 0) return 40 + toArabic(number.substring(2));
        if (number.indexOf("X") == 0) return 10 + toArabic(number.substring(1));
        if (number.indexOf("IX") == 0) return 9 + toArabic(number.substring(2));
        if (number.indexOf("VI") == 0) return 6 + toArabic(number.substring(2));
        if (number.indexOf("V") == 0) return 5 + toArabic(number.substring(1));
        if (number.indexOf("IV") == 0) return 4 + toArabic(number.substring(2));
        if (number.indexOf("I") == 0) return 1 + toArabic(number.substring(1));
        throw new Exception("что-то пошло не так");
    }

    public static String toRoman(int number) {

        if (number == 100) {
            return "C";
        } else if (number >= 90) {
            return "XC" + toRoman(number - 90);
        } else if (number >= 50) {
            return "L" + toRoman(number - 50);
        } else if (number >= 40) {
            return "XL" + toRoman(number - 40);
        } else if (number >= 10) {
            return "X" + toRoman(number - 10);
        } else if (number >= 9) {
            return "IX" + toRoman(9);
        } else if (number >= 5) {
            return "V" + toRoman(number - 5);
        } else if (number >= 4) {
            return "IV" + toRoman(4);
        } else if (number >= 1) {
            return "I" + toRoman(number - 1);
        } return "";
    }

}
