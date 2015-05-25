package com.lovejava;

//快捷键产生get/set 构造函数


public class tr2 {

	private String name;
	private int age;

	public tr2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public tr2() {
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
