package game;

import piece.Piece;
import piece.PieceGenerator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Queue;

public class Launcher implements KeyListener {
	private static final int NEXT_PIECE_X = 11;
	private static final int NEXT_PIECE_Y = 1;
	public static Queue<Piece> pieceQueue;

	public static void main(String[] args) {


		//Queue<Piece> pieceQueue = new LinkedList<>();

		pieceQueue = new LinkedList<>();

		pieceQueue.add(PieceGenerator.generatePiece());

		System.out.println(pieceQueue.element());
System.out.println(pieceQueue.size());

		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					if(pieceQueue.size() < 5){
						pieceQueue.add(PieceGenerator.generatePiece());
						System.out.println(pieceQueue.size());
					}

				}
			}
		});
		t.start();



		InfoDisplay id = new InfoDisplay();

		Score scoreController0 = new Score();
		Thread t0 = new Thread(new Game("Tetris Thread 1", scoreController0, null));
		t0.start();



		Score scoreController1 = new Score();
		Thread t1 = new Thread(new Game("Tetris Thread 2", scoreController1, id));
		t1.start();


		/*Game game = new Game("Tetris");
        game.run();*/
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_R) {

			System.out.println(pieceQueue.poll());
			System.out.println(pieceQueue.size());

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
