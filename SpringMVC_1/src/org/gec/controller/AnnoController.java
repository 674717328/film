package org.gec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnoController {

    @RequestMapping("hello2")
    public ModelAndView hello2(){
        System.out.println("hello,我来了");
        ModelAndView mv = new ModelAndView();
        mv.addObject("a","heeeeello");
        mv.setViewName("hello");
        return mv;
    }
}
