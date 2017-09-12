package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.VillageDao;
import com.c6.city.model.Village;
import com.c6.city.service.VillageService;

@Service
public class VillageServiceImpl implements VillageService{
	@Autowired
	VillageDao villageDao;
	public List<Village> findAllVillage(){
		return villageDao.findAllVillage();
	}
}
