package com.remote.web;

import com.remote.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deesun on 2019/1/25.
 */
@RestController
public class RemoteController {
    @Autowired //自动装配后可以使用
    private HelloRemote helloRemote;


    @GetMapping("/hello/{name}")
    public String index(@PathVariable(value="name") String name) {
        return helloRemote.home(name);
    }

    @RequestMapping("/index")
    public String hello(){
        return "aaaa";
    }
}
