package com.test;

import java.util.Scanner;

import com.game.GuessNumber;
import com.inter.UserInter;
import com.inter.impl.UserInterImpl;
import com.pojo.User;

public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("-----��ӭ����-----");
			System.out.println("1 ��¼");
			System.out.println("2 ע��");
			System.out.println("3 �˳�");
			System.out.println("���������ѡ��");

			Scanner sc = new Scanner(System.in);

			String choiceString = sc.nextLine();
			//sc.nextLine();
			int choiceNumber = Integer.parseInt(choiceString);
			UserInter ui = new UserInterImpl();

			switch (choiceNumber) {
			case 1:
				System.out.println("-----��¼����-----");
				System.out.println("�������û�����");
				String username = sc.nextLine();
				System.out.println("���������룺");
				String password = sc.nextLine();

				boolean flag = ui.isLogin(username, password);
				if (flag) {
					System.out.println("��¼�ɹ�,���Կ�ʼ����Ϸ��");
					System.out.println("������?y/n");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) {
							// ����Ϸ
							GuessNumber.start();
							System.out.println("�㻹����?y/n");
						} else {
							break;
						}
					}
					System.out.println("ллʹ�ã���ӭ�´�����");
					System.exit(0);
				} else {
					System.out.println("�û������������󣬵�¼ʧ��");
				}

				break;

			case 2:
				// ��ӭ���棬�������û���������
				System.out.println("-----ע�����-----");
				System.out.println("�������û�����");
				String newUsername = sc.nextLine();
				System.out.println("���������룺");
				String newPassword = sc.nextLine();

				// ���û����������װ��һ��������
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);

				ui.regist(user);
				System.out.println("ע��ɹ�");
				break;

			case 3:
			default:
				System.out.println("ллʹ�ã���ӭ�´�����");
				System.exit(0);
			}
		}
	}
}