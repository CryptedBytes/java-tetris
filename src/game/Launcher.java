package game;

public class Launcher {
	public static void main(String[] args) {

		Score scoreController0 = new Score();
		Thread t0 = new Thread(new Game("Tetris Thread 1", scoreController0));
		t0.start();


		Score scoreController1 = new Score();
		Thread t1 = new Thread(new Game("Tetris Thread 2", scoreController1));
		t1.start();


		/*Game game = new Game("Tetris");
        game.run();*/
	}
}
