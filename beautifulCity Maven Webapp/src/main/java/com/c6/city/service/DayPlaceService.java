package com.c6.city.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.DayPlace;

@Service
public interface DayPlaceService {
	
	public List<DayPlace> findDaySpots(String title);
	
	public List<DayPlace> daySpotsLook(String title);
}
