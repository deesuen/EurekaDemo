package com.client.eureka.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deesun on 2019/1/25.
 */
@RestController
public class EurekaTestController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi/{name}")
    public String home(@PathVariable String name){
        return "hi"+name+".i am from port:"+port;
    }
}
