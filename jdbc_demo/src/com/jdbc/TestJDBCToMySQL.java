package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * JDBCʹ��ʾ��
 * 
 * @author ����
 *
 */
public class TestJDBCToMySQL {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// JDBC Url
		String url = "jdbc:mysql://localhost:3306/taoran";

		String user = "root";
		String password = "19920104Tr.";

		try {
			// ����MySQL����
			Class.forName("com.mysql.jdbc.Driver");
			// ��ȡ���ݿ�����
			conn = DriverManager.getConnection(url, user, password);
			// �����ѯSQL���
			String sql = "select name,age from user";
			// ����PreparedStatement����
			ps = conn.prepareStatement(sql);
			// ִ�в�ѯ����ȡ�����
			rs = ps.executeQuery();

			// ���������
			while (rs.next()) {
				System.out.println(rs.getString("name") + " "+ rs.getInt("age"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// �ر����� �ͷ���Դ
			if (null != rs) {
				rs.close();
			}
			if (null != ps) {
				ps.close();
			}
			if (null != conn) {
				conn.close();
			}
		}
	}
}
