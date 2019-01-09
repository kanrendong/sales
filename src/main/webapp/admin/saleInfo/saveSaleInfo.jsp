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
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

</head>
<body>
<!-- 录入信息的日期即为该咨询量产生的日期
表单信息：咨询日期、姓名、性别、年龄、学历、联系方式、渠道、TMK、咨询师
类别：定义的类别是那种，现在需要确定好 A B C D是否可以！OK
 -->


<div style="margin-left:60px;margin-top:20px;width:700px;height:600px">

<div class="alert alert-warning alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>导入成功!</strong> 
</div>

<div style="margin-left:15px;">
<form  action="uploadFile" method="post"  enctype="multipart/form-data">
<div class="row">
  <div class="input-group">
    <div class="input-group">
      <input type="file" name="file" class="form-control" placeholder="Search for...">
      <span class="input-group-btn">
        <button class="btn btn-default" type="submit">导入Excel文件</button>
      </span>
    </div>
  </div>
</div>
</form></div>


<p><p><p>
<hr>
	<form action="saveInfomation" method="post">
		<div class="input-group input-group-lg">
		  <span class="input-group-addon" id="sizing-addon1">咨询日期</span>
		  <input type="text" class="form-control" name="infodate" placeholder="2018/12/12" aria-describedby="sizing-addon1">
		</div><p>
		
		<div class="input-group input-group-lg">
	  	<span class="input-group-addon" id="sizing-addon1">姓名</span>
	  	<input type="text" class="form-control" name="infoname"  aria-describedby="sizing-addon1"><p>
	  	</div>
	
		<div class="radio">
		 <button type="button" class="btn btn-large">性别</button>
		
		<label>
		<input type="radio" name="sex" value="1" checked>男
		</label>
		<label>
		<input type="radio" name="sex"  value="0">女
		</label></div>
	
			<div class="input-group input-group-lg">
			  <span class="input-group-addon" id="sizing-addon1">年龄</span>
			  <input type="text" class="form-control" name="age"  aria-describedby="sizing-addon1">
			</div>
		
		<div class="radio">	
		<button type="button" class="btn btn-large">学历</button>
		<label>
		<input type="radio" name="degreeid" value="1" checked>其他
		</label>
		<label>
		<input type="radio" name="degreeid"  value="2">初中
		</label>
		<label>
		<input type="radio" name="degreeid"  value="3">高中
		</label>
		<label>
		<input type="radio" name="degreeid"  value="4">中专
		</label>
		<label>
		<input type="radio" name="degreeid"  value="5">大专
		</label>
		<label>
		<input type="radio" name="degreeid"  value="6">本科
		</label>
		<label>
		<input type="radio" name="degreeid"  value="7">硕士
		</label></div>
	
		<div class="input-group input-group-lg">
		  <span class="input-group-addon" id="sizing-addon1">联系方式</span>
		  <input type="text" class="form-control" name="tel"  aria-describedby="sizing-addon1">
		</div><p>
		
		<div class="radio">	
		<button type="button" class="btn btn-large">渠道</button>
		<label>
		<input type="radio" name="comefromid" value="1" checked>其他
		</label>
		<label>
		<input type="radio" name="comefromid"  value="2">赶集
		</label></div>
		
		<div class="input-group input-group-lg">
		<span class="input-group-addon" id="sizing-addon1">TMK</span>
		<input type="text" class="form-control" name="beforetmk"  aria-describedby="sizing-addon1"><p>
		</div><p>
	
		<div class="input-group input-group-lg">
		  <span class="input-group-addon" id="sizing-addon1">咨询师</span>
		  <input type="text" class="form-control" name="uid"  aria-describedby="sizing-addon1">
		</div><p>
		<p>
		<button type="submit" class="btn btn-large">录入信息</button>
	</form>
</div>
</body>
</html>