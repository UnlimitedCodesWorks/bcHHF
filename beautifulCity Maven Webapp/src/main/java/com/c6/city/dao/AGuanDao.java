package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.Activity;
import com.c6.city.model.ActivityPage;

@Repository
public interface AGuanDao {
	
	public List<Activity> setSenven();
	
	public List<Activity> AGuanPage(int start);
	
	public List<ActivityPage> getActivityTotal();
}
