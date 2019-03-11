package com.javatest.myjavatest.controller;

import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import com.javatest.myjavatest.pojo.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	@RequestMapping("/getUser")
	public User getUser() {
		User u = new User();
		u.setName("孙权");
		u.setAge("28");
		u.setBirthday(new Date());
		
		return u;
	}
}
