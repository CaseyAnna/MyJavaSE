package com.object_01;

//protected void finalize & protected Object clone����
public class FinalizeClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		//����ѧ������
		Student s = new Student();

		// Student����дclone����
		//��¡ѧ������
		s.setName("TA");
		s.setAge(20);
		Object obj = s.clone();
		Student s2 = (Student)obj;
		System.out.println(s2.getName()+" "+s2.getAge());
	}
}
