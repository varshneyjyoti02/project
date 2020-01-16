package com.example.demo.service;

import com.example.demo.bean.User;

public interface UserService {

	public User register(User u);

	public String login(int id, String password);

}
