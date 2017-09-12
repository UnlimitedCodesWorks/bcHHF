package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.NGuanDao;
import com.c6.city.model.News;
import com.c6.city.model.NewsPage;

public class NGuanDaoImpl extends JdbcDaoSupport implements NGuanDao{
	
	public List<News> setSenven(){
		
		String sql="SELECT newsIcon,newsName,newsContent,startTime,admin FROM newsinfo ORDER BY startTime DESC LIMIT 0,7";
	
		List<News> senvenNews=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return senvenNews;
	}
	
	public List<News> NGuanPage(int start){
		
		String sql="SELECT newsIcon,newsName,newsContent,startTime,admin FROM newsinfo ORDER BY startTime DESC LIMIT "+start+",7;";
	
		List<News> nGuanPage=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return nGuanPage;
	}
	
	public List<NewsPage> getNewsTotal(){
		
		String sql="SELECT COUNT(*) AS total FROM newsinfo";
		
		List<NewsPage> newsPage=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(NewsPage.class));
		
		return newsPage;
	}

}
