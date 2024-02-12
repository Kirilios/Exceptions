package Seminars.Seminar_1;

public class Task5 {
    public static void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
        int[] arr = {1,2,3};
        int value = arr[11];


    }

    public static void divisionByZero() {
        // Напишите свое решение ниже
        int a = 10;
        int b = 0;
        // Попытка деления на 0
        int result = a / b;

    }

    public static void numberFormatException() {
        // Напишите свое решение ниже
        String string = "abc";
        // Попытка преобразования строки в число
        int a = Integer.parseInt(string);

    }
}

