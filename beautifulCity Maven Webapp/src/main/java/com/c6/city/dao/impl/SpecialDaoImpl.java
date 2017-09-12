package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.SpecialDao;
import com.c6.city.model.Special;

public class SpecialDaoImpl extends JdbcDaoSupport implements SpecialDao{
	
	public List<Special> findSpecial(String travelTitle){
		
		String sql="SELECT specialType,specialImg,speImgTitle,speImgContent FROM specialinfo,tripitem WHERE specialinfo.tripNo=tripitem.tripNo AND tripitem.tripTitle='"+travelTitle+"';";
		
		List<Special> special=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Special.class));
		
		return special;
		
	}
}
