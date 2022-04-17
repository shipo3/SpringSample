package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/index")
    public String getHello() {
	return "index";
    }

    @PostMapping("/index")
    public String postRequest1(@RequestParam("text1") String str1, Model model) {

	model.addAttribute("name", str1);
	return "hello/response";
    }

    public String postRequest2(@RequestParam("text2") String str2, Model model) {

	model.addAttribute("message", str2);
	return "hello/response";
    }
}
