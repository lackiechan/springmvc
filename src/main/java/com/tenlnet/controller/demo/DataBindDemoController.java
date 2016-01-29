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
 * ���ݰ󶨵�demo
 * (spring ���ַ�ʽ��demo)
 * get ����
 * post����
 * 1����form ���ύ ��x-www-form-urlencoded[form���ύ�����ݿ��Ա�encode]��
 * 2��form-data��ʽ�ύ��key-value��ʽ����key��value��type(Text��File)��
 * 3��raw��ʽ�������ǣ�text/plain��application/json��application/javascript��application/xml��text/xml��text/html��
 * 4��binary �ļ��ϴ�
 * @author chenly
 *
 */
@Controller
public class DataBindDemoController {
	/**
	 * �����ܽ���get����
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="demo/get",method=RequestMethod.GET)
	public ModelAndView demoRequestMethodGetTest(HttpServletRequest request,HttpServletResponse response){
		
		ModelAndView modelAndView=new ModelAndView();
		UtilHttp.write(response, "���get����,����������get����");
		return modelAndView;
	}
	
	/**
	 * �����ܽ���post����
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="demo/post",method=RequestMethod.POST)
	public ModelAndView demoResuestMethodPostTest(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView=new ModelAndView();
		UtilHttp.write(response, "���post����,����������post����");
		return modelAndView;
	}
	
	
	
//	/*
//	 * ����json�ַ���  
//	 * ��������body row jsonString
//	 */
//	@RequestMapping("demo/requestBody")
//	public void requestBody(@RequestBody User[] users){
//		for(User user:users){
//			System.out.println(user.getName());
//		}
//	}
	
	/*
	 * ����json�ַ���  
	 * ��������body row jsonString
	 */

	@RequestMapping(value="demo/responseJson")
	@ResponseBody
	public User requestBody(User user){
//		Map<String,Object> results=new HashMap<String,Object>();
//		results.put("code", "0");
//		results.put("msg", "�ɹ�");
		User user1=new User();
		user1.setName("111");
		return user1;
	}
}
