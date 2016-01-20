package com.stringstudy_01;

public class StringDemo3 {
	public static void main(String[] args) {

        String s1 = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
		String s2 = "java";
		int count = 0;
		
		int index;
		while ((index = s1.indexOf(s2)) != -1) {
			count++;
			s1 = s1.substring(index + s2.length());
            System.out.println(s1);
			index = s1.indexOf(s2);
		}
		System.out.println(count);
	}
}
