package com.in28minutes.Learnspringframework.game;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("Go into a hole");
	}

	public void left() {
		System.out.println("Go to left");
	}

	public void right() {
		System.out.println("Accelerate");
	}

}
