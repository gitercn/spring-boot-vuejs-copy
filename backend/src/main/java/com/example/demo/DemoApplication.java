package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.demo.dao.RoomMapper;

@SpringBootApplication
public class DemoApplication  {

//	private final RoomMapper roomMapper;
//
//	public DemoApplication(RoomMapper roomMapper) {
//	    this.roomMapper = roomMapper;
//	  }


	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println(this.roomMapper.findByRoomId("CA"));
//	}


//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//	  return new WebMvcConfigurerAdapter() {
//	    @Override
//	    public void addCorsMappings(CorsRegistry registry) {
//	      registry.addMapping("/api/*").allowedOrigins("http://localhost:8080");
//	    }
//	  };
//	}

}
