package com.majunwei.learn.webflow.mvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcAction {
    @ResponseBody
    @RequestMapping(value = "mvc/test1")
    public String test1(){
        return "test1";
    }

    @ResponseBody
    @RequestMapping(value = "mvc/test2")
    public String test2(){
        return "test2";
    }
}
