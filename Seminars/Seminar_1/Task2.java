package Seminars.Seminar_1;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в
// качестве кода ошибки.
//2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//3. если вместо массива пришел null, метод вернет -3

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findElemIndexInArray(new int[] {1,23,68,8,9}, 8, 4));
    }
    public static int findElemIndexInArray(int[] arr, int element, int arrLength) {
        if (arr == null){
            System.out.println("argument cannot be null");
        return -3;
    }
        if(arr.length < arrLength) return -1;
        for (int i = 0; i < arrLength; i++) {
            if(arr[i] == element) return i;

        }
        return -2;
    }

}
