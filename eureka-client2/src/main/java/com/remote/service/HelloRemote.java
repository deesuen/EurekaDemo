package com.remote.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by deesun on 2019/1/25.
 * 在使用FeignClient时，Spring会按name创建不同的ApplicationContext，通过不同的Context来隔离FeignClient的配置信息，
 * 在使用配置类时，不能把配置类放到Spring App Component scan的路径下，否则，配置类会对所有FeignClient生效.
 */
@FeignClient(name="client-producter")//name 需要调用的appname
public interface HelloRemote {
    /*
    * 对应client product中的接口.需要注意如果使用@PathVariable 需要把参数写完整.
    * url地址也要和生产者一致.否者会报错:UnsatisfiedDependencyException
    * */
    @GetMapping("/hi/{name}")
    public String home(@PathVariable(value ="name") String name);
}
