package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.Special;

@Repository
public interface SpecialDao {
	
	public List<Special> findSpecial(String travelTitle);
}
