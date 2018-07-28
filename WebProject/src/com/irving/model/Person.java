package com.irving.model;

/**
 * 
 * @author 6006165
 * Person POJO
 * (Plain old Java Object)
 */

public class Person {

	private String name ;
	private String lasName ;
	private String email ;
	private Integer age ;
	private String address ;
	private String password ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLasName() {
		return lasName;
	}
	public void setLasName(String lasName) {
		this.lasName = lasName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", lasName=" + lasName + ", email="
				+ email + ", age=" + age + ", address=" + address
				+ ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
