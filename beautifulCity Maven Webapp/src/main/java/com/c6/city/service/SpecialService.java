package com.c6.city.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.Special;

@Service
public interface SpecialService {
	
	public List<Special> findSpecial(String travelTitle);
}
