<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	$(function(){
		<c:forEach items="${userinfo.salesRole}" var="r">
		$("input[name=roleids][value=${r.roleid}]").attr("checked","checked");
		</c:forEach>
	});

</script>
  
<FORM METHOD=POST ACTION="<%=basePath%>admin/salesUserinfo/${userinfo==null?'save':'update'}">
<input type="hidden" name="uid" value="${userinfo.uid }">
uname	<INPUT TYPE="text" NAME="uname" value="${userinfo.uname }"><br>
truename	<INPUT TYPE="text" NAME="truename"><br>
upass	<INPUT TYPE="text" NAME="upass"><br>
请选择您要使用的角色：<br>
<c:forEach items="${salesRole}" var="role">
<INPUT TYPE="checkbox" NAME="roleids" value="${role.roleid }">${role.rolename }
</c:forEach>
<br>
<input type="submit" value="${userinfo==null?'save':'update'}">
</FORM>

