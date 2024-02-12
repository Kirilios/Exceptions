package Seminars.Seminar_1.Task6;

import Seminars.Seminar_1.Task6.Task6;
import Seminars.Seminar_1.Task6.Task7;
import java.util.Arrays;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer2 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{4, 6, 9};
            b = new int[]{1, 2, 3};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        Task6 ans = new Task6();
        String itresume_res = Arrays.toString(ans.subArrays(a, b));
        System.out.println(itresume_res);
        Task7 ans1 = new Task7();
        String itresum_res = Arrays.toString(ans1.divArrays(a, b));
        System.out.println(itresum_res);
    }
}
