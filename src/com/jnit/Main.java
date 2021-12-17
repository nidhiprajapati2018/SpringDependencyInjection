package com.jnit;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		//Resource res= new ClassPathResource("spring.xml");
		//BeanFactory factory = new XmlBeanFactory(res);
		
  ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
			
		Journey x = (Journey)appContext.getBean("lotus");
		x.startJourney();
		
		

	}

}
