package com.java_01;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		
		new Thread(st,"����1").start();
		new Thread(st,"����2").start();
		new Thread(st,"����3").start();
	}
}
