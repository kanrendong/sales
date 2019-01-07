<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="<%=basePath%>css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.excheck-3.5.js"></script>
<SCRIPT type="text/javascript">
		
		var setting = {
			check: {
				enable: true
			},
			data: {
				simpleData: {
					enable: true
				}
			}
		};

		var zNodes =${json};
		
		var code;
		
		function setCheck() {
			var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
			py = $("#py").attr("checked")? "p":"",
			sy = $("#sy").attr("checked")? "s":"",
			pn = $("#pn").attr("checked")? "p":"",
			sn = $("#sn").attr("checked")? "s":"";
			//type = { "Y":py + sy, "N":pn + sn};
			setting.check.chkboxType = { "Y" : "ps", "N" : "ps" };
			//zTree.setting.check.chkboxType = type;
			//showCode('setting.check.chkboxType = { "Y" : "' + type.Y + '", "N" : "' + type.N + '" };');
		}
		function showCode(str) {
			if (!code) code = $("#code");
			code.empty();
			code.append("<li>"+str+"</li>");
		}
		
		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			setCheck();
			$("#py").bind("change", setCheck);
			$("#sy").bind("change", setCheck);
			$("#pn").bind("change", setCheck);
			$("#sn").bind("change", setCheck);
			
			selectBack();
		});
		
		
		function show(){
			 var treeObj=$.fn.zTree.getZTreeObj("treeDemo");
	         var nodes=treeObj.getCheckedNodes(true);
	         var ids= "";
	         for(var i=0;i<nodes.length;i++){
	        	 ids += nodes[i].id;
	        	 if(i<nodes.length-1) ids+=","
	         }
			$("#ids").val(ids);
			document.forms[0].submit();
		}
		
		function selectBack(){
			zTree = $.fn.zTree.getZTreeObj("treeDemo");//treeDemo界面中加载ztree的div
			<c:forEach items="${role.trees }" var="tree">
				node = zTree.getNodeByParam("id",${tree.id});
				zTree.checkNode(node,true,false);//将指定ID的节点选中
				zTree.expandNode(node, true, false);//将指定ID节点展开
			</c:forEach>
			
		}
	</SCRIPT>
  
<FORM METHOD=POST ACTION="${role==null?'save':'update'}">


<input type="hidden" name="rid" value="${role.rid }">
rolename	<INPUT TYPE="text" NAME="rolename" value="${role.rolename}"><br>

请选择当前角色具有的权限：
<div class="content_wrap">
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
	</div>
</div>
<input type="hidden" name="ids" id="ids">

<input type="button" onclick="show()" value="${role==null?'save':'update'}">
</FORM>




