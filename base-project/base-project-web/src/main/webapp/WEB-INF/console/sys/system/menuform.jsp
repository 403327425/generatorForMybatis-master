<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加菜单</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
</head>
<body>
	<div class="layui-form" lay-filter="layuiadmin-form-menu"
		id="layuiadmin-form-menu" style="padding: 20px 30px 0 0;">
		<!-- 
		1,新建顶级菜单父节点为0
		2，新建菜单有父节点
		3，修改菜单
		 -->
		<c:choose>
			<c:when test="${menu != null}"><input type="hidden" name="menuId" value="${menu.menuId}" /></c:when>
			<c:when test="${parentMenu != null}"><input type="hidden" name="parentId" value="${parentMenu.menuId}"></c:when>
			<c:when test="${parentMenu == null && menu == null}"><input type="hidden" name="parentId" value="0"></c:when>
		</c:choose>
		<div class="layui-form-item">
			<label class="layui-form-label">菜单名称:</label>
			<div class="layui-input-block">
				<input type="text" lay-verify="required" class="layui-input" id="title" name="title" value="${menu.title}" placeholder="菜单名称" />
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">链接地址:</label>
			<div class="layui-input-block">
				<input type="text" class="layui-input" id="href" name="href" value="${menu.href}" placeholder="链接地址" />
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">ico类名:</label>
			<div class="layui-input-block">
				<input type="text" class="layui-input" id="icon" name="icon" value="${menu.icon}" placeholder="ico类名" />
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">权限标识:</label>
			<div class="layui-input-block">
				<input type="text" class="layui-input" id="perms" name="perms" value="${menu.perms}" placeholder="权限标识">
			</div>
		</div>
		<c:if test="${parentMenu!=null }">
		<div class="layui-form-item">
			<label class="layui-form-label">父级菜单:</label>
			<div class="layui-input-block">
				<input type="text" class="layui-input" readonly="readonly" value="${parentMenu.title}">
			</div>
		</div>
		</c:if>
		<div class="layui-form-item layui-hide">
			<button class="layui-btn" lay-submit
				lay-filter="LAY-user-menu-submit" id="LAY-user-menu-submit">提交</button>
		</div>
	</div>
	<script>
		layui.config({
			base : '${root}/layuiadmin/' //静态资源所在路径
		}).extend({
			index : 'lib/index' //主入口模块
		}).use([ 'index', 'form' ], function() {
			var $ = layui.$, form = layui.form;
		})
	</script>
</body>
</html>