package com.jhazelnut.jhlearning;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;
import com.jhazelnut.jhlearning.beans.JhlStatusRestResponseBean;

@Controller
public class LoginValidationController {
	
	@RequestMapping(value = "/loginvalidation",  produces = "application/json", method = RequestMethod.GET)
	public @ResponseBody JhlStatusRestResponseBean loginValidation(
    		@RequestParam(value="user", required=true)String name,
    		@RequestParam(value="pass", required=true)String pass
			) {
		
		JhlStatusRestResponseBean bean;
		
		if(name.equals("hmojica") && pass.equals("123")) {
			bean = new JhlStatusRestResponseBean("OK");
		} else {
			bean = new JhlStatusRestResponseBean("ERROR");
		}
		
		return bean;
	}
	
}