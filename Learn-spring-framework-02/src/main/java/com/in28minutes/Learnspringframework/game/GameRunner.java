package com.in28minutes.Learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	private GamingConsole game;// instance for mario game

	public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
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
