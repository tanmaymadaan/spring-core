package com.tanmaymadaan.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/tanmaymadaan/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels());
	}

}
