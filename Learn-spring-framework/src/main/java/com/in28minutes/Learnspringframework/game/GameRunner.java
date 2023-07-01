package com.in28minutes.Learnspringframework.game;

public class GameRunner {

	private GamingConsole game;// instance for mario game

	public GameRunner(GamingConsole game) {
		this.game = game;// creating constructor
	}

	public void run() {
		System.out.println("Running Game" + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
