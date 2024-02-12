package Seminars.data;

import java.io.IOException;
import java.util.Scanner;

import static Seminars.data.UserData.*;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные через пробел: Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол ");

            String input = scanner.nextLine();

            UserData userData = splitUserData(input);

            String birthday = userData.birthday;
            validateBirthdayData(birthday);

            String gender = String.valueOf(userData.gender);
            if(!validateGenderData(gender)){
                throw new IllegalArgumentException("Некорректное значение пола");
            }

            String filename = userData.lastName + ".txt";
            writeToFile(filename, userData);

            System.out.println("Данные записаны в файл " + filename);

        } catch (WrongInputDataException e) {
            System.out.println("Ошибка ввода данных: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
