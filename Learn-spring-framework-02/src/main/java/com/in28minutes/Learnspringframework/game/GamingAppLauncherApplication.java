package com.in28minutes.Learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Qualifier("SuperContraGameQualifier")
@Configuration
@ComponentScan("com.in28minutes.Learnspringframework.game")
public class GamingAppLauncherApplication {

	/*
	 * @Bean public GameRunner gameRunner(GamingConsole game) {
	 * System.out.println("parameter:" + game); var gameRunner = new
	 * GameRunner(game); return gameRunner; }
	 */

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {

			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}

	}
}
