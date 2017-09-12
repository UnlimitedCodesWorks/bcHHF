package com.c6.city.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.News;
import com.c6.city.model.Page;
import com.c6.city.service.NewsService;

@Controller
public class NewsController {
	
	String newsTitle;
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping(value="/lastedNews",method=RequestMethod.GET)
	public @ResponseBody List<News> setLasted(){
		return newsService.lastedNews();
	}
	
	@RequestMapping(value="/getNewsTitle",method=RequestMethod.GET)
	public void getNewsTitle(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		newsTitle=(String)request.getParameter("newsTitle");
	}
	
	@RequestMapping(value="/getNewsJosn",method=RequestMethod.GET)
	public @ResponseBody List<News> getNewsJson(){
		return newsService.NewsList(newsTitle);
	}
	
	@RequestMapping(value="/getNewsPicture",method=RequestMethod.GET)
	public @ResponseBody List<News> getNewsPicture(){
		return newsService.newsPicture(newsTitle);
	}
	
	@RequestMapping(value="/hot",method=RequestMethod.GET)
	public @ResponseBody List<News> getHot(){
		return newsService.hotNews();
	}
	
	@RequestMapping(value="/ten",method=RequestMethod.GET)
	public @ResponseBody List<News> setTen(){
		return newsService.ten();
	}
	
	@RequestMapping(value="/setTotal",method=RequestMethod.GET)
	public @ResponseBody List<Page> setTotal(){
		return newsService.getTotal();
	}
	
	@RequestMapping(value="/refresh",method=RequestMethod.GET)
	public @ResponseBody List<News> refresh(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		int num=Integer.parseInt(request.getParameter("num"));
		int startIndex=10*(num-1);
		return newsService.pageRefresh(startIndex);
	}
	
	@RequestMapping(value="/newspage",method=RequestMethod.GET)
	public String newsPage(){
		return "newspage";
	}
	
	@RequestMapping(value="/newshome",method=RequestMethod.GET)
	public String newsHome(){
		return "news-homepage";
	}
}
