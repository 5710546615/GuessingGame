import java.util.Scanner;

/**
 * Game console of GuessingGame
 * 
 * @author Visurt Anuttivong
 * @version 5710546615
 */

public class GameConsole {

	/*
	 * The play method plays a game using input from a user.
	 * 
	 * @param game GuessingGame which user want to play
	 */
	public void play(GuessingGame game) {

		Scanner scan = new Scanner(System.in);

		System.out.println(game.getHint());

		int i = 0;
		do {
			System.out.print("Your guess? ");
			i = scan.nextInt();
			game.guess(i);
			System.out.println(game.getHint());
		} while (game.guess(i));

		System.out.println("You used " + game.getCount() / 2 + " guesses.");

	}
}
