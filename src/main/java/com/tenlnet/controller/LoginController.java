package com.tenlnet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tenlnet.params.request.User;
import com.tenlnet.util.UtilHttp;
@Controller
public class LoginController {
	@ResponseBody()
	@RequestMapping("/test/testMultiParam")
   public void testUser(HttpServletRequest request,HttpServletResponse response,User user,@RequestParam(value="test", required=false) String test){
		String testString=request.getParameter("test");
		String tokenString =request.getParameter("token");
	   UtilHttp.write(response, "haha");
   }
}
