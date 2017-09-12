package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.TripItemDao;
import com.c6.city.model.TripItem;
import com.c6.city.service.TripItemService;

@Service
public class TripItemServiceImpl implements TripItemService{
	
	@Autowired
	TripItemDao tripItemDao;
	
	public List<TripItem> findItem(String placeName){
		return tripItemDao.findItem(placeName);
	}
	
	public List<TripItem> findTrip(String title){
		return tripItemDao.findTrip(title);
	}
	
	public List<TripItem> findLastedDate(){
		return tripItemDao.findLastedDate();
	}
	
	public List<TripItem> random(){
		return tripItemDao.random();
	}
	
	public List<TripItem> hostTrip(){
		return tripItemDao.hostTrip();
	}
}
