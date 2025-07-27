package com.edusol;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootWithJenkinsIntegresionApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringbootWithJenkinsIntegresionApplication.class);


	//       todo java -jar jenkins.war --httpPort=9090

	 @PostConstruct
	 public  void  init(){
		 logger.info("Application started... ");
	 }

	public static void main(String[] args) {
		logger.info("Application executed... ");
		SpringApplication.run(SpringbootWithJenkinsIntegresionApplication.class, args);
	}

}
