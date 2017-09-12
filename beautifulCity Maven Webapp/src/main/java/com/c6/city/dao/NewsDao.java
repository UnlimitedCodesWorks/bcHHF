package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.News;
import com.c6.city.model.Page;

@Repository
public interface NewsDao {
	
	public List<News> lastedNews();
	
	public List<News> NewsList(String newsTitle);
	
	public List<News> newsPicture(String newsTitle);
	
	public List<News> hotNews();
	
	public List<News> ten();
	
	public List<News> pageRefresh(int start);
	
	public List<Page> getTotal();
	
}
