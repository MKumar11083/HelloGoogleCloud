package com.example.HelloGoogleCloud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HelloGoogleCloud.Service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService service;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "Hello Manoj welcome to Google Cloud World ";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String getHomePage(ModelMap model, @RequestParam String name) {
		boolean isValidUser = service.validateUser(name);
		if (!isValidUser) {
			model.put("errorMessage", "User not found:)");
			return "login";
		}
		model.put("name", name);
		return "home";
	}

}
