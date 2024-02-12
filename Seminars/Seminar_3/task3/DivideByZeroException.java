package Seminars.Seminar_3.task3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Задание 3.1
 * Создайте класс исключения, который будет выбрасываться при делении на 0.
 * Исключение должно отображать понятное для пользователя сообщение об ошибке.
 */

public class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException(String s) {
        super(s);
    }
}

class Main {
    public static void fileNotFoundException(String path) throws Exception {
        FileReader fw = new FileReader(path);
    }

    public static void main(String[] args) {
//        try {
//            int x = 4 / 0;
//        } catch (ArithmeticException e) {
//            throw new DivideByZeroException("деление на ноль");
//        }

        try {
            fileNotFoundException("asfa");
        } catch (Exception e) {
            try {
                throw new NonExistedFileException("file not found here");
            } catch (NonExistedFileException ex) {
                System.out.println(ex.getMessage());
                throw new RuntimeException(ex);
            }
        }
    }
}
