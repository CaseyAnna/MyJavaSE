package com.lovejava;

//�����ڲ���
interface Inter {
	public abstract void show();

	public abstract void show2();
}

class Outer {
	public void method() {
		
//		 new Inter() {
//			public void show() {
//				System.out.println("show");
//			}
//
//			public void show2() {
//				System.out.println("show");
//			}
//		}.show();
	
		//��ʽ1.��������̫�鷳
		new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show();
		
		new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		}.show2();
		
		//��ʽ2 ��̬�ķ�ʽ
		Inter i = new Inter() {
			public void show() {
				System.out.println("show");
			}

			public void show2() {
				System.out.println("show2");
			}
		};
		
		i.show();
		i.show2();
	}
}

public class InnerDemo1 {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}
