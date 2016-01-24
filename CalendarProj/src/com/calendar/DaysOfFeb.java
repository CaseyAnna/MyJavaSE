package com.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class DaysOfFeb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input year:");
        int year = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        System.out.println(c.get(Calendar.DATE));
        c.add(Calendar.DATE, -1);

        System.out.println(c.get(Calendar.DATE));
    }
}
