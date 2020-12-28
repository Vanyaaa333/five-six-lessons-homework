package TicTacToe;

import java.util.Scanner;

public class TicTacToe {

        public static String[][] ticTacToe = new String[3][3];
        public static int isTrueSizeOfArray = 0;
        public static int counterOfMove = 0;
        public static Scanner sc = new Scanner(System.in);
        public static int inputIOfFirstPlayer = 0;
        public static int inputJOfFirstPlayer = 0;
        public static int inputIOfSecondPlayer = 0;
        public static int inputJOfSecondPlayer = 0;
        public static int counterOfFastWinNoughts = 0;
        public static int counterOfFastWinCrosses = 0;


        public static void main(String[] args) {
            takeEmptyArray(ticTacToe);
            for (int numbOfMove = 0; numbOfMove < 5; numbOfMove++) {
                if (counterOfFastWinNoughts < 3 && counterOfFastWinCrosses<3) {
                    inputIOfFirstPlayer = getSizeOfArray("Введите (положительную ,целую,меньшую 3) координату i первого игрока");
                    inputJOfFirstPlayer = getSizeOfArray("Введите (положительную ,целую,меньшую 3) координату j первого игрока");
                    turnsOfPlayer1(ticTacToe);
                    printGameBoard(ticTacToe);
                    fastWinCrosses(ticTacToe);
                    if (counterOfMove < 3 && counterOfFastWinNoughts < 3 && counterOfFastWinCrosses<3 ) {
                        inputIOfSecondPlayer = getSizeOfArray("Введите (положительную ,целую,меньшую 3) координату i второго игрока");
                        inputJOfSecondPlayer = getSizeOfArray("Введите (положительную ,целую,меньшую 3) координату j второго игрока");
                        turnsOfPlayer2(ticTacToe);
                        printGameBoard(ticTacToe);
                        counterOfMove++;
                    } else {
                        System.out.println("Game over");
                    }
                    fastWinOfNoughts(ticTacToe);
                }
            }
            System.out.println("Game over");
        }

        public static String[][] takeEmptyArray(String[][] ticTacToe) {
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < 3; j++) {
                    ticTacToe[i][j] = " ";
                }
            }
            return ticTacToe;
        }

        public static String[][] turnsOfPlayer1(String[][] ticTacToe) {
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == inputIOfFirstPlayer && j == inputJOfFirstPlayer) {
                        ticTacToe[i][j] = "#";
                    }
                }
            }
            return ticTacToe;
        }

        public static String[][] turnsOfPlayer2(String[][] ticTacToe) {
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == inputIOfSecondPlayer && j == inputJOfSecondPlayer) {
                        ticTacToe[i][j] = "O";
                    }
                }
            }
            return ticTacToe;
        }

        public static void printGameBoard(String[][] ticTacToe) {
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe[i].length; j++) {
                    if (j < 2) {
                        System.out.print(ticTacToe[i][j] + "|");
                    } else {
                        System.out.print(ticTacToe[i][j]);
                    }
                }
                System.out.println("");
            }
        }

        public static int fastWinCrosses(String[][] ticTacToe) {
            counterOfFastWinCrosses = 0;
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe[i].length; j++) {
                    if (i == j) {
                        if (ticTacToe[i][j] == "#") {
                            counterOfFastWinCrosses++;
                        }
                    }
                }
            }
            return counterOfFastWinCrosses;
        }

        public static int fastWinOfNoughts(String[][] ticTacToe) {
            counterOfFastWinNoughts = 0;
            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe[i].length; j++) {
                    if (i == j) {
                        if (ticTacToe[i][j] == "O") {
                            counterOfFastWinNoughts++;
                        }
                    }
                }
            }
            System.out.println("");
            return counterOfFastWinNoughts;
        }

        public static int getSizeOfArray() {
            if (sc.hasNextInt()) {
                isTrueSizeOfArray = sc.nextInt();
                if (isTrueSizeOfArray >= 0 && isTrueSizeOfArray<3) {
                    return isTrueSizeOfArray;
                } else {
                    System.out.println("Вы ввели противоречащую условиям игры координату.Повторите ввод.");
                    return getSizeOfArray();
                }
            }
            sc.next();
            System.out.println("Вы ввели противоречащую условиям игры координату.Повторите ввод.");
            return getSizeOfArray();
        }

        public static int getSizeOfArray(String massage) {
            System.out.println(massage);
            return getSizeOfArray();
        }
    }
 /*
 00 01 02
 10 11 12
 20 21 22

  */

