package com.hn.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Meng Xiaodong
 * @description 测试controller
 * @date 2018/10/29
 */
@Controller
public class TestController {

    @RequestMapping("toIndex")
    public String toIndex(){
        return  "index";
    }


}
