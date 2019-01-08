<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/themes/icon.css">
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
<div style="margin-left:200px">
	<form id="ff" method="post">  
    <div>  
        <label for="name">Name:</label>  
        <input class="easyui-validatebox" type="text" name="name" data-options="required:true" />  
    </div>  
    <div>  
        <label for="email">Email:</label>  
        <input class="easyui-validatebox" type="text" name="email" data-options="validType:'email'" />  
    </div>  
    ...   
</form> 






</div>
</body>
</html>