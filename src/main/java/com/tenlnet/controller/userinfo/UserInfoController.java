package com.tenlnet.controller.userinfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tenlnet.params.request.User;
import com.tenlnet.util.UtilHttp;

@Controller
public class UserInfoController {
	@RequestMapping(value="/user/userInfo")
	private void getUserInfo(HttpServletRequest request,HttpServletResponse response){
		UtilHttp.write(response, "{name:nihao,userId:1222211}");
		
	}
	
	
	@RequestMapping(value="/user/testUserInfo")
	private void testUserInfo(HttpServletRequest request,HttpServletResponse response,User user){
		UtilHttp.write(response, "{name:nihao,userId:1222211}");
	}
	
	
}
