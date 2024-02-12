package Seminars.Seminar_1.Task6;

import java.util.Arrays;

public class Task6 {
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if(a.length != b.length){
            return new int[]{0};
        }
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i] - b[i];
        }
        return c;

    }
}

