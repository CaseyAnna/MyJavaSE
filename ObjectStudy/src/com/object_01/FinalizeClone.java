package com.object_01;

public class FinalizeClone {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s = new Student();

		s.setName("TA");
		s.setAge(20);
		Object obj = s.clone();
		Student s2 = (Student)obj;
		System.out.println(s2.getName()+" "+s2.getAge());
        System.out.println(s2.equals(s));
	}
}
