package com.woniuxy.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.woniuxy.domain.SalesTree;
import com.woniuxy.domain.SalesUserinfo;

public class CheckFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		SalesUserinfo info = (SalesUserinfo)request.getSession().getAttribute("info");
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

		if(info==null)
		{
			response.sendRedirect(basePath+"index.jsp");
		}else{//证明用户已经登录过了
			//1:取得当前登录用户所有的权限
			List<SalesTree> trees = (List)request.getSession().getAttribute("trees");
			
			//2:取出当前用户访问的路径信息
			String requestpath = request.getServletPath();
			requestpath = requestpath.replaceFirst("/admin/", "");//  userinfo/findAll
			
			System.out.println("requestpath  "+ requestpath);
			
			if(requestpath.indexOf("/")!=-1){
				for (SalesTree tree : trees) {
					if(tree.getTreeurl()!=null){
						String targetPath = tree.getTreeurl().substring(0,tree.getTreeurl().indexOf("/"));// userinfo
						System.out.println("targetPath "+ targetPath);
						if(requestpath.indexOf(targetPath)!=-1){
							arg2.doFilter(arg0, arg1);
							return;
						}
					}
				}
				//如果程序运行到此处，证明，你没有这个权限
				response.sendRedirect(basePath+"index.jsp");
			}else{
				arg2.doFilter(arg0, arg1);
			}
			
			
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
