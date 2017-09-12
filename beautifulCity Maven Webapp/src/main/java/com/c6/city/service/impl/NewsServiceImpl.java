package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.NewsDao;
import com.c6.city.model.News;
import com.c6.city.model.Page;
import com.c6.city.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{
	
	@Autowired
	NewsDao newsDao;
	
	public List<News> lastedNews(){
		return newsDao.lastedNews();
	}
	
	public List<News> NewsList(String newsTitle){
		return newsDao.NewsList(newsTitle);
	}
	
	public List<News> newsPicture(String newsTitle){
		return newsDao.newsPicture(newsTitle);
	}
	
	public List<News> hotNews(){
		return newsDao.hotNews();
	}
	
	public List<News> ten(){
		return newsDao.ten();
	}
	
	public List<News> pageRefresh(int start){
		return newsDao.pageRefresh(start);
	}
	
	public List<Page> getTotal(){
		return newsDao.getTotal();
	}
}
