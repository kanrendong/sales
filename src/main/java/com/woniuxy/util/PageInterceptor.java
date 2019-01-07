package com.woniuxy.util;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.RowBounds;

@Intercepts({@Signature(type=StatementHandler.class,method="prepare",args={Connection.class})})
public class PageInterceptor implements Interceptor{

	@Override
	public Object intercept(Invocation arg0) throws Throwable {
		
		StatementHandler stmt = (StatementHandler)arg0.getTarget();
		
		MetaObject meta = MetaObject.forObject(stmt, new DefaultObjectFactory(), new DefaultObjectWrapperFactory());
		
		RowBounds rowBounds = (RowBounds) meta.getValue("delegate.rowBounds");//返回元对象中的RowBounds对象
		
		if(rowBounds!=null&&rowBounds!=RowBounds.DEFAULT){//RowBounds有值，数据还被重新设置过，证明你要分页了
			//更改SQL语句
			String originalSql = (String) meta.getValue("delegate.boundSql.sql");//得到原来你要执行的SQL语句
			
			int offset = rowBounds.getOffset();//原理RowBoundss里面的Offset
			int limit = rowBounds.getLimit();//原理RowBoundss里面的rows
			meta.setValue("delegate.boundSql.sql",originalSql+" limit "+offset+","+limit+"");//重新设置分页的SQL语句
			meta.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);//设置原有的分页的参数为初始化
			meta.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);//设置原有的分页的参数为初始化
		}
		
		Object obj = arg0.proceed();
		return obj;
	}

	@Override
	public Object plugin(Object arg0) {
		return Plugin.wrap(arg0, this);
	}

	@Override
	public void setProperties(Properties arg0) {
		
	}

}
