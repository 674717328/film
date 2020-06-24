package org.gec.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("springmvc 2.5之前都是非注解方式 ");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","aaaaaaaaaaaaaa");
        mv.setViewName("success");
        return mv;
    }
}
