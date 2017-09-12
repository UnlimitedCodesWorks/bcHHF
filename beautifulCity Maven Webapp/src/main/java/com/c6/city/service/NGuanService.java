package com.c6.city.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.c6.city.model.News;
import com.c6.city.model.NewsPage;

@Service
public interface NGuanService {
	
	public List<News> setSenven();
	
	public List<News> NGuanPage(int start);
	
	public List<NewsPage> getNewsTotal();
	
}
