package TicTacToe.SecondPlayer;
import static TicTacToe.DemoWork.*;
import static TicTacToe.DemoWork.ticTacToe;

public class SideOfSecondPlayer {

    public static int mainPanelOfSecondPlayer(){
            inputIOfSecondPlayer = getPlayersMove("Введите (положительную ,целую,меньшую 3) координату i второго игрока");
            inputJOfSecondPlayer = getPlayersMove("Введите (положительную ,целую,меньшую 3) координату j второго игрока");
            turnsOfPlayer2(ticTacToe);
        return 0;
    }

    public static int turnsOfPlayer2(char[][] ticTacToe) {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                if (i == inputIOfSecondPlayer && j == inputJOfSecondPlayer) {
                if (ticTacToe[i][j] == '#' || ticTacToe[i][j] == '0') {
                    System.out.println("Вы ввели уже занятую клетку,повторите ввод");
                    return mainPanelOfSecondPlayer();
                }
                else{
                    ticTacToe[i][j] = '0';
                    printGameBoard(ticTacToe);

                }
                }
            }
        }
        return 0;
    }

    public static boolean fastWinOfNoughts(char[][] el) {
        if ((el[0][0] == '0' && el[0][0] == el[1][1] && el[1][1] == el[2][2]) ||
                (el[0][2] == '0' && el[0][2] == el[1][1] && el[1][1] == el[2][0]) ||
                (el[0][0] == '0' && el[0][0] == el[0][1] && el[0][1] == el[0][2]) ||
                (el[1][0] == '0' && el[1][0] == el[1][1] && el[1][1] == el[1][2]) ||
                (el[2][0] == '0' && el[2][0] == el[2][1] && el[2][1] == el[2][2]) ||
                (el[0][0] == '0' && el[0][0] == el[1][0] && el[1][0] == el[2][0]) ||
                (el[0][1] == '0' && el[0][1] == el[1][1] && el[1][1] == el[2][1]) ||
                (el[0][2] == '0' && el[0][2] == el[1][2] && el[1][2] == el[2][2])){
            System.out.println("Noughts win");
            return true;
        }
        return false;
    }

}
