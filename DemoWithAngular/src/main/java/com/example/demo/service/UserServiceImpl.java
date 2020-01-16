package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;

	@Override
	public User register(User u) {

		u.setEmailId(u.getEmailId());
		u.setGender(u.getGender());
		u.setId(u.getId());
		u.setMobNo(u.getMobNo());
		u.setName(u.getName());
		u.setPassword(u.getPassword());

		return userdao.save(u);
	}

	@Override
	public String login(int id, String password) {
		if (userdao.findById(id) != null) {
			User ad = userdao.findById(id).get();
			if (ad.getPassword().equals(password)) {
				return "Login successful.";
			}
		}
		return "Login Failed.";
	}
}
