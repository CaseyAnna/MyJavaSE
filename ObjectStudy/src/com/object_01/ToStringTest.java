package com.object_01;

//toString����
//public String toString()����
//������ֵ�ȼ���this.getClass().getName() + '@'+ Integer.toHexString(this.hashCode())
public class ToStringTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		
		System.out.println(s.toString());
		System.out.println(s.getClass().getName() + '@'
				+ Integer.toHexString(s.hashCode()));
		
		//ֱ������������Ƶ�ʱ���ǵ�����toString����
		System.out.println(s);
	}
}
