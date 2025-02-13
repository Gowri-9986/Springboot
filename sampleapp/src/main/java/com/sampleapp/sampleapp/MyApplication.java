package com.sampleapp.sampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@SpringBootApplication
public class MyApplication {
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MyApplication.class, args);

	}

}*/
@Controller
public class MyApplication {
 
    @GetMapping("/home")
    public String gethome() {
        return "home"; // This will resolve to /WEB-INF/views/sample.jsp
    }
 
   
}

