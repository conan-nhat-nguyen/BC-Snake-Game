package menu;

import java.awt.*;
import java.awt.event.MouseAdapter;

public class MainMenu extends MouseAdapter {
	
	boolean active;
	
	// Button "Play"
	private Rectangle playButton;
	String textPlay = "Play";
	boolean pHighlighted = false;
	
	// Button "Settings"
	private Rectangle settingsButton;
	String textSettings = "Settings";
	boolean sHighlighted = false;
	
	// Button "Scoreboard"
	private Rectangle scoreboardButton;
	String textScoreboard = "Scoreboard";
	boolean sbHighlighted = false;
	
	// Button "Exit"
	private Rectangle exitButton;
	String textExit = "Exit";
	boolean eHighlighted = false;
	
	public static void main(String args[]) {
		System.out.println("Hello World");
		

		
	}
}
