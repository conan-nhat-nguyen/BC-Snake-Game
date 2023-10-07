package org.example;
import java.awt.*;
import javax.swing.*;

public class MainGame extends JPanel implements Runnable {
	
	
    static int [][] bg = new int [30][20];
    theSnake snake;
    Thread thread;

    public MainGame() {
        snake = new theSnake();
        bg[10][10]=2;
        thread = new Thread(this);
        thread.start();
//        bg[5][6] = 1;
//        bg[4][7] = 2; 

    }
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            snake.update();
            repaint();
            try {
                thread.sleep(20);

            } catch (InterruptedException ex) {
                // TODO: handle exception
            }
        }

    }

    public void paintBg(Graphics g) {
        g.setColor(Color.gray);
        for(int i = 0; i < 30; i++) 
            for( int j = 0; j < 20; j++) {
                g.fillRect(i*20+1, j*20+1, 18, 18);
                if(bg[i][j]==2) {
                	                	g.setColor(Color.red);
                    g.fillRect(i*20+1, j*20+1, 18, 18);
                	g.setColor(Color.gray);
//                	
                }

            }
        
    }



    public void paint(Graphics g) {
        paintBg(g);
        snake.drawSnake(g);
    }

}

