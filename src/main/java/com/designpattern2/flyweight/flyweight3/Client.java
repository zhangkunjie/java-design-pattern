package com.designpattern2.flyweight.flyweight3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//测试客户端
public class Client   {
	private static ConnectionPool  connectionPool=null;
	 public static void main(String[] args) {
		 String sql=" select u.name from user u where u.id=1 ";
		 connectionPool=ConnectionPool.getInstance();
		 Connection connection=null;
		 PreparedStatement pstmt=null;
		 ResultSet rs=null;
		 for (int i = 0; i < 5; i++) {
			try {
				 connection=connectionPool.getConnection();
				 pstmt=connection.prepareStatement(sql);
				 rs=pstmt.executeQuery();
				 while (rs.next()) {
					 String name=rs.getString("name");
					 System.out.println(name);
				}
				 ConnectionPool.getInstance().release();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally{
				
			}
		}
	}
}
