package com.hn.hn_core_web.web;

import com.hn.hn_pojo.Entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserLoginController {

    @RequestMapping("test")
    public String test(){
        return "/html/index";
    }

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String testGetList2 (Class responseType){

        ResponseEntity<String> forEntity = this.restTemplate.getForEntity("http://localhost:8087/test/testGetList", String.class);
        return forEntity.getBody();
    }

    @GetMapping("/test2")
    public List sss (Class responseType){

        ResponseEntity<List> forEntity = this.restTemplate.getForEntity("http://localhost:8087/test/getUserLoginByUuid", List.class);
        return forEntity.getBody();
    }


}
