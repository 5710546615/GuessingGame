import javax.swing.JOptionPane;

/**
 * Game dialog of GuessingGame
 * 
 * @author Visurt Anuttivong 5710546615
 *
 */

public class GameDialog {

	/*
	 * Attribute of Game dialog isCancel is to check that user click cancel or
	 * not
	 */
	private boolean isCancel = false;

	/*
	 * The play method plays a game using input from a user.
	 * 
	 * @param game GuessingGame which user want to play
	 */
	public void play(GuessingGame game) {
		int opt = 0;
		int i = 0;
		do {
			if (i == 0)
				JOptionPane.showMessageDialog(null, game.getHint(), "GuessingGame", JOptionPane.INFORMATION_MESSAGE);
			i = 1;

			if (opt == JOptionPane.YES_OPTION) {
				game = new GuessingGame(game.getUpperBound());
				game.setCount(0);
			}

			while (Input(game)) {
				JOptionPane.showMessageDialog(null, game.getHint(), "GuessingGame", JOptionPane.INFORMATION_MESSAGE);
			}

			if (isCancel)
				JOptionPane.showMessageDialog(null, game.getHint(), "GuessingGame", JOptionPane.INFORMATION_MESSAGE);

			JOptionPane.showMessageDialog(null, "You used " + game.getCount() + " guesses.", "GuessingGame End",
					JOptionPane.INFORMATION_MESSAGE);
			opt = JOptionPane.showConfirmDialog(null, "Play again?", "Guessing Game", JOptionPane.YES_NO_OPTION);

		} while (opt == JOptionPane.YES_OPTION);

	}

	/*
	 * Show the dialog of guessing number
	 * 
	 * @param game GuessingGame which user want to play
	 * 
	 * @return true for continue guessing
	 * 
	 * @return false for end guessing
	 */
	public boolean Input(GuessingGame game) {
		String reply = JOptionPane.showInputDialog(null, "Your guess?", "GuessingGame", JOptionPane.QUESTION_MESSAGE);
		if (reply == null) {
			return false;
		} else {
			int tmp = 0;
			try {
				tmp = Integer.parseInt(reply);
			} catch (NumberFormatException e) {
				isCancel = true;
			}
			return game.guess(tmp);
		}
	}

}