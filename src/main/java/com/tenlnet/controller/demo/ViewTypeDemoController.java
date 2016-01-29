package com.tenlnet.controller.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tenlnet.params.request.User;
/**
 * ��ͼ���ͣ���jsp��ftl�� ��Ҫ��springmvc-servlet.xml���ã�
 * @author chenly
 * 
 */
@Controller
public class ViewTypeDemoController {
	/**
	 * ����jsp��ͼ��demo
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
		//��ƥ��/jsp ��·�� ת��jsp��ͼ
		modelAndView.setViewName("/jsp/user/userinfo");
		return modelAndView;
	}
	
	
	/**
	 * ����ftl��ͼ��demo
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
		//��ƥ��/ftl ��·�� ת��ftl��ͼ
		modelAndView.setViewName("/ftl/user/userinfo");
		return modelAndView;
	}
}
