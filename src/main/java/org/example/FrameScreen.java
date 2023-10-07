package org.example;
import javax.swing.*;

public class FrameScreen extends JFrame {
    MainGame mainGame;
    MainMenu mainMenu;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    public FrameScreen() {
        mainGame = new MainGame();
        mainMenu = new MainMenu(mainGame);

        // TODO: add the mainMenu object to FrameScreen
        add(mainGame);




    }
    public static void main(String as[]) {
        FrameScreen f = new FrameScreen();
        f.setVisible(true);
        f.setSize(WIDTH,HEIGHT);

    }

}

