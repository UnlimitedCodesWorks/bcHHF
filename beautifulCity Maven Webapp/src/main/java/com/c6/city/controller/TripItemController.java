package com.c6.city.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.TripItem;
import com.c6.city.service.TripItemService;

@Controller
public class TripItemController {
	
	String tl;
	
	@Autowired
	private TripItemService tripItemService;
	
	@RequestMapping(value="/itemIn",method=RequestMethod.GET)
	public @ResponseBody List<TripItem> getItemIntroduce(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		String placeName=(String)request.getParameter("spotsName");
		return tripItemService.findItem(placeName);
	}
	
	@RequestMapping(value="/getTitle",method=RequestMethod.GET)
	public void getTitle(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		tl=(String)request.getParameter("tl");
	}
	
	@RequestMapping(value="/setTitle",method=RequestMethod.GET)
	public @ResponseBody List<TripItem> getTrip(){
		return tripItemService.findTrip(tl);
	}
	
	@RequestMapping(value="/setLasted",method=RequestMethod.GET)
	public @ResponseBody List<TripItem> setLasted(){
		return tripItemService.findLastedDate();
	}
	
	@RequestMapping(value="/setRandom",method=RequestMethod.GET)
	public @ResponseBody List<TripItem> setRandom(){
		return tripItemService.random();
	}
	
	@RequestMapping(value="/setHost",method=RequestMethod.GET)
	public @ResponseBody List<TripItem> setHost(){
		return tripItemService.hostTrip();
	}
	
	@RequestMapping(value="/travel",method=RequestMethod.GET)
	public String travelPage(){
		return "travel";
	}
}
