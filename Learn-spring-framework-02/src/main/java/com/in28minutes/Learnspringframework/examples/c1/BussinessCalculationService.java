package com.in28minutes.Learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BussinessCalculationService {
	private DataService dataservice;// dependency for BCS class

	// creating constructor for above dependency
	public BussinessCalculationService(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	public int findmax() {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
	}

}
