package com.infy.service;

import java.time.LocalDate;
import java.util.List;

import com.infy.dto.FlightDTO;

public interface FlightService {
	
	public void addFlight(FlightDTO flight);
	
//	public boolean searchFlight(FlightDTO flight);

	List<FlightDTO> searchFlight(String source, String destination, LocalDate journeyDate);

}
