package com.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DaysInThisWorld {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String s1 = sdf1.format(d);
		String s2 = sdf2.format(d);
		
		System.out.println(d);
		System.out.println(s1);
		System.out.println(s2);
	}	
}
