package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.DayPlaceDao;
import com.c6.city.model.DayPlace;

public class DayPlaceDaoImpl extends JdbcDaoSupport implements DayPlaceDao{
	
	public List<DayPlace> findDaySpots(String title){
		
		String sql="SELECT place,day,placeTitle,placeContent,placeImg FROM tripplace,tripitem WHERE tripplace.tripNo=tripitem.tripNo AND tripitem.tripTitle='"+title+"';";
		
		List<DayPlace> daySpots=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(DayPlace.class));
		
		return daySpots;
	}
	
	public List<DayPlace> daySpotsLook(String title){
		
		String sql="SELECT tripDay,day,place FROM tripitem,tripplace WHERE tripitem.tripNo=tripplace.tripNo AND tripitem.tripTitle='"+title+"';";
	
		List<DayPlace> look=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(DayPlace.class));
		
		return look;
	}
}
