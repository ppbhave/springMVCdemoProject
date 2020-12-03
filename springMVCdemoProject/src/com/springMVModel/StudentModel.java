package com.springMVModel;

public class StudentModel {
	String name,gender;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGedre() {
		return gender;
	}
	public void setGedre(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentModel [name=" + name + ", gedre=" + gender + ", age=" + age + "]";
	}
	

}
