package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
 @Autowired
 UserService userService;
 
 
 @RequestMapping(method=RequestMethod.GET, value="/login/{id}/{password}")
 public String login(@PathVariable int id, @PathVariable String password)
 {
	 return userService.login(id, password);
 }

 @RequestMapping(method=RequestMethod.POST, value="/register")
 public User register(@RequestBody User u)
 {
	 return userService.register(u);
 }
 	

}
