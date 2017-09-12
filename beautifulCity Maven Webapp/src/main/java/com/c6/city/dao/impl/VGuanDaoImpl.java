package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.VGuanDao;
import com.c6.city.model.Page;
import com.c6.city.model.Village;

public class VGuanDaoImpl extends JdbcDaoSupport implements VGuanDao{
	
	public List<Village> setSenven(){
		
		String sql="SELECT villPlace,villContent,villImg FROM villall ORDER BY villNo ASC LIMIT 0,7";
	
		List<Village> senven=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Village.class));
		
		return senven;
	}

	public List<Village> VGuanPage(int startIndex){
		
		String sql="SELECT villPlace,villContent,villImg FROM villall ORDER BY villNo ASC LIMIT "+startIndex+",7;";
		
		List<Village> vGuanPage=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Village.class));
		
		return vGuanPage;
	}
	
	public List<Page> getVillTotal(){
		
		String sql="SELECT COUNT(*) AS total FROM villall";
		
		List<Page> page=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Page.class));
		
		return page;
	}
}
