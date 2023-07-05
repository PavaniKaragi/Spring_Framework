package com.in28minutes.Learnspringframework.examples.e1;

import //org.springframework.beans.factory.annotation.Qualifier;
org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class Normalclass {

}

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class Prototypeclass {

}

@Configuration
@ComponentScan // ("com.in28minutes.Learnspringframework.examples.a1")
public class BeanScopesLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {

			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));
			System.out.println(context.getBean(Prototypeclass.class));

			System.out.println(context.getBean(Normalclass.class));
			System.out.println(context.getBean(Normalclass.class));
			System.out.println(context.getBean(Normalclass.class));
		}
	}
}
