package com.example.demo;

import com.example.demo.model.Address;
import com.example.demo.model.Project;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication is a combination of the following three annotations.
//@ComponentScan.
//@EnableAutoConfiguration.
//@Configuration.

//what is @ComponentScan?
//answer: where to look for the components like controller, service, and repository. Its default value is
//the standard default/main package. We can also customize  the @ComponentScan using something like @ComponentScan ("specify your package
//name.

//What is @EnableAutoConfiguration?
//answer: SpringBoot looks at the pom file and scans/read everything/all dependencies which automatically
// enables to start our services.

//what is @Configuration?
//we can write different beans with the different definition and @Configuration helps us to use it if we
//denote it on main java file.


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

	    /*ApplicationContext applicationContext =  SpringApplication.run(DemoApplication.class, args);

		Address address = applicationContext.getBean(Address.class);
		System.out.println(address);*/

		SpringApplication.run(DemoApplication.class,args);
	}

}
