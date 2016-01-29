package com.tenlnet.controller.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tenlnet.model.mybatis.TestUser;
import com.tenlnet.params.request.TestUserRequest;
import com.tenlnet.service.TestUserService;
import com.tenlnet.util.UtilHttp;

@Controller
public class MyBatiesDemoController {
	@Autowired
	private TestUserService testUserService;
	
	@RequestMapping(value="/demo/createUser")
	public void testCreateUser(HttpServletRequest request,HttpServletResponse response,TestUserRequest user){
		try {
			TestUser testUser=new TestUser();
			testUser.setPhone(user.getPhone());
			testUser.setContent(user.getContent());
			testUser.setName(user.getName());
			
			testUserService.insertTestUser(testUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		UtilHttp.write(response, "³É¹¦");
	}
}
