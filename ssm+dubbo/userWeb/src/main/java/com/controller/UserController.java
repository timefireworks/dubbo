package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:用户请求处理Controller
 * @author:San Jinhong
 * @create:2018-08-21 15:48
 **/
public class UserController {
    
    /**注入服务提供者userService*/
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public String index(HttpServletRequest request, HttpServletResponse response, Model model){
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList", userList);
        return "index";
    }

    @RequestMapping(value = "/api/getUser", method={RequestMethod.GET, RequestMethod.POST})
    public String getUser(HttpServletRequest request, HttpServletResponse response, Model model,
                          @RequestParam (value = "id", required = true) Integer id){
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "updateUser";
    }

}
