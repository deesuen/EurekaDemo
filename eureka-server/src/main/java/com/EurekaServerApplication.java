package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by deesun on 2019/1/24.
 */
@EnableEurekaServer//使用eureka服务注解启动
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String [] args){
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
