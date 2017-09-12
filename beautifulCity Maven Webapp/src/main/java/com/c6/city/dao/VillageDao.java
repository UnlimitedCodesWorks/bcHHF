package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.Village;
@Repository
public interface VillageDao {
	public List<Village> findAllVillage();
}
