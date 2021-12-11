class HomeWorkAO2 {

    static boolean within10and20(int a, int b) {
        return a + b >= 10 && a + b <= 20 ? true : false;
    }

    static void isPositiveOrNegative(int x) {
        System.out.println(
                (x >= 0) ? "Positive" : "Negative");
    }

    static boolean isNegative(int x) {
        return x >= 0 ? false : true;
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

