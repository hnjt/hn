package com.hn.hn_core_web.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "/html/index";
    }
}