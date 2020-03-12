<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录失效</title>
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
</head>
<body>
<script type="text/javascript">
	layui.config({
		base : '${root}/layuiadmin/' //静态资源所在路径
	}).extend({
		index : 'lib/index' //主入口模块
	}).use([ 'index', 'form' ], function() {
		var $ = layui.$, form = layui.form,layer = parent.layer == 'undefined' ? layui.layer : parent.layer;
		toastErrorANDRedirect('登录失效,请重新登录','${root}/user/login');
	})
	
</script>
</body>
</html>