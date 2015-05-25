package com.lovejava;
////老师案例
//
//abstract class Teacher {
//	private String name;
//	private int age;
//	public Teacher() {
//		
//	}
//	
//	public Teacher(String name, int age) {
//		this.age = age;
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	//抽象方法
//	public abstract void teach();
//}
//
//class BasicTeacher extends Teacher {
//	public BasicTeacher() {
//		
//	}
//	
//	public BasicTeacher(String name, int age) {
//		super(name, age);
//	}
//	
//	public void teach() {
//		System.out.println("this is a basic teacher.");
//	}
//
//}
//
//public class Test1 {
//	public static void main(String[] args) {
//		//多态法
//		Teacher t = new BasicTeacher();
//		t.setName("Mr.Liu");
//		t.setAge(22);
//		System.out.println(t.getName()+" "+t.getAge());
//		t.teach();
//	}
//}
