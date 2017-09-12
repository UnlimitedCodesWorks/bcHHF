package com.c6.city.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c6.city.dao.NGuanDao;
import com.c6.city.model.News;
import com.c6.city.model.NewsPage;
import com.c6.city.service.NGuanService;

@Service
public class NGuanServiceImpl implements NGuanService{
	
	@Autowired
	NGuanDao nGuanDao;
	
	public List<News> setSenven(){
		return nGuanDao.setSenven();
	}
	
	public List<News> NGuanPage(int start){
		return nGuanDao.NGuanPage(start);
	}
	
	public List<NewsPage> getNewsTotal(){
		return nGuanDao.getNewsTotal();
	}
}
