<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${titleName}</title>
<%@ include file="/WEB-INF/console/common/includ.jsp" %>
</head>
<body>
	<div>
		页面报错了呢，看下是不是哪里写错了呢，<a href="javascript:back();">点这里返回上一步</a>，<a href="javascript:backHome();">点这里返回主页</a>
	</div>
	<div>${message}</div>
<script type="text/javascript">
function backHome(){
	top.location.href='${root}/index.jsp';
}
function back(){
	window.history.go(-1);
}
</script>
</body>
</html>