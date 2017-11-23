package com.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.registerShutdownHook();
		ComplexObject moreComplexObject = (ComplexObject) context.getBean("moreComplexObject");
		System.out.println(moreComplexObject);
	}
}
