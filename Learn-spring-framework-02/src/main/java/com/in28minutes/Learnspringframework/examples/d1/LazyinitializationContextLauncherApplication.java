package com.in28minutes.Learnspringframework.examples.d1;

import java.util.Arrays;

import //org.springframework.beans.factory.annotation.Qualifier;
org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
	private ClassA classA;

	public ClassB(ClassA classA) {
		// Logic
		System.out.println("some initialization logic");
		this.classA = classA;

	}
}

@Configuration
@ComponentScan // ("com.in28minutes.Learnspringframework.examples.a1")
public class LazyinitializationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(LazyinitializationContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}

	}
}
