package com.c6.city.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.Activity;
import com.c6.city.model.ActivityPage;
import com.c6.city.model.News;
import com.c6.city.model.NewsPage;
import com.c6.city.model.Page;
import com.c6.city.model.Village;
import com.c6.city.service.AGuanService;
import com.c6.city.service.NGuanService;
import com.c6.city.service.VGuanService;

@Controller
public class VillageAdminController {
	
	@Autowired
	VGuanService vGuanService;
	
	@Autowired
	NGuanService nGuanService;
	
	@Autowired
	AGuanService aGuanService;
	
	@RequestMapping(value="/setSenven",method=RequestMethod.GET)
	public @ResponseBody List<Village> setSenvenInfo(){
		return vGuanService.setSenven();
	}
	
	@RequestMapping(value="/setPage",method=RequestMethod.GET)
	public @ResponseBody List<Page> setPage(){
		return vGuanService.getVillTotal();
	}
	
	@RequestMapping(value="/vGuan",method=RequestMethod.GET)
	public @ResponseBody List<Village> refreshPage(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		int n=Integer.parseInt(request.getParameter("number"));
		int startIndex=(n-1)*7;
		return vGuanService.VGuanPage(startIndex);
	}
	
	@RequestMapping(value="/setSenvenNews",method=RequestMethod.GET)
	public @ResponseBody List<News> setSenvenNews(){
		return nGuanService.setSenven();
	}
	
	@RequestMapping(value="/setNewsPage",method=RequestMethod.GET)
	public @ResponseBody List<NewsPage> setNewsPage(){
		return nGuanService.getNewsTotal();
	}
	
	@RequestMapping(value="/nGuan",method=RequestMethod.GET)
	public @ResponseBody List<News> refreshNewsPage(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		int nPage=Integer.parseInt(request.getParameter("pageNumber"));
		int start=(nPage-1)*7;
		return nGuanService.NGuanPage(start);
	}
	
	@RequestMapping(value="/setSenvenActivity",method=RequestMethod.GET)
	public @ResponseBody List<Activity> setSenvenActivity(){
		return aGuanService.setSenven();
	}
	
	@RequestMapping(value="/setActivityPage",method=RequestMethod.GET)
	public @ResponseBody List<ActivityPage> setActivityPage(){
		return aGuanService.getActivityTotal();
	}
	
	@RequestMapping(value="/aGuan",method=RequestMethod.GET)
	public @ResponseBody List<Activity> refreshAcPage(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		int aPage=Integer.parseInt(request.getParameter("aNumber"));
		int start=(aPage-1)*7;
		return aGuanService.AGuanPage(start);
	}
	
	@RequestMapping(value="/villageAdmin",method=RequestMethod.GET)
	public String villageAdminPage(){
		return "villageAdmin";
	}
}
