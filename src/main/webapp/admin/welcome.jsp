<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome  ${info.uname}
	
	<c:if test="${info.uname == null}">
	<%String index = basePath+"index.jsp"; %>
	<%response.sendRedirect(index);%>
	</c:if>
	
</body>
</html>