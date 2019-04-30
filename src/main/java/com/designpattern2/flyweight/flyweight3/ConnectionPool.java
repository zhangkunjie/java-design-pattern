package com.designpattern2.flyweight.flyweight3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
/*
 * FlyWeightFactory负责创建和管理享元单元，当一个客户端请求时，工厂需要检查当前对象池中是否有符合条件的对象，
 * 如果有，就返回已经存在的对象，如果没有，则创建一个新对象，FlyWeight是超类。一提到共享池，我们很容易联想到Java
 * 里面的JDBC连接池，想想每个连接的特点，我们不难总结出：适用于作共享的一些个对象，他们有一些共有的属性，就拿数据库连接池来说，
 * url、driverClassName、username、 password及dbname，这些属性对于每个连接来说都是一样的，所以就适合用享元模式来处理，
 * 建一个工厂类，将上述类似属性作为内部数据，其它的作为外部数据，在方法调用时，当做参数传进来，这样就节省了空间，减少了实例的数量
 */
public  class ConnectionPool {
		private Vector<Connection> pool;

		/*公有属性*/ 
		private String url = "jdbc:mysql://localhost:3306/test";
		private String username = "root";
		private String password = "mysql";
		private String driverClassName = "com.mysql.jdbc.Driver";

		private int poolSize = 5;
		private static ConnectionPool instance = null;//注意：这个需要使用单例模式
		Connection conn = null;

		/*构造方法，做一些初始化工作*/  
		private ConnectionPool() {
			pool = new Vector<Connection>(poolSize);
			for (int i = 0; i < poolSize; i++) {
				try {
					Class.forName(driverClassName);
					conn = DriverManager.getConnection(url, username, password);
					pool.add(conn);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		 /* 返回连接到连接池 */
		public synchronized void release() {
			pool.add(conn);
		}

		/* 返回连接池中的一个数据库连接 */ 
		public synchronized  Connection getConnection() {
			if (pool.size() > 0) {
				Connection conn = pool.get(0);
				pool.remove(conn);
				return conn;
			} else {
				return null;
			}
		}
		//使用单例模式得到ConnectionPool的唯一实例
		public static synchronized ConnectionPool getInstance()
		{
			if (instance==null) {
				return new ConnectionPool();
			}
            return instance;			
		}
	}

