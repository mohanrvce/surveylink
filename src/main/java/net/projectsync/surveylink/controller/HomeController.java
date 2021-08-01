package net.projectsync.surveylink.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "hello, world";
	}
	
	@RequestMapping(value = "/support", method = RequestMethod.GET)
	public String getSupport() {
		return "Website under contruction...";
	}
	
	@RequestMapping(value = "/heroku", method = RequestMethod.GET)
	public String heroku() {
		return "App deployed on heroku...";
	}
	
	@RequestMapping(value = "/secret", method = RequestMethod.GET)
	public String getSecret() {
		return "hello, mohan";
	}	
}

