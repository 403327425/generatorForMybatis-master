<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>${goodsName}</title>
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
				<input type="text" id="goodsId"  name="goodsId" value="${param.goodsId}" autocomplete="off" class="layui-input" placeholder="" style="display:none">
			</div>
		</div>
	
		
	
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;物品名称</label>
			<div class="layui-input-inline">
				<input type="text" id="goodsName" lay-verify="required" name="goodsName" value="${param.goodsName}" autocomplete="off" class="layui-input" placeholder="物品名称">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;物品单位</label>
			<div class="layui-input-inline">
				<input type="text" id="goodsUnit" lay-verify="required" name="goodsUnit" value="${param.goodsUnit}" autocomplete="off" class="layui-input" placeholder="物品单位">
			</div>
		</div>
		
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;物品数量</label>
			<div class="layui-input-inline">
				<input type="text" id="goodsNum" lay-verify="required" name="goodsNum" value="${param.goodsNum}" autocomplete="off" class="layui-input" placeholder="物品数量">
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