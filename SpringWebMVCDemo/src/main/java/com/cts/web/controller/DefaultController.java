package com.cts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

//	@RequestMapping({"","/","/home"}) 
////	public String defaultGetRequestHandler() { //default web pages(home) localhost:portno/project(or)/(or)/home
////		return "home";		//returning view name		//action name is method name
////	}
	@RequestMapping({"","/","/home"})
	public ModelAndView defaultGetRequestHandler() { //to send data and view name
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("home");
		mv.addObject("pageTitle","Home Page-Welcome");
		mv.addObject("developers", new String[] {"Meena","Soumya"});
		return mv;
	}
		
	}

