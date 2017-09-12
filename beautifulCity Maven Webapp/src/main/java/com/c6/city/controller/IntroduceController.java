package com.c6.city.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.Introduce;
import com.c6.city.service.IntroduceService;

@Controller
public class IntroduceController {
	
	String clickPlace;
	
	@Autowired
	private IntroduceService introduceService;
	
	@RequestMapping(value="/beautyWords",method=RequestMethod.GET)
	public void beautyWords(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		clickPlace=(String)request.getParameter("place");
	}
	
	@RequestMapping(value="/bws",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getBws(){
		return introduceService.findBeautyWords(clickPlace);
	}
	
	@RequestMapping(value="/bps",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getBps(){
		return introduceService.findBeautyPicture(clickPlace);
	}
	
	@RequestMapping(value="/cws",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getCws(){
		return introduceService.findContureWords(clickPlace);
	}
	
	@RequestMapping(value="/cps",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getCps(){
		return introduceService.findConturePicture(clickPlace);
	}
	
	@RequestMapping(value="/sws",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getSws(){
		return introduceService.findSpecialWords(clickPlace);
	}
	
	@RequestMapping(value="/sps",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getSps(){
		return introduceService.findSpecialPicture(clickPlace);
	}
	
	@RequestMapping(value="/tws",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getTws(){
		return introduceService.findTripWords(clickPlace);
	}
	
	@RequestMapping(value="/tps",method=RequestMethod.GET)
	public @ResponseBody List<Introduce> getTps(){
		return introduceService.findTripPicture(clickPlace);
	}
	
	@RequestMapping(value="/introduce",method=RequestMethod.GET)
	public String introducePage(){
		return "introduce";
	}
	
}
