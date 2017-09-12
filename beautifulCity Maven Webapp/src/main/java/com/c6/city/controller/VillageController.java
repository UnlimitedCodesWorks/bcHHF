package com.c6.city.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c6.city.model.Village;
import com.c6.city.service.VillageService;

@Controller
public class VillageController {
	@Autowired
	private VillageService villageService;
	
	@RequestMapping(value="/villageall",method=RequestMethod.GET)
	public @ResponseBody List<Village> getVillagesJson(){
		return villageService.findAllVillage();
	}
	
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String indexPage(){
		return "index";
	}
}
