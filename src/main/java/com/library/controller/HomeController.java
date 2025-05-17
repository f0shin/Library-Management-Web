package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "/home"})
public class HomeController {
    
    @GetMapping
    public String home(Model model) {
    	System.out.println("✅ HomeController - /, /home - GET 요청 정상 처리!");
    	
        model.addAttribute("message", "Welcome to Spring MVC");
        model.addAttribute("pageTitle", "home");
        model.addAttribute("pagePath", "page/home.jsp");
        
        return "layout";
    }

}