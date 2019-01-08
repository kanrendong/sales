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
		    url:'<%=basePath%>admin/visit/findAll',   
		    fitColumns:true,
		    title:'用户管理',
		    pagination:true,
		    toolbar: '#tb',
		    columns:[[   
		        {field:'visitid',title:'编号',width:100},   
		        {field:'visitcontext',title:'信息 ',width:100},   
		        {field:'visittime',title:'咨询时间 ',width:100},   
		        {field:'result',title:'结果',align:'center',width:100,formatter:function(value, row, index){
				    if(row.result){
				        return  row.result.resultname;
				      }
				    },
				},
				{field:'userInfo',title:'咨询师',width:100,align:'center',formatter:function(value, row, index){
				    if(row.userInfo){//对象不null
				        return  row.userInfo.truename;
				      }
				    },
				},
				{field:'info',title:'咨询人 ',width:100,align:'center',formatter:function(value, row, index){
				    if(row.info){
				        return  row.info.infoname;
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
	
	function deleteItem(visitid){
		$.messager.confirm('Confirm','你确定要删除这条记录吗?',function(r){
		    if (r){   
		       $.getJSON("<%=basePath%>admin/visit/delete",{visitid:visitid},function(json){
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
	function showsave(){
		$('#ff').form('clear');	// 从URL加载 


		$('#win').window('open');  // open a window   

	}
	
	function dosave(){
		$('#ff').form('submit', {   
		    url:'<%=basePath%>admin/visit/save',   
		    onSubmit: function(){   
		        // do some check   
		        // return false to prevent submit;   
		    },   
		    success:function(data){   
		         var json = eval("("+data+")");
		         $('#dg').datagrid('reload');    // reload the current page data  
		    	   $.messager.show({
		    			title:'My Title',
		    			msg:json.msg,
		    			timeout:5000,
		    			showType:'slide'
		    		});
		    	   $('#win').window('close');  // close a window  

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
<a href="javascript:showsave()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">增加</a>
</div>
<div id="win" class="easyui-window" title="My Window" style="width:600px;height:400px"  
        data-options="iconCls:'icon-save',modal:true,closed:true">  
    <form id="ff" method="post">  
    <div>  
        <label for="name">Name:</label>  
        <input class="easyui-validatebox" type="text" name="uname" data-options="required:true" />  
    </div>  
    <div>  
        <label for="email">Email:</label>  
        <input class="easyui-validatebox" type="text" name="upass" data-options="validType:'email'" />  
    </div>  
    <div>  
        <a id="btn" href="javascript:dosave()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">维护</a>  
        
    </div>     
</form>  
   
</div> 

</body>


</html>