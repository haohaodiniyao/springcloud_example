package com.example.ribbon_client1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yaokai on 2017/6/12.
 */
@Service
public class PortService {
    @Autowired
    private RestTemplate restTemplate;
    public String getPort(){
        return restTemplate.getForObject("http://service-getport/getPort",String.class);
    }
}
