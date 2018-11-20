package com.hn.hn_core_web.web;

import com.hn.hn_core_web.service.TestFeginService;
import com.hn.hn_pojo.Entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Meng Xiaodong
 * @description 用户登录控制类
 * @date 2018/11/9
 */
@RestController
@RequestMapping("testFeign")
public class TestFeignController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private TestFeginService testFeginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public List<UserVO> login(@RequestBody UserVO userVO){
        List<UserVO> s = testFeginService.getUserLoginByUuid2(userVO.getUuid());
        System.out.println(",,,,,,,,,");
        System.out.println(userVO);
        return  s;
    }

    @RequestMapping(value = "/testGet",method = RequestMethod.POST)
    public List<UserVO> testGet(@RequestBody String uuid){
        System.out.println(uuid);
        List<UserVO> s = testFeginService.getUserLoginByUuid(uuid);
        System.out.println(",,,,,,,,,");
        return  s;
    }

}
