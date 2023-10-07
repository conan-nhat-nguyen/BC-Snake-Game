package org.example;
import javax.swing.*;

public class FrameScreen extends JFrame {
    MainGame mainGame;

    public FrameScreen() {
        mainGame = new MainGame();
        add(mainGame);



    }
    public static void main(String as[]) {
        FrameScreen f = new FrameScreen();
        f.setVisible(true);
        f.setSize(500,500);

    }

}

