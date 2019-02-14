package com.remote.service.impl;

import com.remote.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by deesun on 2019/2/14.
 */
@Service
public class RibbbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public String hi(String name) {
        return restTemplate.getForObject("http://eureka-client/hi/sdsd",String.class);
    }

    @Override
    public String index() {
        return restTemplate.getForObject("http://eureka-client/index",String.class);
    }


}
