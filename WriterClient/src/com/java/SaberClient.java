/* 
 * Author:��Ȼ 
 * StudentNum��23020141153197
 * Date:2015-3-25
 * 
 **/

package com.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SaberClient {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		String desIP = InetAddress.getLocalHost().getHostAddress();
		
		Socket s = new Socket(desIP, 10087);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream()));
		String line = null;
		
		while (true) {
			System.out.print("input:");
			line = br.readLine();
			if ("quit".equalsIgnoreCase(line)) {
				System.out.println("you have been disconnected from the server!");
				break;
			}
			bw.write(line);
			bw.newLine();
			bw.flush();
			String[] strArray = line.split(" ");
			System.out.println("word(s):"+strArray.length);
		}

		s.close();
	}
}
