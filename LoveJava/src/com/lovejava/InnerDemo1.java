package com.lovejava;

//匿名内部类
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
	
		//方式1.这种做法太麻烦
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
		
		//方式2 多态的方式
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
