package com.c6.city.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.c6.city.dao.NewsDao;
import com.c6.city.model.News;
import com.c6.city.model.Page;

public class NewsDaoImpl extends JdbcDaoSupport implements NewsDao{
	
	public List<News> lastedNews(){
		
		String sql="SELECT newsName,newsContent,startTime,newsIcon FROM newsinfo ORDER BY startTime DESC LIMIT 5;";
	
		List<News> lasted=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return lasted;
	}
	
	public List<News> NewsList(String newsTitle){
		
		String sql="SELECT newsName,newsContent,startTime,admin FROM newsinfo WHERE newsName='"+newsTitle+"';";
		
		List<News> newsWords=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return newsWords;
	}
	
	public List<News> newsPicture(String newsTitle){
		
		String sql="SELECT newsImage,newsImgTitle FROM newsinfo,newsimg WHERE newsinfo.newsNo=newsimg.newsNo AND newsName='"+newsTitle+"';";
	
		List<News> newsPictures=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return newsPictures;
	}
	
	public List<News> hotNews(){
		
		String sql="SELECT newsName FROM newsinfo ORDER BY newsRank ASC LIMIT 10;";
		
		List<News> newsHot=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return newsHot;
	}
	
	public List<News> ten(){
		
		String sql="SELECT newsName,startTime FROM newsinfo ORDER BY startTime DESC LIMIT 0,10;";
	
		List<News> ten=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return ten;
	}
	
	public List<News> pageRefresh(int start){
		
		String sql="SELECT newsName,startTime FROM newsinfo ORDER BY startTime DESC LIMIT "+start+",10;";
		
		List<News> refresh=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(News.class));
		
		return refresh;
	}
	
	public List<Page> getTotal(){
		
		String sql="SELECT COUNT(*) AS total FROM newsinfo";
		
		List<Page> total=getJdbcTemplate().query(
				sql,new BeanPropertyRowMapper(Page.class));
		
		return total;
	}
}
