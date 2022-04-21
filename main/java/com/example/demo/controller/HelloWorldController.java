package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    /*
     * private HelloWorldService helloWorldService;
     * 
     * 
     * public HelloWorldController(HelloWorldService helloWorldService) {
     * this.helloWorldService = helloWorldService; }
     */

    @GetMapping("/index")
    public String getHello() {
	return "index";
    }

    @PostMapping("/index")

    public String postRequest(@RequestParam("text1") String str1, @RequestParam("text2") String str2, Model model1,
	    Model model2, Model model3) {

	model1.addAttribute("name", str1);
	model2.addAttribute("message", str2);
//	model3.addAttribute("response", helloWorldService.responseMessage(str2));

	return "hello/response";
    }

}
