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
import com.c6.city.service.ActivityService;

@Controller
public class ActivityController {
	
	String acTitle;
	
	@Autowired
	private ActivityService activityService;
	
	@RequestMapping(value="/acLasted",method=RequestMethod.GET)
	public @ResponseBody List<Activity> setLasted(){
		return activityService.lastedAc();
	}
	
	@RequestMapping(value="/getAc",method=RequestMethod.GET)
	public @ResponseBody List<Activity> getAc(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		String date=(String)request.getParameter("dt");
		return activityService.findActivity(date);
	}
	
	@RequestMapping(value="/activityWords",method=RequestMethod.GET)
	public void activityWords(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		acTitle=(String)request.getParameter("atl");
	}
	
	@RequestMapping(value="/acw",method=RequestMethod.GET)
	public @ResponseBody List<Activity> acw(){
		return activityService.activityWords(acTitle);
	}
	
	@RequestMapping(value="/acp",method=RequestMethod.GET)
	public @ResponseBody List<Activity> acp(){
		return activityService.activityPictures(acTitle);
	}
	
	@RequestMapping(value="/acr",method=RequestMethod.GET)
	public @ResponseBody List<Activity> acr(){
		return activityService.acRank();
	}
	
	@RequestMapping(value="/activity",method=RequestMethod.GET)
	public String activityPage(){
		return "activitypage";
	}
	
}
