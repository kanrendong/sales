<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		    url:'<%=basePath%>saleInfo/findAll',   
		    fitColumns:true,
		    title:'用户管理',
		    pagination:true,
		    toolbar: '#tb',
		    columns:[[   
		        {field:'infoid',title:'编号',checkbox:true,width:100},   
		        {field:'infoname',title:'姓名',width:100},   
			        {field:'sex',title:'性别',width:100,align:'center',formatter: function(value,row,index){
						if (value){
							return "男";
						} else {
							return "女";
						}
					}
				},   
		        {field:'age',title:'年龄',width:100,align:'center',styler: function(value,row,index){
						if (value < 20){
							return 'color:green';
						}else if(value<50)
							return 'color:black';
						else
							return "color:red";
					}
				},
				{field:'salesDegree',title:'学历',align:'center',width:100,formatter:function(value, row, index){
				    if(row.salesDegree){
				        return  row.salesDegree.degreename;
				      }
				    },
				},
				{field:'tel',title:'电话',width:100,align:'center'},
				{field:'salesComfrom',title:'渠道',width:100,align:'center',formatter:function(value, row, index){
				    if(row.salesComfrom){
				        return  row.salesComfrom.comefromname;
				      }
				    },
				},
				{field:'salesInfotype',title:'信息类型',width:100,align:'center',formatter:function(value, row, index){
				    if(row.salesInfotype){
				        return  row.salesInfotype.infotypename;
				      }
				    },
				},
				{field:'xxx',title:'操作',width:100,align:'center',formatter: function(value,row,index){
					var btns = "<a id=\"btn\" href=\"javascript:deleteItem("+row.infoid+")\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-remove'\">remove</a>";
					btns += "&nbsp;&nbsp;&nbsp;&nbsp;<a id=\"btn\" href=\"javascript:updateItem("+row.infoid+")\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-edit'\">update</a>";
					return btns;
				}} 
		    ]],
		    onLoadSuccess: function(index,field,value){
				$('.easyui-linkbutton').linkbutton({   
				});  
			}  
		}); 
	});
	
	function deleteItem(infoid){
		$.messager.confirm('Confirm','你确定要删除这条记录吗?',function(r){
		    if (r){   
		       $.getJSON("<%=basePath%>saleInfo/delete",{infoid:infoid},function(json){
		    	   $('#dg').datagrid('reload'); 
		    	   $.messager.show({
		    			title:'My Title',
		    			msg:json.msg,
		    			timeout:5000,
		    			showType:'slide'
		    		});
		       });
		    }   
		});  
	}

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
<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">增加</a>
<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">批量删除</a>
</div>


</body>
</html>