package com.cn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.dao.UserDao;
import com.cn.pojo.User;

@Service
public class UService {

	@Autowired
	private UserDao userDao;
	
	public void saveUser(User user){
		userDao.saveUser(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
