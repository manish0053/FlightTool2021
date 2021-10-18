package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.FlightDTO;
import com.infy.repository.FlightRepositoryImpl;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Autowired
	private FlightRepositoryImpl flightRepository;

	@Override
	public void addFlight(FlightDTO flight) {
		// TODO Auto-generated method stub
		
		flightRepository.insert(flight);
		
	}
	
	@Override
	public List<FlightDTO> searchFlight(String source, String destination, LocalDate journeyDate) {
		// TODO Auto-generated method stub
		List<FlightDTO> flightsAvailable=flightRepository.search(source, destination, journeyDate);
		
		return flightsAvailable;
	}

}
