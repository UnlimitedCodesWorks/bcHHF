package com.c6.city.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.Special;
import com.c6.city.service.SpecialService;

@Controller
public class SpecialController {
	
	@Autowired
	private SpecialService specialService;
	
	@RequestMapping(value="/getSpeTitle",method=RequestMethod.GET)
	public @ResponseBody List<Special> getSpecial(HttpServletRequest request, HttpServletResponse response)throws Exception{
		response.setCharacterEncoding("utf-8");
		String travelTitle=(String)request.getParameter("travelTitle");
		return specialService.findSpecial(travelTitle);
	}
}
