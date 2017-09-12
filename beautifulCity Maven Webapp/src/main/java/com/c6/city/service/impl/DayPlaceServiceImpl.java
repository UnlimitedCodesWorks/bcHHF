package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.DayPlaceDao;
import com.c6.city.model.DayPlace;
import com.c6.city.service.DayPlaceService;

@Service
public class DayPlaceServiceImpl implements DayPlaceService{
	
	@Autowired
	DayPlaceDao dayPlaceDao;
	
	public List<DayPlace> findDaySpots(String title){
		return dayPlaceDao.findDaySpots(title);
	}
	
	public List<DayPlace> daySpotsLook(String title){
		return dayPlaceDao.daySpotsLook(title);
	}
}
