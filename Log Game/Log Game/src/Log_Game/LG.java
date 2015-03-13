package Log_Game;

import java.util.Scanner;
import java.lang.Integer;

public class LG {

	private String[][] board;
	
	public LG() {
		board = new String[2][7];
		for (int col = 0; col < board[0].length; col++) {
			if (col < 3) {
				board[0][col] = "B ";
			} else if (col == 3) {
				board[0][col] = "_ ";
			} else {
				board[0][col] = "G ";
			}	
			board[1][col] = Integer.toString(col) + " ";
		}
	}
	
	private void displayLog() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
	}
	
	private void move() {
		Scanner input = new Scanner(System.in);
		int command;
		boolean valid = false;
		int index = 0;
		int check;
		do{
			System.out.println("Move by entering the number that appears below the piece you would like to move: ");
			command = input.nextInt();
			while (board[0][index] != "_ ") {
				index += 1;
			}
			check = index - command;
			if (command >= 0 && command <= 6 && command != index && check >= -2 && check <= 2 ) {
				
				board[0][index] = board[0][command];
				board[0][command] = "_ ";
				index = 0;
				valid = true;
			} else {
				System.out.println("Invalid move, please try again.");
			}
		} while (!valid);
		
		
	}
	
	private boolean complete() {
		if (board[0][0] == ("G ") && board[0][6] == ("B ") && board[0][5] == ("B ") && board[0][4] == ("B ")
				&& board[0][3] == ("_ ")) {
			return (true);
		} else {
			return (false);
		}
	}
	public void start() {
		int moves = 0;
		
		do{
			displayLog();
			move();
			moves += 1;
		} while (!complete());
		System.out.println("Congrats!\n" + "You made " + moves + " moves.");
	}
}
