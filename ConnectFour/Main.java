import java.util.Scanner;

public class Main {
	private static final int ROWS = 6;
	private static final int COLS = 7;
	private static final char EMPTY = '-';
	private static final char PLAYER1 = 'X';
	private static final char PLAYER2 = 'O';
	
	private char[][] board;
	private int currentPlayer;
	
	public Main() {
		board = new char[ROWS][COLS];
		currentPlayer = 1;
		initializeBoard();
	}
	
	private void initializeBoard() {
		
	}
	
	private void printBoard() {
		
	}
	
	private boolean dropToken(int col) {
		
		return false; //Column is full
	}
	
	private boolean checkWin() {
		return false;
	}
	
	private boolean checkRows() {
		
		return false;
	}
	
	private boolean checkColumns() {
		
		return false;
	}
	
	private boolean checkDiagonals(char[][] board) {
		
		for (int i = 0; i < ROWS-3; i++) {
			for (int j = 0; j < COLS-3; j++) {
				if(board[ROWS][COLS]!=EMPTY) {
					if(board[ROWS][COLS] == board[ROWS+1][COLS+1] && board[ROWS][COLS] == board[ROWS+2][COLS+2] && board[ROWS][COLS] == board[ROWS+3][COLS+3]) {
						return true;
					}
				}
			}
		}
		
		for (int i = 0; i < ROWS-3; i++) {
			for (int j = 3; j < COLS; j++) {
				if(board[ROWS][COLS]!=EMPTY) {
					if (board[ROWS][COLS] == board[ROWS+1][COLS-1] && board[ROWS][COLS] == board[ROWS+2][COLS-2] && board[ROWS][COLS] == board[ROWS+3][COLS-3]) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	private boolean isBoardFull() {
		
		return true;
	}
	
	public void play() {
		Scanner scanner = new Scanner(System.in);
				
		while (true) {
			printBoard();
			
			int col;
			do {
				System.out.println("Player " + currentPlayer + ", enter a column (1-7): ");
				col = scanner.nextInt() - 1;
			} while (col < 0 || col >= COLS || !dropToken(col));
			
			if (checkWin()) {
				printBoard();
				System.out.println("Player " + currentPlayer + " wins!");
				break;
			}
			// What does this line do?
			currentPlayer = (currentPlayer == 1) ? 2 : 1;
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		Main game = new Main();
		game.play();
	}
}
