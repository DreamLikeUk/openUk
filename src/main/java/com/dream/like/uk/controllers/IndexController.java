package com.dream.like.uk.controllers;

import com.dream.like.uk.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private IUserService userService;
	@RequestMapping(method = RequestMethod.GET)
	public String getMain(ModelMap model) {
		model.addAttribute("main", "openUk main page, hello!");
		return "index";
	}
}