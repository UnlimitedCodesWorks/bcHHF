package com.c6.city.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.c6.city.model.News;
import com.c6.city.model.NewsPage;

@Repository
public interface NGuanDao {
	
	public List<News> setSenven();
	
	public List<News> NGuanPage(int start);
	
	public List<NewsPage> getNewsTotal();
}
