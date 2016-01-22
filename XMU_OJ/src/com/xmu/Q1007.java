package com.xmu;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = "abc";
        System.out.println(str1 == str2); //false 
        System.out.println(str1.equals(str2)); //true 
        System.out.println(str1 == str3); //false 
        System.out.println(str2 == str4); //true
        //        两种的形式来创建，第一种是用new()来新建对象的，它会在存放于堆中。每调用一次就会创建一个新的对象。  
        //        而第二种是先在栈中创建一个对String类的对象引用变量str，然后查找栈中有没有存放"abc"，如果没有，则将"abc"存放进栈，并令str指向”abc”，如果已经有”abc” 则直接令str指向“abc”。  

		while (sc.hasNext()) {
			BigInteger i1 = sc.nextBigInteger();
			BigInteger i2 = sc.nextBigInteger();

			System.out.print(i1.multiply(i2).toString());
		}
	}
}
