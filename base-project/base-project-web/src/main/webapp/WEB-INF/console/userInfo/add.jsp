<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>${titleName}</title>
<%@ include file="/WEB-INF/console/common/includ.jsp" %>

<style type="text/css">
.layui-form-label{
	width:100px;
}	
.layui-input-block,.layui-input-inline{
	margin-left: 130px;
}
/*layui 日期只显示时分选择*/
.layui-laydate-content>.layui-laydate-list {
    padding-bottom: 0px;
    overflow: hidden;
}
.layui-laydate-content>.layui-laydate-list>li{
    width:50%
}
.merge-box .scrollbox .merge-list {
    padding-bottom: 5px;
}
</style>
</head>
<body>
<div class="padding_top">
<div id="testImg"></div>
	<form class="layui-form" id="aa" action="" method="POST">
		<div class="layui-form-item">
			<div class="layui-input-inline">
				<input type="text" id="userId"  name="userId" value="${param.userId}" autocomplete="off" class="layui-input" placeholder="" style="display:none">
			</div>
		</div>
	
		
	
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;用户名&nbsp;&nbsp;&nbsp;&nbsp;</label>
			<div class="layui-input-inline">
				<input type="text" id="userName" lay-verify="required" name="userName" value="${param.userName}" autocomplete="off" class="layui-input" placeholder="用户名">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;联系号码</label>
			<div class="layui-input-inline">
				<input type="text" id="phone" lay-verify="required" name="phone" value="${param.phone}" autocomplete="off" class="layui-input" placeholder="联系号码">
			</div>
		</div>
		
		
		<div class="layui-form-item layui-hide">
      <input type="button" lay-submit lay-filter="LAY-time-front-submit" id="LAY-time-front-submit" value="确认">
    </div>
	</form>
</div>
<script type="text/javascript">
	layui.config({
	    base: '${root}/layuiadmin/' //静态资源所在路径
	}).extend({
	    index: 'lib/index' //主入口模块
	}).use(['form', 'layedit', 'upload', 'laydate','index'], function(){
		  var form = layui.form
		  var $ = layui.$
		  ,layer = layui.layer
		  ,layedit = layui.layedit
		  ,upload = layui.upload
		  ,laydate = layui.laydate;
	});//layui结束


	
	
</script>
</body>
</html>