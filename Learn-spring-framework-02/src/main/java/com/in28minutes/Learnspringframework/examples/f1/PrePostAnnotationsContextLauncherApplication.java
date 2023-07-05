package com.in28minutes.Learnspringframework.examples.f1;

import java.util.Arrays;

import //org.springframework.beans.factory.annotation.Qualifier;
org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Configuration
@ComponentScan // ("com.in28minutes.Learnspringframework.examples.a1")
public class PrePostAnnotationsContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
	}
}

@Component
class Someclass {
	private Somedependency somedependency;

	public Someclass(Somedependency somedependency) {
		super();
		this.somedependency = somedependency;
		System.out.println("All dependencies are ready");
	}

	@PostConstruct
	public void initialize() {
		somedependency.getready();
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("All dependencies are ready");
	}
}

@Component
class Somedependency {

	public void getready() {
		System.out.println("Some Logic using Somedependency");
	}

}
