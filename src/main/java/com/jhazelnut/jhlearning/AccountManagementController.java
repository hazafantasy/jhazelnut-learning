package com.jhazelnut.jhlearning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountManagementController {

    @RequestMapping("/accountmanagement")
    public String accountmanagement(
    		@RequestParam(value="name", required=false, defaultValue="World")String name,
    		Model model) {
        model.addAttribute("name", name);
        return "accountmanagement";
    }

}
