package com.object_01;

//getClass()����
//public final Class getClass():���ش� Object ������ʱ��
//public string getName():�� String ����ʽ���ش� Class ��������ʾ��ʵ��

public class GetClassTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Class c = s1.getClass();
		String str = c.getName();
		System.out.println(str);
		
		//��ʽ���
		String str2 = s1.getClass().getName();
		System.out.println(str2);
		
	}	
}
