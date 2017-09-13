package it.prova.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyServiceFactory {

	private static ApplicationContext ctx;

	static {
		try {
			ctx = new ClassPathXmlApplicationContext("spring.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ProductService getProductServiceInstance() {
		return ctx.getBean(ProductService.class);
	}

}
