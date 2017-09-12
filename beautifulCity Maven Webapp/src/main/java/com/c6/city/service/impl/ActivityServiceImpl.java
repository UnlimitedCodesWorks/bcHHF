package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.ActivityDao;
import com.c6.city.model.Activity;
import com.c6.city.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{
	
	@Autowired
	ActivityDao activityDao;
	
	public List<Activity> lastedAc(){
		return activityDao.lastedAc();
	}
	
	public List<Activity> findActivity(String date){
		return activityDao.findActivity(date);
	}
	
	public List<Activity> activityWords(String activityTitle){
		return activityDao.activityWords(activityTitle);
	}
	
	public List<Activity> activityPictures(String activityTitle){
		return activityDao.activityPictures(activityTitle);
	}
	
	public List<Activity> acRank(){
		return activityDao.acRank();
	}
}
