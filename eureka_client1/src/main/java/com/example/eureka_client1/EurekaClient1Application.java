package com.example.eureka_client1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient1Application {
    @Value("${server.port}")
	private String port;
	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}
	@RequestMapping("/getPort")
	public String getPort(){
		return "服务端口:"+port;
	}
}
