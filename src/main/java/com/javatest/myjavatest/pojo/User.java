package com.javatest.myjavatest.pojo;

import java.util.Date;

public class User {
	private String name;
	
	private String age;
	
	private Date birthday;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAge() {
		return this.age;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}
}
