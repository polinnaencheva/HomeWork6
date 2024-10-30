package org.example;

public class NumberValidator {

    public static boolean arePositiveAndEqual(int a, int b, int c) {
        return (a > 0 && b > 0 && c > 0) && (a == b && b == c);
    }

    public static void main(String[] args) {

        System.out.println(arePositiveAndEqual(5, 5, 5));
        System.out.println(arePositiveAndEqual(5, 5, -5));
        System.out.println(arePositiveAndEqual(5, 5, 6));
        System.out.println(arePositiveAndEqual(3, 3, 3));
    }
}


