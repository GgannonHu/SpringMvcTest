package com.winton.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HelloController {

	final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/welcome")
	public String welcome(Model model) {
		logger.info("welcome() - ok");

		String message = "Hi, 欢迎来到 Spring + Spring MVC 世界!";

		model.addAttribute("message", message);

		return "hello/welcome";
	}

	@RequestMapping("/testwelcome")
	public String testwelcome(Model model) {

		String message = "测试";
		String message2 = "测试1";

		model.addAttribute("testmessage", message);
		model.addAttribute("testmessage2", message2);

		return "testhello/testwelcome";
	}
}
