package com.inter;

import com.pojo.User;


public interface UserInter {
	/**
	 * 这是用户登录功能
	 * 
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return 返回登录是否成功
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * 这是用户注册功能
	 * 
	 * @param user
	 * 要注册的用户信息
	 */
	public abstract void regist(User user);
}
