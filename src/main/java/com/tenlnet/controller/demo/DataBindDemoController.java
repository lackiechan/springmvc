package com.tenlnet.controller.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tenlnet.params.request.User;
import com.tenlnet.util.UtilHttp;

/**
 * 数据绑定的demo
 * (spring 各种方式的demo)
 * get 请求
 * post请求
 * 1、（form 表单提交 是x-www-form-urlencoded[form表单提交的数据可以被encode]）
 * 2、form-data方式提交（key-value方式）【key、value、type(Text、File)】
 * 3、raw方式：可以是（text/plain、application/json、application/javascript、application/xml、text/xml、text/html）
 * 4、binary 文件上传
 * @author chenly
 *
 */
@Controller
public class DataBindDemoController {
	/**
	 * 仅仅能接收get请求
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="demo/get",method=RequestMethod.GET)
	public ModelAndView demoRequestMethodGetTest(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView modelAndView=new ModelAndView();
		UtilHttp.write(response, "这个get请求,仅仅可以是get请求");
		return modelAndView;
	}
	
	/**
	 * 仅仅能接收post请求
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="demo/post",method=RequestMethod.POST)
	public ModelAndView demoResuestMethodPostTest(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView=new ModelAndView();
		UtilHttp.write(response, "这个post请求,仅仅可以是post请求");
		return modelAndView;
	}
	
	
	
//	/*
//	 * 接收json字符串  
//	 * 请求类型body row jsonString
//	 */
//	@RequestMapping("demo/requestBody")
//	public void requestBody(@RequestBody User[] users){
//		for(User user:users){
//			System.out.println(user.getName());
//		}
//	}
	
	/*
	 * 接收json字符串  
	 * 请求类型body row jsonString
	 */

	@RequestMapping(value="demo/responseJson")
	@ResponseBody
	public User requestBody(User user){
//		Map<String,Object> results=new HashMap<String,Object>();
//		results.put("code", "0");
//		results.put("msg", "成功");
		User user1=new User();
		user1.setName("111");
		return user1;
	}
}
