package com.tenlnet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tenlnet.util.UtilHttp;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/he",method=RequestMethod.GET)
	public void hello(HttpServletRequest request,HttpServletResponse response){
		String dddString="";
//		response.setCharacterEncoding("UTF-8");
		UtilHttp.write(response, "ÄãºÃ");
	}
	
	public String test(HttpRequest request,HttpServletResponse response){
		
		return "";
	}
}
