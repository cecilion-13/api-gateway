package com.harsh.apigatewaydemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ApiGatewayDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayDemo1Application.class, args);
	}

}
