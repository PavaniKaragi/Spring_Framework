package Spring.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating java Beans
//Public accessor methods, constructor
//equals hashCode and toString are automatically created
//released in JDK 16
record Person(String name, int age, Address address) {
};

//Address- first line & city
record Address(String firstline, String city) {
};

@Configuration

public class HelloWorldConfiguration { // configuration class

	@Bean
	public String name() {
		return "Pavani";
	}

	@Bean
	public int age() {
		return 20;
	}

	@Bean
	public Person person() {
		return new Person("Ravi", 20, new Address("Main street", "Utrecht"));
		// return person;
	}

	@Bean
	public Person person2Methodcall() {
		return new Person(name(), age(), address3());// name, age, address
	}
	// return person;

	@Bean
	public Person person3parameters(String name, int age, Address address3) {
		// name,age,address2
		return new Person(name(), age(), address3());// name, age, address
	}

	@Bean(name = "address2")
	public Address address() {
		return new Address("Baker street", "London");
		// return person;
	}

	@Bean(name = "address3")
	public Address address3() {
		return new Address("Mothinagar", "Hyderabad");
	}
}
