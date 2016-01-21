package com.object_01;


public class GetClassTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Class c = s1.getClass();
		String str = c.getName();
		System.out.println(str);
		
		String str2 = s1.getClass().getName();
		System.out.println(str2);
	}	
}
