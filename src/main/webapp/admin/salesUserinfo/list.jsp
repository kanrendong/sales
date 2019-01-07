<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<TABLE border="1" width="100%">
<TR>
	<TD>uid</TD>
	<TD>uname</TD>
	<TD>role</TD>
	<TD>operate</TD>
</TR>
<c:forEach items="${list}" var="userinfo">
<TR>
	<TD>${userinfo.uid}</TD>
	<TD>${userinfo.uname}</TD>
	<TD>${userinfo.roles}</TD>
	<TD><a href="findById?uid=${userinfo.uid }">update</a></TD>
</TR>
</c:forEach>
</TABLE>
<a href="goInput">ADD</a>
</body>
</html>