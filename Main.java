package com.company;

public class Main {

    public static void main(String[] args) {

        String s = ReadWrite.read();

        String[] m = s.split("\\s");

        if (m.length != 3) {
            System.out.println("Неверный формат ввода");
            return;
        }

        int c = 0;

        int a;

        try {
            a = Integer.parseInt(m[0]);
        } catch (Exception e) {
            try {
                a = Converter.toArabic(m[0]);
                c = c + 1;
            } catch (Exception r) {
                System.out.println("Ошибка ввода первого числа");
                return;
            }
        }

        if (a>10 || a<0) {
            System.out.println("Нельзя использовать числа больше 10 и меньше 0");
            return;
        }


        int b;

        try {
            b = Integer.parseInt(m[2]);
        } catch (Exception ex) {
            try {
                b = Converter.toArabic(m [2]);
                c = c + 1;
            } catch (Exception l) {
                System.out.println("Неверный ввод второго числа");
                return;
            }
        }


        if (b>10 || b<0) {
            System.out.println("Нельзя использовать числа больше 10 и меньше 0");
            return;
        }
        String y = m[1];

        if (!(y.equals("+") || y.equals("-") || y.equals("/") || y.equals("*"))) {
            System.out.println("Такого арифметического знака нет");
            return;
        }

        if (c == 1) {
            System.out.println("Нельзя выполнить операцию с числами разных систем");
            return;
        }

        int outy;

        switch (y) {
            case "+": outy = a + b;
            break;
            case "-": outy = a - b;
            break;
            case "*": outy = a * b;
            break;
            case "/": outy = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + y);
        }

        if (c == 2 && outy <= 0) {
            System.out.println("Результат меньше или равен нулю");
            return;
        }

        if (c == 2) {
            System.out.println(Converter.toRoman(outy));
        } else {
            System.out.println(outy);
        }



    }
}
