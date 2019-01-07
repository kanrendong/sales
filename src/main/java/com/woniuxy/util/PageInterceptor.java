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
		
		RowBounds rowBounds = (RowBounds) meta.getValue("delegate.rowBounds");//����Ԫ�����е�RowBounds����
		
		if(rowBounds!=null&&rowBounds!=RowBounds.DEFAULT){//RowBounds��ֵ�����ݻ����������ù���֤����Ҫ��ҳ��
			//����SQL���
			String originalSql = (String) meta.getValue("delegate.boundSql.sql");//�õ�ԭ����Ҫִ�е�SQL���
			
			int offset = rowBounds.getOffset();//ԭ��RowBoundss�����Offset
			int limit = rowBounds.getLimit();//ԭ��RowBoundss�����rows
			meta.setValue("delegate.boundSql.sql",originalSql+" limit "+offset+","+limit+"");//�������÷�ҳ��SQL���
			meta.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);//����ԭ�еķ�ҳ�Ĳ���Ϊ��ʼ��
			meta.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);//����ԭ�еķ�ҳ�Ĳ���Ϊ��ʼ��
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
