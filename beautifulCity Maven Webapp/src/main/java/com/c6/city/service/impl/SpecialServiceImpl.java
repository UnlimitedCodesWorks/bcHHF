package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.SpecialDao;
import com.c6.city.model.Special;
import com.c6.city.service.SpecialService;

@Service
public class SpecialServiceImpl implements SpecialService{
	
	@Autowired
	SpecialDao specialDao;
	
	public List<Special> findSpecial(String travelTitle){
		return specialDao.findSpecial(travelTitle);
	}
}
