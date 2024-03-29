package Seminars.Seminar_2;

import static java.lang.Float.NaN;

public class Task2_2 {
    public static double expr(int[] intArray, int d) {
        // Введите свое решение ниже
        if(intArray.length < 9) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
            return Double.NaN;
        }
        if(d == 0) {
            System.out.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0.");
            return Double.NaN;
        }
        double result = (double) intArray[8] / d;
        System.out.printf("intArray[8] / d = %d / %d = %.1f%n", intArray[8], d, result);
        return result;
    }
}
