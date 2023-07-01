package Spring.practice;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		// 1: Launch a Spring Context-

		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2: Configure the things that we want spring to manage -
		// HelloWorldConfiguration-@configuration
		// name - @Bean

		// 3: Retrieving Beans managed by Spring
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("address2"));
		System.out.println(context.getBean("person2Methodcall"));
		System.out.println(context.getBean("person3parameters"));
		// System.out.println(context.getBean(Address.class));

		// context.getBeanDefinitionNames();
		// System.out.println
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
