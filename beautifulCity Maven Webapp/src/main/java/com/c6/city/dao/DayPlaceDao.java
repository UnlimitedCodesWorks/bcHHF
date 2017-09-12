package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.DayPlace;

@Repository
public interface DayPlaceDao {
	
	public List<DayPlace> findDaySpots(String title);
	
	public List<DayPlace> daySpotsLook(String title);
}
