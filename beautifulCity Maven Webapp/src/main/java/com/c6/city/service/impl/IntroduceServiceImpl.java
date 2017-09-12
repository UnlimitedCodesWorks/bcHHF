package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.IntroduceDao;
import com.c6.city.model.Introduce;
import com.c6.city.service.IntroduceService;

@Service
public class IntroduceServiceImpl implements IntroduceService{
	
	@Autowired
	IntroduceDao introduceDao;
	
	public List<Introduce> findBeautyWords(String VillPlace){
		return introduceDao.findBeautyWords(VillPlace);
	}
	
	public List<Introduce> findBeautyPicture(String VillPlace){
		return introduceDao.findBeautyPicture(VillPlace);
	}
	
	public List<Introduce> findContureWords(String VillPlace){
		return introduceDao.findContureWords(VillPlace);
	}
	
	public List<Introduce> findConturePicture(String VillPlace){
		return introduceDao.findConturePicture(VillPlace);
	}
	
	public List<Introduce> findSpecialWords(String VillPlace){
		return introduceDao.findSpecialWords(VillPlace);
	}
	
	public List<Introduce> findSpecialPicture(String VillPlace){
		return introduceDao.findSpecialPicture(VillPlace);
	}
	
	public List<Introduce> findTripWords(String VillPlace){
		return introduceDao.findTripWords(VillPlace);
	}
	
	public List<Introduce> findTripPicture(String VillPlace){
		return introduceDao.findTripPicture(VillPlace);
	}
}
