package com.remote.web;

import com.remote.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deesun on 2019/2/14.
 */
@RestController
public class RibbonController {
    @Autowired
    public RibbonService ribbonService;
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @GetMapping("/hi")
    public String hi(){
        return ribbonService.hi("test");
    }
    @GetMapping("/index")
    public String index(){
        return ribbonService.index();
    }
    @GetMapping("/testRobbin")
    public String testRobbin(){
         ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        return serviceInstance.getHost() +":"+serviceInstance.getPort();
    }
}
