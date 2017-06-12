package com.example.ribbon_client1;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaokai on 2017/6/12.
 */
@RestController
public class PortController {
    @Autowired
    private PortService portService;
    @RequestMapping("/getPort")
    public String getPort(){
        return portService.getPort();
    }
}
