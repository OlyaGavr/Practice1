package com.Practice1.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	House NewHouse = (House)context.getBean("PrivateHouse");
    	NewHouse.live();
    }

}
