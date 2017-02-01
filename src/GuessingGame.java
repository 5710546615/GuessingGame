import java.util.Random;

/**
 * Game of guessing a secret number.
 * 
 * @author Visurt Anuttivong 5710546615
 *
 */

public class GuessingGame {

	/**
	 * Attribute of GuessingGame
	 * 
	 * upperBound is the maximum random number secret is the number which
	 * GuessingGame guess to user hint is the hint of the secret number counter
	 * is the counter of guesses
	 * 
	 */
	private int upperBound;
	private int secret;
	private String hint;
	private int counter = 0;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1). Randomly secret
	 *            number between 1 to upperBound. Hint set to "I'm thinking of a
	 *            number between 1 and upperBound"
	 * 
	 */
	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(upperBound);
		setHint("I'm thinking of a number between 1 and " + upperBound);
	}

	/**
	 * Guess the number to the game
	 * 
	 * @param number
	 *            is the number which user guess to match secret number if
	 *            secret > number set hint to "Sorry, your guess is too small"
	 *            if secret < number set hint to "Sorry, your guess is too
	 *            large" if secret = number set hint to "Correct. The secret is
	 *            ..."
	 * 
	 * @return true for continue guessing
	 * @return false for end guessing
	 */
	public boolean guess(int number) {
		counter = counter + 1;
		if (secret > number) {
			setHint("Sorry, your guess is too small");
			return true;
		} else if (secret < number) {
			setHint("Sorry, your guess is too large");
			return true;
		} else {
			setHint("Correct. The secret is " + this.secret);
			return false;
		}
	}

	/**
	 * Get Hint of GuessingGame
	 * 
	 * @return hint hint of GuessingGame
	 */
	public String getHint() {
		return this.hint;
	}

	/**
	 * Set Hint of GuessingGame
	 * 
	 * @param hint
	 *            hint to set
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * 
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random rand = new Random(seed);
		return rand.nextInt(limit) + 1;
	}

	/**
	 * Count the number of guesses.
	 * 
	 * @return the number of guesses.
	 */
	public int getCount() {
		return counter;
	}

	/**
	 * Set the number of counter.
	 * 
	 * @param count
	 *            is the number to set over.
	 */
	public void setCount(int count) {
		this.counter = count;
	}

	/**
	 * Return the maximum range of guessing number.
	 * 
	 * @return the maximum range of guessing number.
	 */
	public int getUpperBound() {
		return upperBound;
	}
}
