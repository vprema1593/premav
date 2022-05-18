package com.tcs.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.beans.Emp;

public class TestClient {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Emp e = context.getBean("emp",Emp.class);
		System.out.println(e);
	}

}
