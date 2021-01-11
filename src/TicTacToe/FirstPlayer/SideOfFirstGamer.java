package TicTacToe.FirstPlayer;

import TicTacToe.SecondPlayer.SideOfSecondPlayer;

import static TicTacToe.DemoWork.*;
import static TicTacToe.DemoWork.ticTacToe;
import static TicTacToe.SecondPlayer.SideOfSecondPlayer.fastWinOfNoughts;

public class SideOfFirstGamer {

    public static int numbOfMove = 0;

    public static int mainPanelOfFirstPlayer(){
        System.out.println("Let's start new game");
        while(numbOfMove < 5 ) {
            inputIOfFirstPlayer = getPlayersMove("Введите (положительную ,целую,меньшую 3) координату i первого игрока");
            inputJOfFirstPlayer = getPlayersMove("Введите (положительную ,целую,меньшую 3) координату j первого игрока");
            turnsOfPlayer1(ticTacToe);
            if (fastWinOfCrosses(ticTacToe)){
                return mainPanelOfFirstPlayer();
            }
            if(numbOfMove == 5){
                System.out.println("Game over");
            }
            SideOfSecondPlayer.mainPanelOfSecondPlayer();
            if (fastWinOfNoughts(ticTacToe)){
                return mainPanelOfFirstPlayer();
            }
        }
        return 0;
    }

    public static int turnsOfPlayer1(char[][] ticTacToe) {
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                if (i == inputIOfFirstPlayer && j == inputJOfFirstPlayer) {
                if (ticTacToe[i][j] == '#' || ticTacToe[i][j] == '0') {
                    System.out.println("Вы ввели уже занятую клетку,повторите ввод");
                    return mainPanelOfFirstPlayer();
                }
                else{
                    ticTacToe[i][j] = '#';
                    printGameBoard(ticTacToe);
                    numbOfMove++;
                }
                }
            }
        }
        return 0;
    }

    public static boolean fastWinOfCrosses(char[][] el) {
        if((el[0][0] == '#' && el[0][0] == el[1][1] && el[1][1] == el[2][2]) ||
                (el[0][2] == '#' && el[0][2] == el[1][1] && el[1][1] == el[2][0]) ||
                (el[0][0] == '#' && el[0][0] == el[0][1] && el[0][1] == el[0][2]) ||
                (el[1][0] == '#' && el[1][0] == el[1][1] && el[1][1] == el[1][2]) ||
                (el[2][0] == '#' && el[2][0] == el[2][1] && el[2][1] == el[2][2]) ||
                (el[0][0] == '#' && el[0][0] == el[1][0] && el[1][0] == el[2][0]) ||
                (el[0][1] == '#' && el[0][1] == el[1][1] && el[1][1] == el[2][1]) ||
                (el[0][2] == '#' && el[0][2] == el[1][2] && el[1][2] == el[2][2])){
            System.out.println("Crosses win");
            return true;
        }
        return false;
    }

}
