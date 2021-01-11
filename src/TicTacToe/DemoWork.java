package TicTacToe;

import TicTacToe.FirstPlayer.SideOfFirstGamer;
import TicTacToe.SecondPlayer.SideOfSecondPlayer;

import java.util.Scanner;

public class DemoWork {

    public static char[][] ticTacToe = new char[3][3];
    public static int isTrueSizeOfArray = 0;
    public static Scanner sc = new Scanner(System.in);
    public static int inputIOfFirstPlayer = 0;
    public static int inputJOfFirstPlayer = 0;
    public static int inputIOfSecondPlayer = 0;
    public static int inputJOfSecondPlayer = 0;

    public static void main(String[] args) {
        SideOfFirstGamer.mainPanelOfFirstPlayer();
        SideOfSecondPlayer.mainPanelOfSecondPlayer();
    }


    public static void printGameBoard(char[][] ticTacToe) {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                if (ticTacToe[i][j] != '#' && ticTacToe[i][j] != '0') {
                    ticTacToe[i][j] = ' ';
                }
                if(j<2) {
                    System.out.print(ticTacToe[i][j] + "|");
                }
                else{
                    System.out.print(ticTacToe[i][j]);
                }
            }
            if(i<2) {
                System.out.println("\n" + "- - -");
            }
            else{
                System.out.println("");
            }
        }
    }

    public static int getPlayersMove() {
        if (sc.hasNextInt()) {
            isTrueSizeOfArray = sc.nextInt();
            if (isTrueSizeOfArray >= 0 && isTrueSizeOfArray < 3) {
                return isTrueSizeOfArray;
            } else {
                System.out.println("Вы ввели противоречащую условиям игры координату.Повторите ввод.");
                return getPlayersMove();
            }
        }
        sc.next();
        System.out.println("Вы ввели противоречащую условиям игры координату.Повторите ввод.");
        return getPlayersMove();
    }

    public static int getPlayersMove(String massage) {
        System.out.println(massage);
        return getPlayersMove();
    }

}
