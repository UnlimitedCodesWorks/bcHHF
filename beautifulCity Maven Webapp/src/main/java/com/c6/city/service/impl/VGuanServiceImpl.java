package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.VGuanDao;
import com.c6.city.model.Page;
import com.c6.city.model.Village;
import com.c6.city.service.VGuanService;

@Service
public class VGuanServiceImpl implements VGuanService{
	
	@Autowired
	VGuanDao vGuanDao;
	
	public List<Village> setSenven(){
		return vGuanDao.setSenven();
	}
	
	public List<Village> VGuanPage(int startIndex){
		return vGuanDao.VGuanPage(startIndex);
	}
	
	public List<Page> getVillTotal(){
		return vGuanDao.getVillTotal();
	}

}
