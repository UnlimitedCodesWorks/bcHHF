package com.c6.city.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.Activity;

@Service
public interface ActivityService {
	
	public List<Activity> lastedAc();
	
	public List<Activity> findActivity(String date);
	
	public List<Activity> activityWords(String activityTitle);
	
	public List<Activity> activityPictures(String activityTitle);
	
	public List<Activity> acRank();
}
