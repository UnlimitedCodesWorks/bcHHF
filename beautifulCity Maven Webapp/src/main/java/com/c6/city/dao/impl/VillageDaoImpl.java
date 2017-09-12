package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.VillageDao;
import com.c6.city.model.Village;
public class VillageDaoImpl extends JdbcDaoSupport implements VillageDao{
	public List<Village> findAllVillage(){
		String sql= "SELECT * FROM villall";
		List<Village> villages=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Village.class));
		return villages;
	}
}
