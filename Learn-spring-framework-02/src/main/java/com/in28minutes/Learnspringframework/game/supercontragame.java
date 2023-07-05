package com.in28minutes.Learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class supercontragame implements GamingConsole {

	public void up() {
		System.out.println("up");
	}

	public void down() {
		System.out.println("sit down");
	}

	public void left() {
		System.out.println("go back");
	}

	public void right() {
		System.out.println("Shoot a bullet");
	}

}
