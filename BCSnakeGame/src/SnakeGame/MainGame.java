 package SnakeGame;
import java.awt.*;
import javax.swing.*;

public class MainGame extends JPanel implements Runnable {
	
	Thread thread;
	int [][] bg = new int [20][30];
	int step = 0;
	theSnake snake;
	public MainGame() {
		snake = new theSnake();
		thread = new Thread(this);
		thread.start();
		bg[5][6] = 1;
		bg[4][7] = 2;
		
	}
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			snake.update();
			repaint();
			try {
				thread.sleep(60);

			} catch (InterruptedException ex) {
				// TODO: handle exception
			}
		}
		
	}
	 
	public void paintBg(Graphics g) {
		g.setColor(Color.GRAY);
		for(int i = 0; i < 30; i++) {
			for( int j = 0; j < 20; j++) {
				g.fillRect(i*20+1, j*20+1, 18, 18);
			
				
			}
		}
	}
	
	
	
	public void paint(Graphics g) {
		paintBg(g);
		snake.drawSnake(g);
		
		
		
		
	}

}
