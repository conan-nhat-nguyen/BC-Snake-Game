package org.example;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
//menu game
public class SnakeGame extends JFrame{

    MainGame Sgame;
    public MainMenu menu;

    public SnakeGame() {
        setSize(615,440);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Sgame = new MainGame();
        add(Sgame);
        this.addKeyListener(new handler());
        this.addMouseListener(menu);
        this.addMouseMotionListener(menu);
        setVisible(true);

    }
    public static void main(String[] args) {
        SnakeGame s = new SnakeGame();
    }
    private class handler implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void keyPressed(KeyEvent e) {
            // TODO Auto-generated method stub
            if(e.getKeyCode()==KeyEvent.VK_UP) {
                Sgame.snake.setVector(theSnake.UP);
            }
            if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                Sgame.snake.setVector(theSnake.DOWN);
            }
            if(e.getKeyCode()==KeyEvent.VK_LEFT) {
                Sgame.snake.setVector(theSnake.LEFT);
            }
            if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
                Sgame.snake.setVector(theSnake.RIGHT);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            // TODO Auto-generated method stub

        }
    }

}

