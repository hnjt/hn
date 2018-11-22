package com.hn.hn_core_web.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class PathPageController {

    @GetMapping(value = "/")
    public ModelAndView index (){

        return new ModelAndView("index");
    }

    @GetMapping(value = "/auth/login")
    public ModelAndView login (){

        return new ModelAndView("html/login");
    }

    @GetMapping(value = "/400")
    public ModelAndView ErrorPage400 (){

        return new ModelAndView("error/400");
    }

    @GetMapping(value = "/404")
    public ModelAndView ErrorPage404 (){

        return new ModelAndView("error/404");
    }

    @GetMapping(value = "/405")
    public ModelAndView ErrorPage405 (){

        return new ModelAndView("error/405");
    }

    @GetMapping(value = "/500")
    public ModelAndView ErrorPage500 (){

        return new ModelAndView("error/500");
    }
}
