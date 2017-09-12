package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.ActivityDao;
import com.c6.city.model.Activity;

public class ActivityDaoImpl extends JdbcDaoSupport implements ActivityDao{
	
	public List<Activity> lastedAc(){
		
		String sql="SELECT acName,acContent,startTime,acIcon FROM activityinfo ORDER BY startTime DESC LIMIT 0,5;";
		
		List<Activity> five=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
		
		return five;
	}
	
	public List<Activity> findActivity(String date){
		
		String sql="SELECT acName,acContent,startTime,acIcon FROM activityinfo WHERE startTime='"+date+"';";
	
		List<Activity> activity=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
		
		return activity;
	}
	
	public List<Activity> activityWords(String activityTitle){
		
		String sql="SELECT acName,acContent,startTime,admin FROM activityinfo WHERE acName='"+activityTitle+"';";
		
		List<Activity> acw=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
		
		return acw;
	}
	
	public List<Activity> activityPictures(String activityTitle){
		
		String sql="SELECT acImg,acImgTitle FROM activityinfo,activityimg WHERE activityinfo.acNo=activityimg.acNo AND acName='"+activityTitle+"';";
	
		List<Activity> acp=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
		
		return acp;
	}
	
	public List<Activity> acRank(){
		
		String sql="SELECT acIcon,acName FROM activityinfo ORDER BY acRank ASC limit 0,5;";
		
		List<Activity> acr=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
		
		return acr;
	}
	
}
