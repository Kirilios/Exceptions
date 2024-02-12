package Seminars.data;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.CharacterCodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserData {
    String lastName;
    String firstName;
    String middleName;

    String birthday;

    long phoneNum;
    char gender;

    public UserData(String lastName, String firstName, String middleName, String birthday, long phoneNum, char gender) {
        this.middleName = middleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNum = phoneNum;
        this.gender = gender;
    }

    public static boolean validateGenderData(String gender) throws WrongInputDataException {
            return gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f");
    }
    public static void validateBirthdayData(String birthday) throws WrongInputDataException {
        SimpleDateFormat birthdayFormat = new SimpleDateFormat("dd.MM.yyyy"); //чтобы был именно такой ввод
        birthdayFormat.setLenient(false); //чтобы строгле соответсвие формату, не может быть 32 января
        try {
            Date parsedData = birthdayFormat.parse(birthday);
        } catch (ParseException e) {
            throw new WrongInputDataException("неверный формат данных. Требуется ввести данные формата dd.MM.yyyy");
        }
    }


    public static UserData splitUserData(String input) throws WrongInputDataException {
        String[] userInput = input.split(" ");
        if (userInput.length != 6) {
            throw new WrongInputDataException("Введите корректное количество данных, разделенное пробелом");
        }
        try {
            String lastName = userInput[0];
            String firstName = userInput[1];
            String middleName = userInput[2];

            String birthday = userInput[3];

            long phoneNum = Long.parseLong(userInput[4]);
            char gender = userInput[5].charAt(0);

            return new UserData(lastName, firstName, middleName, birthday, phoneNum, gender);

        } catch (NumberFormatException e) {
            throw new WrongInputDataException("Ошибка ввода телефонных данных, введите целое беззнаковое число без форматирования");
        } catch (IndexOutOfBoundsException e) {
            throw new WrongInputDataException("Неверный формат ввода данных, введите Фамилия Имя Отчество дата рождения номер телефона пол");
        }

    }

    public static void writeToFile(String filename, UserData userData) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(userData.lastName + " " + userData.firstName + " " + userData.middleName + " " + userData.birthday + " " + userData.phoneNum + " " + userData.gender + "\n");
        }


    }
}