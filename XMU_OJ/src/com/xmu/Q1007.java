package com.xmu;

import java.math.BigInteger;
import java.util.Scanner;

public class Q1007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			BigInteger i1 = sc.nextBigInteger();
			BigInteger i2 = sc.nextBigInteger();

			System.out.print(i1.multiply(i2).toString());
		}
	}
}
