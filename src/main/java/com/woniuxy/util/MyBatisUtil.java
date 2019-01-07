package com.woniuxy.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static ThreadLocal<SqlSession> sessionLocal = new ThreadLocal<SqlSession>();
	
	private static SqlSessionFactory factory;
	
	static {
		InputStream in = MyBatisUtil.class.getResourceAsStream("/configuration.xml");
		factory= new SqlSessionFactoryBuilder().build(in);
	}
	
	public static SqlSession getSession() {
		SqlSession session = sessionLocal.get();
		if(session==null) {
			session = factory.openSession();
			sessionLocal.set(session);
		}
		return session;
	}
	public static void close() {
		SqlSession session = sessionLocal.get();
		sessionLocal.set(null);
		if(session!=null) {
			session.close();
		}
	}
}
