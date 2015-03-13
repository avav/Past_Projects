package TicTacToe;

 //import java.util.Scanner;
 
public class TicTacToe {
	/**
	private static String[][] tttboard;
	private static String player1, player2;
	
	public TicTacToe() {
		player1 = "X";
		player2 = "O";
		tttboard = new String[3][3];
		for (int row = 0; row < tttboard.length; row++) {
			for (int col = 0; col < tttboard[0].length; col++) {
				tttboard[row][col] = " ";
			}
		}
	}
	
	public static void displayBoard() {
		for (int row = 0; row < tttboard.length; row++) {
			for (int col = 0; col < tttboard[0].length; col++) {
				System.out.print("[" + tttboard[1][2] + "]");
			}
			System.out.println();
		}
	}
	
	private static void makeMove(String player) {
		Scanner input = new Scanner(System.in);
		boolean validMove = false;
		int row, col;
		
		do {
			System.out.print("Enter row: ");
			row = input.nextInt();
			System.out.print("Enter col: ");
			col = input.nextInt();
			//check for valid move in if condition
			tttboard[row][col] = player;
			validMove = true;
		} while (!validMove);
	}
	
	public static String winner() {
		return (" ");
	}
	*/
	public static void main(String[] args) {
		TTT TTTGame = new TTT();
		TTTGame.play();
		/**
		String curplayer = player1;
		int moves = 0;
		
		do {
			displayBoard();
			makeMove(curplayer);
			moves +=1;
			if (curplayer == player1) {
				curplayer = player2;
			} else {
				curplayer = player1;
			}
		} while (moves <=9 && winner() == " ");
		displayBoard();
		System.out.println("Winner is " + winner());
		*/
	}

}
