package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.AGuanDao;
import com.c6.city.model.Activity;
import com.c6.city.model.ActivityPage;

public class AGuanDaoImpl extends JdbcDaoSupport implements AGuanDao{
	
	public List<Activity> setSenven(){
		
		String sql="SELECT acIcon,acName,acContent,startTime,admin FROM activityinfo ORDER BY startTime DESC LIMIT 0,7";
	
		List<Activity> senvenAc=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
		
		return senvenAc;
	}
	
	public List<Activity> AGuanPage(int start){
		
		String sql="SELECT acIcon,acName,acContent,startTime,admin FROM activityinfo ORDER BY startTime DESC LIMIT "+start+",7;";
	
		List<Activity> aGuanPage=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Activity.class));
	
		return aGuanPage;
	}
	
	public List<ActivityPage> getActivityTotal(){
		
		String sql="SELECT COUNT(*) AS total FROM activityinfo";
		
		List<ActivityPage> activityPage=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(ActivityPage.class));
		
		return activityPage;
	}
}
