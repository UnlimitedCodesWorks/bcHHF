package com.c6.city.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.Page;
import com.c6.city.model.Village;

@Service
public interface VGuanService {
	
	public List<Village> setSenven();
	
	public List<Village> VGuanPage(int startIndex);
	
	public List<Page> getVillTotal();
}
