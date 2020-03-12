<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>角色管理</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
</head>
<body>
	<div class="layui-form" lay-filter="layuiadmin-form-role"
		id="layuiadmin-form-role" style="padding: 20px 30px 0 0;">
		<c:if test="${role!=null }">
			<input name="roleId" autocomplete="off" class="layui-input" type="hidden" value="${role.roleId}">
		</c:if>
		
		<div class="layui-form-item">
			<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;角色名称</label>
			<div class="layui-input-inline">
				<input type="text" name="roleName" lay-verify="required"
					value="${role.roleName}" placeholder="角色名称" autocomplete="off"
					class="layui-input">
			</div>
		</div>
		<c:choose>
			<c:when test="${role==null }">
				<div class="layui-form-item">
					<label class="layui-form-label"><span class="layui-badge-dot"></span>&nbsp;权限范围</label>
					<div class="layui-input-block">
						<c:forEach var="menu" items="${menus}">
							<fieldset>
								<legend>
									<input type="checkbox" name="menuList"
										value="${menu.menuId }" lay-skin="primary" lay-filter="checkedListener"
										title="${menu.title }">
								</legend>
								<c:forEach var="childrenMenu" items="${menu.children}">
									<input type="checkbox" name="menuList" lay-filter="checkedListener"
										value="${childrenMenu.menuId }" lay-skin="primary"
										title="${childrenMenu.title }">
										<c:forEach var="threeMenu" items="${childrenMenu.children}">
										<input type="checkbox" name="menuList" lay-filter="checkedListener"
										value="${threeMenu.menuId }" lay-skin="primary"
										title="${threeMenu.title }">
										</c:forEach>
								</c:forEach>
							</fieldset>
						</c:forEach>
					</div>
				</div>
			</c:when>
			<c:otherwise>
				<div class="layui-form-item">
					<label class="layui-form-label">权限范围</label>
					<div class="layui-input-block">
						<c:forEach var="menu" items="${menus}">
							<fieldset>
								<legend>
									<input type="checkbox" name="menuList" lay-filter="checkedListener"
										value="${menu.menuId }" lay-skin="primary"
										<c:forEach var="roleMenu" items="${role.menuList}">
							<c:if test='${menu.menuId==roleMenu.menuId }'>checked="checked"</c:if>
						</c:forEach>
										title="${menu.title }">
								</legend>
								<c:forEach var="childrenMenu" items="${menu.children}">
									<input type="checkbox" name="menuList" lay-filter="checkedListener"
										value="${childrenMenu.menuId }" lay-skin="primary"
										title="${childrenMenu.title }"
										<c:forEach var="roleMenu" items="${role.menuList}">
							<c:if test='${childrenMenu.menuId==roleMenu.menuId }'>checked="checked"
							</c:if>
						</c:forEach>>
						
						<c:forEach var="threeMenu" items="${childrenMenu.children}">
										<input type="checkbox" name="menuList" lay-filter="checkedListener"
										value="${threeMenu.menuId }" lay-skin="primary"
										title="${threeMenu.title }" <c:forEach var="roleMenu" items="${role.menuList}">
							<c:if test='${threeMenu.menuId==roleMenu.menuId }'>checked="checked"
							</c:if>
						</c:forEach>>
										</c:forEach>
										
								</c:forEach>
							</fieldset>
						</c:forEach>
					</div>
				</div>
			</c:otherwise>
		</c:choose>
		<div class="layui-form-item">
			<label class="layui-form-label">具体描述</label>
			<div class="layui-input-block">
				<textarea type="text" name="roleRemark" lay-verify="roleRemark"
					autocomplete="off" class="layui-textarea">${role.roleRemark }</textarea>
			</div>
		</div>
		<div class="layui-form-item layui-hide">
			<button class="layui-btn" lay-submit
				lay-filter="LAY-user-role-submit" id="LAY-user-role-submit">提交</button>
		</div>
	</div>
	<script>
		layui.config({
			base : '${root}/layuiadmin/' //静态资源所在路径
		}).extend({
			index : 'lib/index' //主入口模块
		}).use([ 'index', 'form','element' ], function() {
			var $ = layui.$, form = layui.form,element = layui.element;
			form.on('checkbox(checkedListener)', function(data){
				let topInput=$(this).parent().find('legend>input')[0];
				if(topInput){
					let array=$(this).parent().find('>input');
					if(data.elem.checked){
						if(!topInput.checked){
							$(topInput).prop("checked", true);
						}
					}else{
						let hasCheck=false;
						$.each(array,function(i,item){
							if(item.checked){
								hasCheck=true;
								return false;
							}
						});
						if(!hasCheck){
							$(topInput).prop("checked", false);
						}
					}
				}else{
					let array=$(this).parent().parent().find('>input');
					if(!data.elem.checked){
						$.each(array,function(i,item){
							$(item).prop("checked", false);
						});
					}else{
						$.each(array,function(i,item){
							$(item).prop("checked", true);
						});
					}
				}
				form.render();
			});
		});
	</script>
</body>
</html>