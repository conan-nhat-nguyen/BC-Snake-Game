package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;

public class MainMenu extends MouseAdapter implements Runnable {
    private boolean active = false;

    // Different buttons
    // Button Start
    private Rectangle startButton;
    private String startText = "START";
    private boolean startHighlighted = false;

    // Button Settings
    private Rectangle settingsButton;
    private String settingsText = "SETTINGS";
    private boolean settingsHighlighted = false;

    // Button ScoreBoard
    private Rectangle scoreboardButton;
    private String scoreboardText = "SCOREBOARD";
    private boolean scoreboardHighlighted = false;

    // Button Exit
    private Rectangle exitButton;
    private String exitText = "EXIT";
    private boolean exitHighlighted = false;

    private Font font;

    public MainMenu(MainGame game) {
        active = true;
        buttonSetup();
        font = new Font("Roboto", Font.PLAIN, 25);






    }

    private void buttonSetup() {
        int buttonWidth, buttonHeight, buttonX, buttonY;
        int screenWidth = FrameScreen.WIDTH;
        int screenHeight = FrameScreen.HEIGHT;

        buttonWidth = screenWidth * 4 / 10;
        buttonHeight = screenHeight / 10;

        buttonX = screenWidth / 4;
        buttonY = screenWidth / 5;

        startButton = new Rectangle(buttonWidth, buttonHeight, buttonX, buttonY);

        buttonY += 100;
        settingsButton = new Rectangle(buttonWidth, buttonHeight, buttonX, buttonY);

        buttonY += 100;
        scoreboardButton = new Rectangle(buttonWidth, buttonHeight, buttonX, buttonY);

        buttonY += 100;
        exitButton = new Rectangle(buttonWidth, buttonHeight, buttonX, buttonY);
    }

    public void draw(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        graphics.setFont(font);

        // Highlight gray buttons with green if they are hovered over
        // Button START
        graphics.setColor(Color.GRAY);
        if (startHighlighted) {
            graphics.setColor(Color.GREEN);
        }
        graphics2D.fill(startButton);

        // Button SETTINGS
        graphics.setColor(Color.GRAY);
        if (settingsHighlighted) {
            graphics.setColor(Color.GREEN);
        }
        graphics2D.fill(settingsButton);

        // Button SCOREBOARD
        graphics.setColor(Color.GRAY);
        if (scoreboardHighlighted) {
            graphics.setColor(Color.GREEN);
        }
        graphics2D.fill(scoreboardButton);

        // Button EXIT
        graphics.setColor(Color.GRAY);
        if (exitHighlighted) {
            graphics.setColor(Color.GREEN);
        }
        graphics2D.fill(exitButton);


        // Draw all buttons on the screen
        graphics2D.draw(startButton);
        graphics2D.draw(settingsButton);
        graphics2D.draw(scoreboardButton);
        graphics2D.draw(exitButton);
    }

    @Override
    public void run() {

    }
}
