package com.c6.city.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.TripItem;

@Service
public interface TripItemService {
	
	public List<TripItem> findItem(String placeName);
	
	public List<TripItem> findTrip(String title);
	
	public List<TripItem> findLastedDate();
	
	public List<TripItem> random();
	
	public List<TripItem> hostTrip();
}
