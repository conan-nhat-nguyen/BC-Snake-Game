package menu;

import java.awt.Canvas;
import java.awt.Dimension;

public class Game extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 5126697128149329635L;
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = WIDTH * 9 / 16;
	
	public boolean running = false;
	private Thread gameThread;
	
	// TODO: OBJECTS
	
	public Game() {
		canvasSetup();
		new Window("BC Snake", this);
	}

	private void canvasSetup() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		this.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		
	}

	@Override
	public void run() {
		
	}

	public void start() {
		gameThread = new Thread(this);
		gameThread.start();
		running = true;
	}
	
	public void stop() {
		try {
			gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Game();
	}

}
