package com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo2 {
    public static void main(String[] args) throws IOException {
        //1、创建DatagramSocket用于UDP数据传送。  
        DatagramSocket ds = new DatagramSocket();

        //2、创建需要发送的数据包  
        byte[] bys = "Hello,UDP!".getBytes();
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getLocalHost(), 12345);
        //3、发送  
        ds.send(dp);
        //4、关闭连接  
        ds.close();
    }
}
