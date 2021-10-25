package com.ty.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ty.springmvc.bean.LoginDetails;

@Controller
public class SpringMvcController {

	@RequestMapping(path = "/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/getdata")
	public String getList(ModelMap model) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		model.addAttribute("listdata", list);
//		model.addObject(list);
		return "getdata";
	}

//	@PostMapping("/afterLogin")
//	public String getAfterLogin(ModelMap map, @RequestParam(name = "name") String name,
//			@RequestParam(name = "pwd") String pass) {
//		map.addAttribute("name", name);
//		map.addAttribute("pwd", pass);
//
//		return "afterLogin";
//	}

	
//	  @PostMapping( "/afterLogin") public String getAfterLogin1(ModelMap map,
//	  String name, String pwd) { map.addAttribute("name", name);
//	  map.addAttribute("pwd", pwd);
//	  
//	  return "afterLogin"; }
	  
	  @PostMapping("/afterLogin")
	  public String getAfterLogin2(ModelMap map ,LoginDetails loginDetails)
	  {
		  map.addAttribute("details", loginDetails);
		  return "afterLogin";
	  }
	 
}
