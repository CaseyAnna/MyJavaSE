package com.test;

import java.util.Scanner;

import com.game.GuessNumber;
import com.inter.UserInter;
import com.inter.impl.UserInterImpl;
import com.pojo.User;

public class UserTest {
	public static void main(String[] args) {
		while (true) {
			System.out.println("-----欢迎光临-----");
			System.out.println("1 登录");
			System.out.println("2 注册");
			System.out.println("3 退出");
			System.out.println("请输入你的选择：");

			Scanner sc = new Scanner(System.in);

			String choiceString = sc.nextLine();
			//sc.nextLine();
			int choiceNumber = Integer.parseInt(choiceString);
			UserInter ui = new UserInterImpl();

			switch (choiceNumber) {
			case 1:
				System.out.println("-----登录界面-----");
				System.out.println("请输入用户名：");
				String username = sc.nextLine();
				System.out.println("请输入密码：");
				String password = sc.nextLine();

				boolean flag = ui.isLogin(username, password);
				if (flag) {
					System.out.println("登录成功,可以开始玩游戏了");
					System.out.println("你玩吗?y/n");
					while (true) {
						String resultString = sc.nextLine();
						if (resultString.equalsIgnoreCase("y")) {
							// 玩游戏
							GuessNumber.start();
							System.out.println("你还玩吗?y/n");
						} else {
							break;
						}
					}
					System.out.println("谢谢使用，欢迎下次再来");
					System.exit(0);
				} else {
					System.out.println("用户名或密码有误，登录失败");
				}

				break;

			case 2:
				// 欢迎界面，请输入用户名和密码
				System.out.println("-----注册界面-----");
				System.out.println("请输入用户名：");
				String newUsername = sc.nextLine();
				System.out.println("请输入密码：");
				String newPassword = sc.nextLine();

				// 把用户名和密码封装到一个对象中
				User user = new User();
				user.setUsername(newUsername);
				user.setPassword(newPassword);

				ui.regist(user);
				System.out.println("注册成功");
				break;

			case 3:
			default:
				System.out.println("谢谢使用，欢迎下次再来");
				System.exit(0);
			}
		}
	}
}