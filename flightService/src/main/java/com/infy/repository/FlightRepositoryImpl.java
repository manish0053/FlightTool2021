package com.infy.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.infy.dto.FlightDTO;

@Repository("flightRepository")
public class FlightRepositoryImpl implements FlightRepository{
	List<FlightDTO> flights=new ArrayList<>();
	static Integer flightId=1001;
	public void insert(FlightDTO flight) {
		// TODO Auto-generated method stub
		
		flight.setFlightId(flightId);
		flightId++;
		flights.add(flight);
		
	}

	public List<FlightDTO> search(String source, String destination, LocalDate journeyDate) {
		// TODO Auto-generated method stub
		List<FlightDTO> availableFlights= new ArrayList<>();
		for(FlightDTO flight : flights) {
		if(flight.getSource()==source && flight.getDestination()==destination && flight.getJourneyDate()==journeyDate) {
//			flight.display();
			if(journeyDate.getMonthValue()==12 ||journeyDate.getMonthValue()==1) {
			Double fare=flight.getFare();
			Double newFare=(20.0/100.0*fare);
			
			flight.setFare(newFare);
			}
			availableFlights.add(flight);
			System.out.println("Flight Id :" + flight.getFlightId());
			System.out.println("Flight airlines :" + flight.getAirlines());
			System.out.println("Flight Fare :" + flight.getFare());
			
			
		}	
		}
		return availableFlights;
	}
	

}
