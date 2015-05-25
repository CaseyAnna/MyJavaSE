package com.lovejava;

////抽象类的成员特点
////常量和变量
////有构造方法：但是不能实例化
////抽象方法和非抽象方法：抽象方法用来限定子类必须完成某些动作
//abstract class Animal {
//	int num = 10;
//	final int num2 = 20;
//	
//	public Animal() {}
//	public Animal(String name, int age) {}
//	public abstract void show();
//	public void method() {
//		System.out.println("method");
//	}
//}
//
//class Dog extends Animal {
//	public void show() {
//		System.out.println("show dog");
//	}
//}
//
//class AbstractDemo2 {
//	public static void main(String[] args) {
//		Animal a = new Dog();
//		a.num = 100;
//		System.out.println(a.num);
//		//a.num2 = 200;
//		System.out.println(a.num2);
//		System.out.println("------------");
//		a.show();
//		a.method();
//	}
//
//}
