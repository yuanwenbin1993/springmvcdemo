package com.hoperun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("app/")
public class UserController {
    @RequestMapping("test")
    @ResponseBody
    public String testMVC(Model modell){
        return  "success";
    }


    @RequestMapping("testGit")
    @ResponseBody
    public String testGit(Model modell){
        return  "success";
    }

}
