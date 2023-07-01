package Spring.practice;

import spring.practice.GameRunner;
import spring.practice.PacmanGame;

public class App01GamingBasicJava {

	// private static final MarioGame MarioGame = null;

	public static void main(String[] args) {

		// var game = new MarioGame();
		// var game = new supercontragame();
		var game = new PacmanGame(); //1: Object creation
		var gamerunner = new GameRunner(game);
		//2: object creation + wiring of dependencies
		// Game is a dependency of gamerunner
		gamerunner.run();

	}

}
