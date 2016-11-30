package com.polomos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.polomos.service.UserService;


@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/list","/"}, method = RequestMethod.GET)
    public String getUserList() {
        userService.getAllUsers();
        return "welcome";
    }

    @RequestMapping(value = "/addUser/{user}", method = RequestMethod.POST)
    public @ResponseBody void addCar(@PathVariable("user") String user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/removeUser/{user}", method = RequestMethod.DELETE)
    public @ResponseBody void removeUser(@PathVariable("user") String user) {
        userService.deleteUser(user);
    }

    @RequestMapping(value = "/removeAllUsers", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllUsers() {
        userService.deleteAll();
    }

    @RequestMapping("/layout")
    public String getUSerPartialPage() {
        return "users/layout";
    }
}
