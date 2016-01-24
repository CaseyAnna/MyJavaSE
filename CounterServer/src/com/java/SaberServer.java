package com.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SaberServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10087);

        Socket s = ss.accept();
        System.out.println("server listening...");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        s.close();
    }
}
