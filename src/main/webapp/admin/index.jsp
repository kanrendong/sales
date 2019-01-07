<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<HTML>
<HEAD>
	<TITLE> ZTREE DEMO - Custom Icon </TITLE>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="<%=basePath%>css/demo.css" type="text/css">
	<style>
	body {
	background-color: white;
	margin:0; padding:0;
	text-align: center;
	}
	div, p, table, th, td {
		list-style:none;
		margin:0; padding:0;
		color:#333; font-size:12px;
		font-family:dotum, Verdana, Arial, Helvetica, AppleGothic, sans-serif;
	}
	#testIframe {margin-left: 10px;}
  </style>
	<link rel="stylesheet" href="<%=basePath%>css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/jquery.ztree.core-3.5.js"></script>
	<SCRIPT type="text/javascript">
		var treejson;
		$(function(){
			$.getJSON("getTree",{},function(json){
				treejson = json;
				showTree();
			});
		});
		
		function showTree(){
			var setting = {
					data: {
						simpleData: {
							enable: true,
							idKey: "treeid",
		                    pIdKey: "pid"
						},
						key: {
		                        name: "treename",
		                        title: "treeurl"
		                    }
					},
					callback: {
						beforeClick: function(treeId, treeNode) {
							var zTree = $.fn.zTree.getZTreeObj("tree");
							if (treeNode.isParent) {
								zTree.expandNode(treeNode);
								return false;
							} else {
								demoIframe = $("#testIframe");
								demoIframe.attr("src",treeNode.treeurl);
								return true;
							}
						}
					}
				};
				

				var zNodes = treejson;
				
				var t = $("#tree");
				t = $.fn.zTree.init(t, setting, zNodes);
				demoIframe = $("#testIframe");
				demoIframe.bind("load", loadReady);
				
				$.fn.zTree.init($("#treeDemo"), setting, zNodes);
		}
		function loadReady() {
			var bodyH = demoIframe.contents().find("body").get(0).scrollHeight,
			htmlH = demoIframe.contents().find("html").get(0).scrollHeight,
			maxH = Math.max(bodyH, htmlH), minH = Math.min(bodyH, htmlH),
			h = demoIframe.height() >= maxH ? minH:maxH ;
			if (h < 530) h = 530;
			demoIframe.height(h);
		}
		
	</SCRIPT>
</HEAD>

<BODY>
<!-- 
	<TABLE border=0 width=100% height=100% align=left  >
		<TR>
			<TD width=20% align=left valign=top style="height:100%; BORDER-RIGHT: #999999 1px dashed;wi">
				<ul id="treeDemo" class="ztree" style="width:260px;height:100%; overflow:auto;"></ul>
			</TD>
			<TD width=50% align=left valign=top>
				<IFRAME ID="testIframe" Name="testIframe" FRAMEBORDER=0 SCROLLING=AUTO width=100%  height=100% SRC="welcome.jsp"></IFRAME>
			</TD>
		</TR>
	</TABLE>
 -->
 <div>
 	<div style="height:150px;width:100%;border:0px solid red;background:#000;" ></div>
 	<div style="width:15%;float:left;">
 		<ul id="treeDemo" class="ztree" style="width:260px;height:100%; overflow:auto;"></ul>
 	</div>
 	<div style="width:85%;float:left;">
 		<IFRAME ID="testIframe" Name="testIframe" FRAMEBORDER=0 SCROLLING=AUTO width=100%  height=100% SRC="welcome.jsp"></IFRAME>
 	</div>
 </div>
</BODY>
</HTML>