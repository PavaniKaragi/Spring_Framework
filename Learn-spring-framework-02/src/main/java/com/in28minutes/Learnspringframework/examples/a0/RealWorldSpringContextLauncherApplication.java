package com.in28minutes.Learnspringframework.examples.a0;

import java.util.Arrays;

import //org.springframework.beans.factory.annotation.Qualifier;
org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan // ("com.in28minutes.Learnspringframework.examples.a1")
public class RealWorldSpringContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}
}
