/**
 * Java 1. Homework 2
 *
 * stuent: Anna Ostrovskaya
 * version 1: 11.12.2021
 * version 2: 14.12.2021
 */

class HomeWorkAO2 {

    static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void isPositiveOrNegative(int x) {
        System.out.println(
                (x >= 0) ? "Positive" : "Negative");
    }

    static boolean isNegative(int x) {
        return x >= 0;
    }

    static void printWordNTimes(String textToPrint, int numberOfLines) {
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println(textToPrint);
        }
    }

    public static void main(String[] args) {
        within10and20(3, 13);
        isPositiveOrNegative(5);
        isNegative(3);
        printWordNTimes("Hello world!", 2);
    }

}

