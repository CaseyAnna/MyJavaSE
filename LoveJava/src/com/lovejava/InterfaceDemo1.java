package com.lovejava;
//package com.lovejava_01;
//
////�ӿڵ��ص�
////���ܵ���չ
//interface AnimalTrain {
//	public abstract void jump();
//}
//
//// ������ʵ�ֽӿ�
//abstract class Dog implements AnimalTrain {
//
//}
//
//// ������ʵ�ֽӿ�
//class Cat implements AnimalTrain {
//	public void jump() {
//		System.out.println("è����.");
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
////����ӿڣ���ʵ�ֺͶ�ʵ��
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
//		//��Ӧ�Ľӿڵ���Ӧ�ķ���
//		Father f = new Son();
//		f.show();
//		
//		Mother m = new Son();
//		m.show2();
//	}
//}