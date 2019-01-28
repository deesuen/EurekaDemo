package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by deesun on 2019/1/25.
 */
@SpringBootApplication
@EnableDiscoveryClient //eureka相关注解
public class EurekaClientApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaClientApplication.class,args);
    }
}
