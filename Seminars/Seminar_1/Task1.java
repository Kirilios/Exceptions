package Seminars.Seminar_1;
// Реализуйте метод, принимающий
// в качестве аргументов целочисленный массив и некоторый допустимый минимум.
//Если длина массива меньше некоторого заданного минимума,
// метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
public class Task1 {
    public static void main(String[] args) {
        System.out.println(checkArrayLength(new int[] {1,2,4,5,6,6}, 4));
    }
    public static int checkArrayLength(int[] arr, int lenMin){
        if(arr.length < lenMin){
            return -1;
        }

        return arr.length;
    }
}
