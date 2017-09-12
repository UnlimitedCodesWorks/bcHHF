package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.Page;
import com.c6.city.model.Village;

@Repository
public interface VGuanDao {
	
	public List<Village> setSenven();
	
	public List<Village> VGuanPage(int startIndex);
	
	public List<Page> getVillTotal();
}
