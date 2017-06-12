package com.example.feign_client1;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yaokai on 2017/6/12.
 */
@FeignClient(value = "service-getport")
public interface PortService {
    @RequestMapping(value = "/getPort")
    String getPort();
}
