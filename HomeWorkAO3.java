import java.util.Arrays;

/**
 * Java 1. Homework 3
 * <p>
 * student: Anna Ostrovskaya
 * version 1: 15.12.2021
 */

class HomeworkAO3 {

    static void invertArray() {
        int[] a = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void changeArray() {
        int[] x = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 6) {
                x[i] = x[i] * 2;
            }
        }
        System.out.println(Arrays.toString(x));
    }

    static void fillDiagonal() {
        int[][] array = new int[4][4];
        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 0;
        array[0][3] = 1;
        array[1][0] = 0;
        array[1][1] = 1;
        array[1][2] = 1;
        array[1][3] = 0;
        array[2][0] = 0;
        array[2][1] = 1;
        array[2][2] = 1;
        array[2][3] = 0;
        array[3][0] = 1;
        array[3][1] = 0;
        array[3][2] = 0;
        array[3][3] = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[] returnInitialValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String args[]) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();

        int[] returnInitialValueResult = returnInitialValue(5, 10);
    }

}