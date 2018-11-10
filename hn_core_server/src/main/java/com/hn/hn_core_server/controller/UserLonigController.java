package com.hn.hn_core_server.controller;

import com.hn.hn_core_server.dao.UserLoginDAO;
import com.hn.hn_pojo.Entity.UserVO;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class UserLonigController {

    @Autowired
    private UserLoginDAO userLoginDAO;

    @Autowired
    private EurekaClient eurekaClient;

    /**
     * Eureka Test
     */
    @GetMapping("/testGetList")
    public String testGetList (){

        System.out.println("-----------------------Eureka 调用了我！------------------------------");
        return "Hello ，Eureka";
    }

    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = this.eurekaClient.getNextServerFromEureka("PROVIDER-USER-DEMO2", false);
        return instance.getHomePageUrl();
    }

    /**
     * Eureka Test
     */
    @GetMapping("/getUserLoginByUuid")
    public List<UserVO> getUserLoginByUuid (String uuid){

        System.out.println("----------------------------"+uuid+"---------------------------------");
        return this.userLoginDAO.getUserLoginByUuid();
    }

    /**
     * Eureka Test
     */
    @PostMapping("/getUserLoginByUuid2")
    public List<UserVO> getUserLoginByUuid2 (String uuid){

        System.out.println("----------------------------"+uuid+"---------------------------------");
        return this.userLoginDAO.getUserLoginByUuid();
    }
}
