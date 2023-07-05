package com.in28minutes.Learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.Learnspringframework.game.GameRunner;

@Configuration
@ComponentScan // ("com.in28minutes.Learnspringframework.examples.a1")
public class XmlConfigContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("contextconfig.xml")) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));

			context.getBean(GameRunner.class).run();

		}

	}
}
