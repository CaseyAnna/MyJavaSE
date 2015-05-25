package com.java_01;

public class SellTicketDemo {
	public static void main(String[] args) {
		SellTicket st = new SellTicket();
		
		new Thread(st,"´°¿Ú1").start();
		new Thread(st,"´°¿Ú2").start();
		new Thread(st,"´°¿Ú3").start();
	}
}
