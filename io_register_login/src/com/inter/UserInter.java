package com.inter;

import com.pojo.User;


public interface UserInter {
	/**
	 * �����û���¼����
	 * 
	 * @param username
	 *            �û���
	 * @param password
	 *            ����
	 * @return ���ص�¼�Ƿ�ɹ�
	 */
	public abstract boolean isLogin(String username, String password);

	/**
	 * �����û�ע�Ṧ��
	 * 
	 * @param user
	 * Ҫע����û���Ϣ
	 */
	public abstract void regist(User user);
}
