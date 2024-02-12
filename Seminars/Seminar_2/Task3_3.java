package Seminars.Seminar_2;

public class Task3_3 {
    public static double expr(int a, int b) {
        // Введите свое решение ниже
        double result = 0;
        if (b != 0) {
            result = (double)a / b;
            System.out.println(result);
            printSum(a, b);
        } else {
           // System.out.println("Делитель не может быть равен нулю. Результат равен нулю.");
            return 0.0;
        }
        return  result;

    }

    public static void printSum(int a, int b) {
        // Введите свое решение ниже
        int sum = a + b;
        System.out.println(sum);



    }
    public static void performDivision(int a, int b) {
        // Проверка делителя на ноль
        if (b != 0) {
            double result = expr(a, b);
            System.out.println(result);
            printSum(a, b);
        } else {
            System.out.println("Делитель не может быть равен нулю. Результат равен нулю.");
        }
    }


}

