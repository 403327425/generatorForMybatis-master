<%@ page contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<title>${titleName }</title>
	<%@ include file="/WEB-INF/console/common/includ.jsp" %>
</head>
<body>
	<div class="layui-form" lay-filter="layuiadmin-form-useradmin" id="layuiadmin-form-useradmin" style="padding: 20px 0 0 0;">
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;部门名称</label>
			<div class="layui-input-block">
				<input type="text" name="departmentName" lay-verify="departmentName" placeholder="请输入部门名称" autocomplete="off" class="layui-input" >
		  	</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;部门地址</label>
			<div class="layui-input-block">
				<input type="text" name="departmentAddress" lay-verify="departmentAddress" placeholder="请输入部门地址" autocomplete="off" class="layui-input" >
		  	</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;部门联系电话</label>
			<div class="layui-input-block">
				<input type="text" name="departmentPhone" lay-verify="departmentPhone" placeholder="请输入部门联系电话" autocomplete="off" class="layui-input" >
		  	</div>
		</div>
		<div class="layui-form-item">
      		<label class="layui-form-label">上级部门</label>
			<div class="layui-input-inline">
        		<select name="departmentParentId" lay-search="">
          			<option value="" id="">--选择上级部门--</option>
          			<c:forEach var="department" items="${departmentList }">
          				<option value="${department.departmentId }" >${department.departmentName }</option>
          			</c:forEach>
        		</select>
      		</div>
    	</div>
    
    	<div class="layui-form-item layui-hide">
      		<input type="button" lay-submit lay-filter="LAY-product-front-submit" id="LAY-product-front-submit" value="确认">
    	</div>
  	</div>

	<script>
		layui.config({
			base: '${root}/layuiadmin/' //静态资源所在路径
		}).extend({
		  	index: 'lib/index' //主入口模块
		}).use(['index', 'form', 'upload','laydate'], function(){
			var $ = layui.$,
			form = layui.form,
			upload = layui.upload,
			laydate = layui.laydate;
			
			//自定义验证
			form.verify({
				departmentName:function(value){
					if(value == null || value == ""){
					 	return '请填写部门名称';
					}
	  			},
	  			departmentAddress:function(value){
					if(value == null || value == ""){
					 	return '请填写部门地址';
					}
	  			},
	  			departmentPhone:function(value){
					if(value == null || value == ""){
					 	return '请填写部门联系电话';
					}
	  			},
	 		});
		});
	</script>
</body>
</html>