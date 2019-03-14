package com.itlin06_ObjectOutputStream;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7064534283102403044L;
	String name;
	int age;
	String gender;
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
