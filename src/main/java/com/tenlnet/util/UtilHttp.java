package com.tenlnet.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletResponse;

public class UtilHttp {
	public static final String ENCODING_UTF_8="UTF-8";
	public static void write(HttpServletResponse response,String content){
		response.setContentType("text/html;charset=UTF-8");
		
		if(content!=null){
			try {
				response.setContentLength(content.getBytes(ENCODING_UTF_8).length);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		PrintWriter writer=null;
		try {
			writer=response.getWriter();
			
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer!=null){
				writer.close();
			}
		}
	}
}	
