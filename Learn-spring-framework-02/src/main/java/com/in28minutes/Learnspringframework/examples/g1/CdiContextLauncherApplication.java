package com.in28minutes.Learnspringframework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import //org.springframework.beans.factory.annotation.Qualifier;
org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Component
@Named
class Businessservice {
	private DataService dataservice;

	public DataService getDataService() {
		System.out.println("setter injection");
		return dataservice;
	}

	@Autowired
	@Inject
	public void setDataService(DataService dataservice) {
		this.dataservice = dataservice;
	}
}

@Component
@Named
class DataService {

}

@Configuration
@ComponentScan // ("com.in28minutes.Learnspringframework.examples.a1")
public class CdiContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(Businessservice.class).getDataService());
		}

	}
}
