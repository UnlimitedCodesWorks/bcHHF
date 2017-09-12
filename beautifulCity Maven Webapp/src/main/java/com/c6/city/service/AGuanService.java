package com.c6.city.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.Activity;
import com.c6.city.model.ActivityPage;

@Service
public interface AGuanService {
	
	public List<Activity> setSenven();
	
	public List<Activity> AGuanPage(int start);
	
	public List<ActivityPage> getActivityTotal();
}
