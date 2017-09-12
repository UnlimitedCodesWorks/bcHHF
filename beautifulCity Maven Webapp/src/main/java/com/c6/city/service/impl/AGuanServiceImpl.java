package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.AGuanDao;
import com.c6.city.model.Activity;
import com.c6.city.model.ActivityPage;
import com.c6.city.service.AGuanService;

@Service
public class AGuanServiceImpl implements AGuanService{
	
	@Autowired
	AGuanDao aGuanDao;
	
	public List<Activity> setSenven(){
		return aGuanDao.setSenven();
	}
	
	public List<Activity> AGuanPage(int start){
		return aGuanDao.AGuanPage(start);
	}
	
	public List<ActivityPage> getActivityTotal(){
		return aGuanDao.getActivityTotal();
	}
}
