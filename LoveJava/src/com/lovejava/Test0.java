package com.lovejava;
////猫狗案例
//abstract class Animal {
//	private String name;
//	private int age;
//	
//	public Animal() {}
//	public Animal(String name, int age) {
//		this.name = name;
//		this.age = age;
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
//	
//	public abstract void eat();
//}
//
//class Dog extends Animal {
//	public Dog() {	
//	
//	}
//	public Dog(String name, int age) {	
//		super(name,age);
//	}
//	public void eat() {
//		System.out.println("dog eat meat");
//	}
//}
//
//class Cat extends Animal {
//	public Cat() {	
//	
//	}
//	public Cat(String name, int age) {	
//		super(name,age);
//	}
//	public void eat() {
//		System.out.println("cat eat fish");
//	}
//}
//
//public class Test0 {
//	public static void main(String[] args) {
//	//方式1
//	//无参构造
//	Dog d1 = new Dog();
//	d1.setName("xiaohei");
//	d1.setAge(3);
//	System.out.println(d1.getName()+" "+d1.getAge());
//	d1.eat();
//	//带参构造
//	Dog d2 = new Dog("xiaohei", 3);
//	System.out.println(d2.getName()+" "+d2.getAge());
//	d2.eat();
//	System.out.println("-----------");
//	//方式2
//	//无参构造
//	Animal a1 = new Dog();
//	a1.setName("xiaohei");
//	a1.setAge(3);
//	System.out.println(a1.getName()+" "+a1.getAge());
//	a1.eat();
//	//带参构造
//	//多态的方式
//	Animal a2 = new Dog("xiaohei", 3);
//	System.out.println(a2.getName()+" "+a2.getAge());
//	a2.eat();
//	}
//}
