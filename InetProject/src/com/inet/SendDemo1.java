package com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SendDemo1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket dsSend = new DatagramSocket();
		
		byte[] bysSend = "Hello,UDP!".getBytes();
		int lenSend = bysSend.length;
		InetAddress address = InetAddress.getByName("TAO");
		int port = 10001;

		DatagramPacket dpSend = new DatagramPacket(bysSend, lenSend, address,
				port);

		dsSend.send(dpSend);

		dsSend.close();
	}
}