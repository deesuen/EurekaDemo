package com.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by deesun on 2019/2/14.
 */
@SpringBootApplication
@EnableEurekaClient
public class RibbonApplication {
    public static void main(String []args){
        SpringApplication.run(RibbonApplication.class,args);
    }
}
