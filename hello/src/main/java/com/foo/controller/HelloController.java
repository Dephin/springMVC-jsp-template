package com.foo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping(value = "/index")
    public ModelAndView hello(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Hello!");
        mv.setViewName("index");
        return mv;
    }
}
