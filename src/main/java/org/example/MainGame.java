package org.example;
import java.awt.*;
import javax.swing.*;

public class MainGame extends JPanel implements Runnable {

    private static final int screenWidth = 30;
    private static final int screenLength = 20;
    static int [][] bg = new int [screenWidth][screenLength];
    theSnake snake;
    Thread thread;
     MainMenu menu;

    public MainGame() {
        menu = new MainMenu(this);
        snake = new theSnake();

        // The first food appears at (10,10)
        bg[10][10]=2;
        thread = new Thread(this);
        thread.start();

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

                
                }

            }

    }



    public void paint(Graphics g) {
        paintBg(g);
        snake.drawSnake(g);
    }

}