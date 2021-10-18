package com.infy.repository;

import java.time.LocalDate;
import java.util.List;

import com.infy.dto.FlightDTO;

public interface FlightRepository {
	public void insert(FlightDTO flight);
	public List<FlightDTO> search(String source, String destination, LocalDate journeyDate);

}
