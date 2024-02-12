package Seminars.Seminar_1;
//Реализуйте метод checkArray(Integer[] arr),
// принимающий в качестве аргумента целочисленный одномерный массив.
//Метод должен пройтись по каждому элементу и проверить что он не равен null.
// Реализуйте следующую логику:
//1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
//2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        checkArray(new Integer[] {1,2,3, null,4,5,6, null});

    }
    public static void checkArray(Integer[] arr){
        List<Integer> errIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null) errIndexes.add(i);
            }
            if(errIndexes.size() != 0) throw new RuntimeException(String.format("null встретился в индексах: %s", errIndexes));
            System.out.println("в массиве нет null");
        }
    }

