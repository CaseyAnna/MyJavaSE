package com.day14;

//������ʽ�ָ��
import java.util.Arrays;

public class RegexDemo2 {
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		
		String[] strArray = s.split(" ");
		int[] a = new int[strArray.length];
		
		for (int i=0; i<a.length; ++i) {
			a[i]=Integer.parseInt(strArray[i]);
		}
		
		Arrays.sort(a);
		
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<a.length; ++i) {
			sb.append(a[i]).append(" ");
		}
		
		String res = sb.toString().trim();
		
		System.out.println(res);
	}
}
