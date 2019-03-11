package com.javatest.myjavatest.controller;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.javatest.myjavatest.pojo.Resource;
@RestController
@RequestMapping("/user")
public class HelloController {
	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public Object hello() {
		return "hello springboot~~";
	}
	
	@RequestMapping("/getResource")
	public Resource getResource() {
		Resource r = new Resource();
		BeanUtils.copyProperties(resource, r);
		return r;
	}
	
	@RequestMapping("/json")
	public JSONObject myjson() {
		JSONObject json = new JSONObject();
		json.put("name", "张飞");
		json.put("age", 12);
		List<Integer> interges = Arrays.asList(1,2,3);
		json.put("list", interges);
		return json;
	}
	
	
	
	
	@RequestMapping("/error")
	public String error() {
		int a = 1/0;
		return "error";
	}
}
