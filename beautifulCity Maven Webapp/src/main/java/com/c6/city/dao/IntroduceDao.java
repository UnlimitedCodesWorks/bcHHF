package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.Introduce;

@Repository
public interface IntroduceDao {
	
	public List<Introduce> findBeautyWords(String VillPlace);
	
	public List<Introduce> findBeautyPicture(String VillPlace);
	
	public List<Introduce> findContureWords(String VillPlace);
	
	public List<Introduce> findConturePicture(String VillPlace);
	
	public List<Introduce> findSpecialWords(String VillPlace);
	
	public List<Introduce> findSpecialPicture(String VillPlace);
	
	public List<Introduce> findTripWords(String VillPlace);
	
	public List<Introduce> findTripPicture(String VillPlace);
}
