package com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo1 {
    public static void main(String[] args) throws IOException {
        //1、创建DatagramSocket用于UDP数据传送。  
        DatagramSocket dsSend = new DatagramSocket();

        //2、创建需要发送的数据包  
        byte[] bysSend = "Hello,UDP!".getBytes();
        int lenSend = bysSend.length;
        InetAddress address = InetAddress.getLocalHost();
        int port = 10001;

        DatagramPacket dpSend = new DatagramPacket(bysSend, lenSend, address, port);
        //3、发送  
        dsSend.send(dpSend);
        //4、关闭连接  
        dsSend.close();
    }
}