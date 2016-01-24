package com.inet;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.UnknownHostException;

public class InetDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        //        InetAddress是Java对IP地址的封装，代表互联网协议（IP）地址；
        //        InetAddress对象的获取只能通过静态方法，比如根据主机名获取主机的ip地址封装对象：

        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        InetAddress address1 = InetAddress.getByName("www.google.com");
        System.out.println(address1);

        InetAddress add = InetAddress.getByName("10.2.7.17");
        String name = add.getHostName();
        String ip = add.getHostAddress();

        System.out.println(name + " " + ip);

        //        InetSocketAddress是SocketAddress的实现子类。
        //        此类实现 IP 套接字地址（IP 地址 + 端口号），不依赖任何协议。
        //        在使用Socket来连接服务器时最简单的方式就是直接使用IP和端口，但Socket类中的connect方法并未提供这种方式，而是使用SocketAddress类来向connect方法传递服务器的IP和端口。
        //        SocketAddress只是个抽象类，它除了有一个默认的构造方法外，其它的方法都是abstract的，因此，我们必须使用SocketAddress的子类来建立SocketAddress对象，也就是唯一的子类InetSocketAddress

        final Socket socket = new Socket();
        SocketAddress address2 = new InetSocketAddress("baidu.com", 443);
        try {
            socket.connect(address2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// 连接远程主机
        Thread reader = new Thread() {
            public void run() {
                try {
                    byte[] buffer = new byte[512];
                    InputStream stream = socket.getInputStream();
                    socket.getInputStream().read(buffer);
                } catch (Exception ex) {
         
                }
            }
        };
        reader.start();
    }
}
