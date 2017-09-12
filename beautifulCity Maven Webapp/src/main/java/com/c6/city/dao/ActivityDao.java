package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.Activity;

@Repository
public interface ActivityDao {
	
	public List<Activity> lastedAc();
	
	public List<Activity> findActivity(String date);
	
	public List<Activity> activityWords(String activityTitle);
	
	public List<Activity> activityPictures(String activityTitle);
	
	public List<Activity> acRank();
}
