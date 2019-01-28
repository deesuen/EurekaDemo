package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by deesun on 2019/1/25.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages ="com.remote.service.**") //如果是独立jar包,需要加上basepackages.否则会自动装配不上
public class EurekaApplication {
    public static void main(String [] args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
