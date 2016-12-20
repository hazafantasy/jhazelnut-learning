package com.jhazelnut.jhlearning;

import org.springframework.ui.Model;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("", locale);

		return "login";
	}

	/*
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
    		@RequestParam(value="user", required=true)String name,
    		@RequestParam(value="pass", required=true)String pass,
    		Model model) {

        model.addAttribute("msg", "no no no " + name + " " + pass);

        return "login";
    }
    */


}
