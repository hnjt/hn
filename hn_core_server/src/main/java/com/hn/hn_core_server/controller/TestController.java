package com.hn.hn_core_server.controller;

import com.hn.hn_core_server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * Eureka Test
     */
    @GetMapping("/testGetList")
    public String testGetList (){

        System.out.println("-----------------------Eureka 调用了我！------------------------------");
        List<Map<Object, Object>> maps = this.testService.testGetList();
        for (Map<Object, Object> map : maps) {
            System.out.println(map.toString());
        }
        return "Hello ，Eureka";
    }
}
