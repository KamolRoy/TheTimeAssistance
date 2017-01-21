package com.comolroy.timesupport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TheTimeAssistanceApplication {

	private static final Log log = LogFactory.getLog(TheTimeAssistanceApplication.class);
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(TheTimeAssistanceApplication.class, args);
		log.info("Beans in application context:");
		
		String beanNames[] = ctx.getBeanDefinitionNames();
		for(String beanName: beanNames){
			log.info("[Created bean: "+ beanName + " ]");
		}
	}
}
