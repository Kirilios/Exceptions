package Seminars.Seminar_2;

public class Task4_4 {
    public static String expr(char a) throws Exception {
// Введите свое решение ниже
        if(a == ' ') {
            throw new Exception("Empty string has been input.");
        } else{
            return "Your input was - " + a;

    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

public static class Printer {
    public static void main(String[] args) {
        char a;

        if (args.length == 0) {
            a = 'J'; // Значение по умолчанию, если аргументы не были предоставлены
        } else {
            a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
        }

        try {
            String result = Task4_4.expr(a);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
}
