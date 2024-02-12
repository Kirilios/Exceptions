package Seminars.Seminar_2;

public class Task1_1 {
    public static float isFloat(String input) {
// Введите свое решение ниже
        try {
            return Float.parseFloat(input);
        } catch (NumberFormatException e){
            System.out.println("Your input is not a float number. Please, try again.");
            return Float.NaN;
        }

    }
}
