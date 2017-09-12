package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.TripItem;

@Repository
public interface TripItemDao {
	
	public List<TripItem> findItem(String placeName);
	
	public List<TripItem> findTrip(String title);
	
	public List<TripItem> findLastedDate();
	
	public List<TripItem> random();
	
	public List<TripItem> hostTrip();
}
