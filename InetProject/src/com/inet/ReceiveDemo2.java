package com.inet;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo2 {
    public static void main(String[] args) throws IOException {
        //1、创建DatagramSocket;  
        DatagramSocket ds = new DatagramSocket(12345);

        //2、创建数据包，用于接收内容。  
        byte[] bys = new byte[1024 * 20];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);

        //3、接收数据         
        ds.receive(dp);

        String ip = dp.getAddress().getHostAddress();
        int c = bys.length;

        //System.out.println(packet.getData().toString());  
        //以上语句打印信息错误，因为getData()返回byte[]类型数据，直接toString会将之序列化，而不是提取字符。应该使用以下方法：  
        System.out.println(new String(dp.getData(), 0, dp.getLength()));
        String res = new String(dp.getData(), 0, dp.getLength());

        System.out.println(ip + " " + res + " " + c);

        //4、关闭连接。  
        ds.close();
    }
}
