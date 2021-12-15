/**
 * Java 1. Homework 1
 *
 * stuent: Anna Ostrovskaya
 * version 1: 09.12.2021
 * version 2: 11.12.2021
 * version 3: 14.12.2021
 */

class HomeWorkAO1 {

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
 
    static void checkSumSign() {
        int a = 5;
        int b = -5;
        System.out.println(
            (a + b >= 0) ? "Positive value" : "Negative Value");
    }
 
    static void printColor() {
        int value = 15;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 0;
        int b = 100;
		    System.out.println (
			     (a >= b) ? "a >= b" : "a < b");
	}

    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
}
