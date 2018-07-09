package com.moui.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInfo {
	
	 @Test
	    public void test(){
		 
		 ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/spring-redisSentine.xml");
	        
	    }

}
