package com.lovejava;
//package com.lovejava_01;
//
////接口的特点
////功能的扩展
//interface AnimalTrain {
//	public abstract void jump();
//}
//
//// 抽象类实现接口
//abstract class Dog implements AnimalTrain {
//
//}
//
//// 具体类实现接口
//class Cat implements AnimalTrain {
//	public void jump() {
//		System.out.println("猫跳高.");
//	}
//}
//
//interface Father {
//	public abstract void show();
//}
//
//interface Mother {
//	public abstract void show2();
//}
//
////类与接口：单实现和多实现
//class Son implements Father, Mother {
//	public void show() {
//		System.out.println("show");
//	}
//
//	public void show2() {
//		System.out.println("show2");
//	}
//}
//
//public class InterfaceDemo1 {
//	public static void main(String[] args) {
//
//		// AnimalTrain at = new Cat();
//		// at.jump();
//		
//		//对应的接口调对应的方法
//		Father f = new Son();
//		f.show();
//		
//		Mother m = new Son();
//		m.show2();
//	}
//}