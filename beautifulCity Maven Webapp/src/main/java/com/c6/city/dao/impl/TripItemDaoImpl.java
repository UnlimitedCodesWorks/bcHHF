package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.TripItemDao;
import com.c6.city.model.TripItem;

public class TripItemDaoImpl extends JdbcDaoSupport implements TripItemDao{
	
	public List<TripItem> findItem(String placeName){
		
		String sql="SELECT tripTitle,tripContent,tripIcon,tripType,tripPrice,tripStart,tripEnd FROM tripitem WHERE tripTitle LIKE '%"+placeName+"%';";
		
		List<TripItem> itemIntroduce=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(TripItem.class));
		
		return itemIntroduce;
	}
	
	public List<TripItem> findTrip(String title){
		
		String sql="SELECT tripTitle,tripPrice,tripStart,tripEnd,specialContent FROM tripitem WHERE tripTitle='"+title+"';";
		
		List<TripItem> itemTrip=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(TripItem.class));
		
		return itemTrip;
	}
	
	public List<TripItem> findLastedDate(){
		
		String sql="SELECT tripTitle,tripIcon FROM tripitem ORDER BY tripStart ASC limit 0,10;";
		
		List<TripItem> lasted=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(TripItem.class));
		
		return lasted;
	}
	
	public List<TripItem> random(){
		
		String sql="SELECT tripTitle FROM tripitem ORDER BY RAND() LIMIT 9;";
		
		List<TripItem> random=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(TripItem.class));
		
		return random;
	}
	
	public List<TripItem> hostTrip(){
		
		String sql="SELECT tripTitle FROM tripitem ORDER BY tripRank LIMIT 6;";
		
		List<TripItem> host=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(TripItem.class));
		
		return host;
	}
}
