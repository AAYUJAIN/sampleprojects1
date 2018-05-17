package com.ibm.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/welcome")
	public String getHome() {
		return "welcome";
	} 
	
	/*@RequestMapping("/admin")
	public String getHome2() {
		return "admin";
	} 
	@RequestMapping("/movietheatre")
	public String getHome1() {
		return "movietheatre";
	} 
	*/
	
}
