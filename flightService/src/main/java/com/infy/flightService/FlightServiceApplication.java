package com.infy.flightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;


import com.infy.dto.FlightDTO;

import com.infy.service.FlightService;
import com.infy.service.FlightServiceImpl;

@SpringBootApplication
@ComponentScan(basePackages="com.infy.service,com.infy.repository")
public class FlightServiceApplication {	
	
	@Autowired
	FlightService flightService;

	public static void main(String[] args) {
				
		FlightServiceImpl service = null;
		FlightDTO obj=new FlightDTO();
		obj.setAirlines("Emirets");
		obj.setDestination("Dubai");
		obj.setFare(5000.0);
		obj.setJourneyDate(null);
		obj.setSeatCount(2);
		obj.setSource("Delhi");
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(FlightServiceApplication.class, args);
		service = (FlightServiceImpl) context.getBean("flightServiceImpl");
		service.addFlight(obj);
		context.close();
	}

}
