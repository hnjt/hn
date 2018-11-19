package com.hn.hn_core_web.web;

import com.hn.hn_core_web.service.UserLoginService;
import com.hn.hn_pojo.Entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class UserLoginController {

    @RequestMapping("test")
    public String test(){
        return "/html/index";
    }

    @Autowired
    private RestTemplate restTemplate;

    @Value("${hn_core_server}")
    private String hn_core_server;

    /*@GetMapping("/test")
    public String testGetList2 (Class responseType){

        ResponseEntity<String> forEntity = this.restTemplate.getForEntity(hn_core_server + "/test/testGetList", String.class);
        return forEntity.getBody();
    }*/

    @GetMapping("/test2")
    public List sss (Class responseType){

        ResponseEntity<List> forEntity = this.restTemplate.getForEntity(hn_core_server + "/test/getUserLoginByUuid", List.class);
        return forEntity.getBody();
    }

    @Autowired
    private UserLoginService userLoginImpl;

    @GetMapping("/test3")
    @ResponseBody
    public List<UserVO> ccc (String uuid){

        System.out.println(uuid);
        return this.userLoginImpl.getUserLoginByUuid(uuid);
    }

    @GetMapping("/test4")
    public List<UserVO> sss (String uuid){

        System.out.println(uuid);
        return this.userLoginImpl.getUserLoginByUuid(uuid);
    }

    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public List<UserVO> testPost (@RequestBody String uuid)throws  Exception{

        System.out.println(uuid);
        return this.userLoginImpl.getUserLoginByUuid2(uuid);
    }

}
