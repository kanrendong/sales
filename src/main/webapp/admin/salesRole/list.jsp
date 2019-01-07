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
	<TD>rid</TD>
	<TD>rolename</TD>
	<TD>operate</TD>
</TR>
<c:forEach items="${list}" var="role">
<TR>
	<TD>${role.rid}</TD>
	<TD>${role.rolename}</TD>
	<TD><a href="findById?rid=${role.rid }">update</a></TD>
</TR>
</c:forEach>
</TABLE>
<a href="goInput">ADD</a>
</body>
</html>