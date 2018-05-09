package com.cn.action;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.pojo.User;
import com.cn.service.UService;

@Controller
@RequestMapping("/")
@Slf4j
public class UserAction {

	@Autowired
	private UService uService;
	
	@RequestMapping("/regist")
	public String regist(User user){
		//9:40
		log.info("hello");

		//测试
		System.out.println("username="+user.getUsername());
		uService.saveUser(user);
		return "welcome.jsp";
	}

	public UService getuService() {
		return uService;
	}

	public void setuService(UService uService) {
		this.uService = uService;
	}
}
