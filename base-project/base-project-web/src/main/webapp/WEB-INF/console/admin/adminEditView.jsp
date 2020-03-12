<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>修改员工 </title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <%@ include file="/WEB-INF/console/common/includ.jsp"%>
</head>
<body class="layui-layout-body">

  <div class="layui-form" lay-filter="layuiadmin-form-admin" id="layuiadmin-form-admin" style="padding: 20px 30px 0 0;">
  	<input type="hidden" name="adminId" value="${admin.adminId }">
    <div class="layui-form-item">
      <label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;登录名</label>
      <div class="layui-input-block">
        <input type="text" name="adminLoginName" readonly="readonly" value="${admin.adminLoginName }" lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;昵称</label>
      <div class="layui-input-block">
        <input type="text" name="adminNickName" value="${admin.adminNickName }" lay-verify="required" placeholder="请输入昵称" autocomplete="off" class="layui-input">
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;角色</label>
      <div class="layui-input-block">
      <c:forEach var="role" items="${roles}">
        <input type="radio" name="role" value="${role.roleId }" lay-skin="primary" title="${role.roleName }" <c:if test="${admin.role.roleId==role.roleId }">checked='checked'</c:if>>
      </c:forEach>
      </div>
    </div>
    <div class="layui-form-item">
      <label class="layui-form-label">选择部门</label>
      <div class="layui-input-block">
        <select name="departmentId" lay-verify="validateDepartment">
          <option value="0">--请选择--</option>
          <c:forEach var="department" items="${departments }">
          <option value="${department.departmentId }" <c:if test="${department.departmentId == admin.departmentId }">selected='selected'</c:if>>${department.departmentName }</option>
          </c:forEach>
        </select>
      </div>
    </div>
	<div class="layui-form-item layui-hide">
      <input type="button" lay-submit lay-filter="LAY-user-front-submit" id="LAY-user-front-submit" value="确认">
    </div>
  </div>
  <script>
  layui.config({
    base: '${root}/layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'form'], function(){
    var $ = layui.$,
    form = layui.form ;
    form.verify({
    	validateDepartment:function(value){
			  if(value==0){
				  return '请选择部门';
			  }
		  }
	  });
  })
  </script>
</body>
</html>