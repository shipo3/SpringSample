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

    public String postRequest(@RequestParam("text1") String name, @RequestParam("text2") String message, Model model) {

	String response = "";

	if (message.isEmpty()) {
//	    レスポンスメッセージに以下を入れる
	    response = "これからよろしくお願い致します！";
	} else {
	    response = "メッセージありがとうございます(^_^)";
	}

	model.addAttribute("name", name);
	model.addAttribute("message", message);
	model.addAttribute("response", response);

	return "hello/response";
    }

}
