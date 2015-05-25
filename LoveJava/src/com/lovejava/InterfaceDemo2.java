package com.lovejava;

/*
 * 猫狗案例加入跳高
 * 
 *
 */

abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void eat();
	
	public abstract void sleep();
	
}

class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name, int age) {
		super(name, age);	
	}
	
	public void eat() {
		System.out.println("Cat eat");
	}
	
	public void sleep() {
		System.out.println("Cat sleep");
	}
}

class Dog extends Animal {
	
	public Dog() {}
	
	public Dog(String name, int age) {
		super(name, age);	
	}
	
	public void eat() {
		System.out.println("Dog eat");
	}
	
	public void sleep() {
		System.out.println("Dog sleep");
	}
}

interface InterJump {
	public abstract void jump();
}

class TrainedCat extends Cat implements InterJump {
	public TrainedCat() {}
	
	public TrainedCat(String name, int age) {
		super(name, age);	
	}
	
	public void jump() {
		System.out.println("Cat can jump");
	}
}

class TrainedDog extends Dog implements InterJump {
	public TrainedDog() {}
	
	public TrainedDog(String name, int age) {
		super(name, age);	
	}
	
	public void jump() {
		System.out.println("Dog can jump");
	}
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		TrainedCat tc = new TrainedCat("HelloKitty", 2);
		System.out.println(tc.getName()+" "+tc.getAge());
		tc.eat();
		tc.sleep();
		tc.jump();
		TrainedDog td = new TrainedDog("xiaohei", 3);
		System.out.println(td.getName()+" "+td.getAge());
		td.eat();
		td.sleep();
		td.jump();
	}	
}
