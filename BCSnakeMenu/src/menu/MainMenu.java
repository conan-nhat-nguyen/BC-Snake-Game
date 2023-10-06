package menu;

import java.awt.*;
import java.awt.event.MouseAdapter;

public class MainMenu extends MouseAdapter {
	public boolean active;

	// Button START
	private Rectangle startButton;
	private String startText = "START";
	private boolean startHightlighted = false;

	// Button SETTINGS
	private Rectangle settingsButton;
	private String settingsText = "SETTINGS";
	private boolean settingsHightlighted = false;

	// Button SCOREBOARD
	private Rectangle scoreboardButton;
	private String scoreboardText = "SCOREBOARD";
	private boolean scoreboardHightlighted = false;

	// Button EXIT
	private Rectangle 	exitButton;
	private String exitText = "EXIT";
	private boolean eixtHightlighted = false;

	public MainMenu() {}

}
