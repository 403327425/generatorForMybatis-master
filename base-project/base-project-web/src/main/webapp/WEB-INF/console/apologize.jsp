<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${message}</title>
<%@ include file="/WEB-INF/console/common/includ.jsp" %>
</head>
<body>
	
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