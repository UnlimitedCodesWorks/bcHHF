package com.c6.city.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.DayPlace;
import com.c6.city.service.DayPlaceService;

@Controller
public class DayPlaceController {
	
	@Autowired
	private DayPlaceService dayPlaceService;
	
	@RequestMapping(value="/getSpots",method=RequestMethod.GET)
	public @ResponseBody List<DayPlace> getSpots(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		String title=(String)request.getParameter("tl");
		return dayPlaceService.findDaySpots(title);
	}
	
	@RequestMapping(value="/setLook",method=RequestMethod.GET)
	public @ResponseBody List<DayPlace> setLook(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		String title=(String)request.getParameter("title");
		return dayPlaceService.daySpotsLook(title);
	}
}
