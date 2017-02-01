/**
 * Main of GuessingGame
 * 
 * @author Visurt Anuttivong 5710546615
 *
 */

public class Main {

	/*
	 * Create objects and start the game
	 */
	public static void main(String[] args) {
		int upperbound = 20;
		GuessingGame game = new GuessingGame(upperbound);
		GameConsole ui = new GameConsole();
//		 GameDialog ui = new GameDialog();
		ui.play(game);
	}
}
