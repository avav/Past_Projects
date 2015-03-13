package Log_Game;
/**
 * Ankit Verma
 * Log Game
 */

 
public class LogGame {
	/**
	private static String[][] board;
	
	public LogGame() {
		board = new String[2][6];
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				board[row][col] = " ";
			    board[2][col] = Integer.toString(col);
			}
		}
	}
	
	public static void displayLog() {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
	}
	*/
	public static void main(String[] args) {
		LG LGame = new LG();
		System.out.println("Welcome to log Game!\n");
		System.out.println("The object of the game is to reverse the positions of the boys " + 
				"and girls\non the log.  Each person is allowed to move into an empty position " +
				"as long\nas it is either adjacent to them, or they are jumping over a single person.\n");
		
		LGame.start();
		
		/**
		System.out.println("Welcome to log Game!\n");
		System.out.println("The object of the game is to reverse the positions of the boys " + 
				"and girls\non the log.  Each person is allowed to move into an empty position " +
				"as long\nas it is either adjacent to them, or they are jumping over a single person.\n");
		System.out.println("Move by entering the number that appears below the piece you would like to move.");
		
		displayLog();
		*/
	}
}
