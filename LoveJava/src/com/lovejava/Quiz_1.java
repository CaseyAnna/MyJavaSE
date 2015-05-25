package com.lovejava;
//多态案例

//看程序 写结果
//Love you！
class A {
	public void show() {
		show2();
	}
	public void show2() {
		System.out.println("I");
	}
}
class B extends A {
	public void show2() {
		System.out.println("Love");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("you!");
	}
}
public class Quiz_1 {
	public static void main(String[] args) {
		A a = new B();
		a.show();
		
		B b = new C();
		b.show();
	}
}
