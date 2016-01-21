package com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo1 {
    public static void main(String[] args) throws IOException {
        //1、创建DatagramSocket;  
        DatagramSocket dsReceive = new DatagramSocket(10001);

        //2、创建数据包，用于接收内容。  
        byte[] bysReceive = new byte[1024 * 20];
        int lenReceive = bysReceive.length;
        DatagramPacket dpReceive = new DatagramPacket(bysReceive, lenReceive);

        //3、接收数据       
        dsReceive.receive(dpReceive);

        InetAddress address = dpReceive.getAddress();
        String ip = address.getHostAddress();
        String host = address.getHostName();

        byte[] bysBuffer = dpReceive.getData();
        int lenBuffer = dpReceive.getLength();
        String s = new String(bysBuffer, 0, lenBuffer);

        System.out.println(ip + " " + host + " " + s);
        //4、关闭连接。  
        dsReceive.close();
    }
}
