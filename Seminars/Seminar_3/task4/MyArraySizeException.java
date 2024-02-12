package Seminars.Seminar_3.task4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Массив неверной длины");
    }
}
