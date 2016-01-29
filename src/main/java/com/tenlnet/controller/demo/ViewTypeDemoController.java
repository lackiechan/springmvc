package com.tenlnet.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tenlnet.params.request.User;
/**
 * 视图类型：（jsp、ftl等 需要在springmvc-servlet.xml配置）
 * @author chenly
 * 
 */
@Controller
public class ViewTypeDemoController {
	/**
	 * 返回jsp视图的demo
	 * @return
	 */
	@RequestMapping(value="/demo/view/jsp")
	public ModelAndView getJspView(){
		ModelAndView modelAndView=new ModelAndView();
		
		User user=new User();
		user.setName("1");
		user.setTest("test");
		user.setToken("12hjhsdjfhjksk");
		
		modelAndView.addObject("user",user);
		//（匹配/jsp ）路径 转向jsp视图
		modelAndView.setViewName("/jsp/user/userinfo");
		return modelAndView;
	}
	
	
	/**
	 * 返回ftl视图的demo
	 * @return
	 */
	@RequestMapping(value="/demo/view/ftl")
	public ModelAndView getFtlView(){
		ModelAndView modelAndView=new ModelAndView();
		
		User user=new User();
		user.setName("1");
		user.setTest("test");
		user.setToken("12hjhsdjfhjksk");
		
		modelAndView.addObject("user",user);
		//（匹配/ftl ）路径 转向ftl视图
		modelAndView.setViewName("/ftl/user/userinfo");
		return modelAndView;
	}
}
