package com.java_01;

public class SellTicket implements Runnable {
	private int ticket = 100;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (ticket > 0) {
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
						// TODO: handle exception
					}
					System.out.println(Thread.currentThread().getName()+"���ڳ��۵�"+
					(ticket--)+"��Ʊ");
				}
			}
		}
	}
}
