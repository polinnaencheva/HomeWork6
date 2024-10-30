package org.example;

public class MathOperations {
    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // Две числа, върху които ще приложим calculateAverage
        double firstNumber = 10;
        double secondNumber = 20;

        // Средната стойност на тези две числа
        double average = calculateAverage(firstNumber, secondNumber);


        double thirdNumber = 15;
        double fourthNumber = 25;

        double average2 = calculateAverage(thirdNumber, fourthNumber);

        // Изчисляваме сумата на двете средни стойности
        double result = calculateSum(average, average2);

        System.out.println("Сумата на средните стойности е: " + result);
    }
}


