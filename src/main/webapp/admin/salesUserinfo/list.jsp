<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=basePath%>js/themes/icon.css">
<script type="text/javascript" src="<%=basePath%>js/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function(){
		$('#dg').datagrid({   
		    url:'<%=basePath%>admin/salesUserinfo/find',   
		    fitColumns:true,
		    title:'用户管理',
		    pagination:true,
		    toolbar: '#tb',
		    columns:[[   
		        {field:'uid',title:'uid',checkbox:false,width:100},   
		        {field:'truename',title:'truename',width:100},   
		        
				{field:'xxx',title:'操作',width:100,align:'center',formatter: function(value,row,index){
					var btns = "<a id=\"btn\" href=\"javascript:deleteItem("+row.uid+")\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\">remove</a>";
					btns += "&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"btn\" href=\"<%=basePath%>admin/salesUserinfo/findById?uid="+row.uid+"\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">update</a>";
					return btns;
				}} 
		    ]],
		    onLoadSuccess: function(index,field,value){
				$('.easyui-linkbutton').linkbutton({   
				});  
			}  
		}); 
	});
	
	
	
</script>
<body>


<table id="dg"></table>
<script type="text/javascript">  
    function qq(value,name){   
        alert(value+":"+name)   
    }   
</script>  
  
<input id="ss" class="easyui-searchbox" style="width:300px"  
        data-options="searcher:qq,prompt:'Please Input Value',menu:'#mm'"></input>  
           
<div id="mm" style="width:120px">  
    <div data-options="name:'all',iconCls:'icon-ok'">All News</div>  
    <div data-options="name:'sports'">Sports News</div>  
</div> 

<div id="tb">
<a href="<%=basePath%>admin/salesUserinfo/goInput" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">增加</a>
</div>


</body>
</html>