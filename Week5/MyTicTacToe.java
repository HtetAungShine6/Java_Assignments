package classEx4;

import java.util.Scanner;

public class MyTicTacToe {

	public static void main(String[] args) {
		char[][] tttBoard = {{' ', ' ', ' '},
                			{' ', ' ', ' '},
                			{' ', ' ', ' '}};
		
		boardPlayer(tttBoard);
	}

	public static void printBoard(char[][] tttBoard) {
		System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tttBoard[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
	}
	
	public static boolean validMove(char[][] tttBoard,int position) {
		int row = (position-1)/3;
		int column = (position-1)%3;
		return tttBoard[row][column] == ' ';
	}
	
	public static void makeAMove(char[][] tttBoard, char player) {
		Scanner sc = new Scanner(System.in);
		int position;
		do {
			System.out.print("Player " + player + ", enter number (1-9) to make your move : ");
			position = sc.nextInt();
		}while(position<1 || position>9 || !validMove(tttBoard,position));
		
		int row =  (position-1)/3;
		int column = (position-1)%3;
		tttBoard[row][column] = player;
	}
	
	public static void boardPlayer(char[][] tttBoard) {
		char player = 'X';
		char winner = ' ';
		int totalMove = 0;
		while(totalMove<9 && winner==' ') {
			printBoard(tttBoard);
			makeAMove(tttBoard,player);
			player = (player == 'X') ? 'O' : 'X';
			winner = whoWin(tttBoard);
            totalMove++;
		}
		printBoard(tttBoard);
		if (winner == ' ') {
            System.out.println("The match is a draw!");
        } else {
            System.out.println("Player " + winner + " wins!");
        }
	}
	
	public static char whoWin(char[][] tttBoard) {
		for (int i = 0; i < 3; i++) {
            if (tttBoard[i][0] == tttBoard[i][1] && tttBoard[i][1] == tttBoard[i][2] && tttBoard[i][0] != ' ') {
                return tttBoard[i][0];
            }
            if (tttBoard[0][i] == tttBoard[1][i] && tttBoard[1][i] == tttBoard[2][i] && tttBoard[0][i] != ' ') {
                return tttBoard[0][i];
            }
        }

        if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][2] && tttBoard[0][0] != ' ') {
            return tttBoard[0][0];
        }
        if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][0] && tttBoard[0][2] != ' ') {
            return tttBoard[0][2];
        }

        return ' ';
	}
}
