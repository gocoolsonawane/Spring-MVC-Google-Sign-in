package com.gocool.googletestapp.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gocool.googletestapp.model.Response;
import com.gocool.googletestapp.service.GoogleAuthService;

@Controller
public class AppController {
	
	@Autowired
	private GoogleAuthService googleAuthService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		String url=googleAuthService.buildLoginUrl();
		model.addAttribute("googlerequrl",url );
		return new String("index");
	}
	
	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success(Model model,HttpServletRequest request) throws IOException {
		String code=request.getParameter("code");
		String data=googleAuthService.getUserInfoJson(code);
		ObjectMapper mapper = new ObjectMapper();
		Response response=mapper.readValue(data, Response.class);
		model.addAttribute("userdata",response);
		return new String("success");
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String home(@ModelAttribute ("userdata") Response response) throws IOException {
		return new String("success");
	}

}
