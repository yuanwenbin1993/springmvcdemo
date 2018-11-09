package com.hoperun.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("role/")
public class RoleController {
    @RequestMapping("addRole")
    public String addRole(String userName,String password){
        return "add success";
    }
}
