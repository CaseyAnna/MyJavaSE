package com.calendar;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DaysInThisWorld {
	public static void main(String[] args) throws ParseException {
		//1.��������
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("input your birthday:");
//		String line = sc.nextLine();
//		
//		//�ַ���ת��Ϊһ������
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Date d = sdf.parse(line);
//		
//		//���ڵõ�����ֵ
//		long myTime = d.getTime();
//		
//		long nowTime = System.currentTimeMillis();
//		
//		long time = nowTime-myTime;
//		
//		long day = time/1000/60/60/24;
//		
//		System.out.println("�������������һ��"+day+"���ˡ�");
		
		//2.����ת�ַ���
		Date d = new Date();
		
		//Ĭ��ģʽ+����ģʽ
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String s1 = sdf1.format(d);
		String s2 = sdf2.format(d);
		
		System.out.println(d);
		System.out.println(s1);
		System.out.println(s2);
	}	
}
