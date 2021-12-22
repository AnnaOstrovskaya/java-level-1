import java.util.Scanner;
import java.util.Random;

/**
 * Java 1. Homework 4
 * <p>
 * student: Anna Ostrovskaya
 * version 1: 17.12.2021 - 19.12.2021
 */

class TicTacToe {

    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW...");
                break;
            }
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW...");
                break;
            }
        }
        printTable();
    }

    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + "");
            }
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]: ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValidAndEmpty(x, y));
        table[y][x] = SIGN_X;
    }

    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValidAndEmpty(x, y));
        table[y][x] = SIGN_O;
    }

    boolean isCellValidAndEmpty(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }

    boolean isWin_1(char ch) {
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;


        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;


        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;

        return false;
    }

    boolean isWin_2(char ch) {
        for (int y = 0; y <= 2; y++) {
            char previousSign = ' ';
            for (int x = 0; x <= 2; x++) {
                if (x == 0) {
                    previousSign = table[y][x];
                } else {
                    if (table[y][x] != previousSign) {
                        break;
                    } else {
                        if (x == 2) {
                            if (table[y][x] == ch) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        for (int x = 0; x <= 2; x++) {
            char previousSign = ' ';
            for (int y = 0; y <= 2; y++) {
                if (y == 0) {
                    previousSign = table[x][y];
                } else {
                    if (table[x][y] != previousSign) {
                        break;
                    } else {
                        if (y == 2) {
                            if (table[x][y] == ch) {
                                return true;
                            }
                        }
                    }
                }
            }
        }

        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;


        return false;
    }

    boolean isWin(char ch) {
        int[][] winningCombinations = {
                {0,0,0,1,0,2},
                {1,0,1,1,1,2},
                {1,0,1,1,1,2},

                {0,0,1,0,2,0},
                {0,1,1,1,2,1},
                {0,2,1,2,2,2},

                {0,0,1,1,2,2},
                {2,0,1,1,0,2},
        };

        for (int i = 0; i < winningCombinations.length; i++) {
            if (table[winningCombinations[i][0]][winningCombinations[i][1]] == ch
                    && table[winningCombinations[i][2]][winningCombinations[i][3]] == ch
                    && table[winningCombinations[i][4]][winningCombinations[i][5]] == ch)
                return true;
        }

        return false;
    }

    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}

