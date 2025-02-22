package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        // Дата народження
        int day = 16;
        int month = 7;
        int year = 2007;

        // Число долі
        int fateNumber = Exercise.Calculate(day, month, year);

        // результат
        System.out.println("Дата народження " + day + "." + month + "." + year + 
                         " число долі: " + fateNumber);
    }
}