<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
<!DOCTYPE html >
<html>
<head>
	<meta charset="utf-8">
	<title>管理员列表</title>
	<meta name="renderer" content="webkit">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  	<script type="text/javascript" src="${root }/js/md5.js"></script>
</head>
<body class="layui-content-wrapper bodyPadding">
	
	<div class="search-wrap layui-form" >
	    <shiro:hasPermission name="sys:admin:save">
			<div class="layui-inline">
				<a class="layui-btn layui-btn-normal adminAdd_btn"><i
					class="layui-icon">&#xe608;</i>添加管理员</a>
			</div>
		</shiro:hasPermission>
		<!-- 数据表格 -->
		<table id="adminList" lay-filter="adminList" class="layui-hide"></table>
	</div>
	
	<script type="text/html" id="barEdit">
	<shiro:hasPermission name="sys:admin:update">
  		<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
	</shiro:hasPermission>
	<shiro:hasPermission name="sys:admin:delete">
  		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</shiro:hasPermission>
	</script>
	<script type="text/html" id="addressTpl">
 		 {{#  if(!d.address){ }}
   		 <span>无</span>
  		{{#  } else{ }}
   		 <span>{{d.address}}</span>
		{{#  } }}
	</script>
	<script type="text/html" id="roleTpl">
 		 {{#  if(d.role==null){ }}
   		 <span style="color: #FF0000;">未分配角色</span>
  		{{#  } else{ }}
   		 <span>{{d.role.roleName}}</span>
		{{#  } }}
	</script>
	<script type="text/html" id="departmentTpl">
 		 {{#  if(d.department==null){ }}
   		 <span style="color: #FF0000;">未分配部门</span>
  		{{#  } else{ }}
   		 <span>{{d.department.departmentName}}</span>
		{{#  } }}
	</script>
	<script type="text/html" id="sexTpl">
 		 {{#  if(d.sex == 0){ }}
   		 <span style="color: #FF00FF;">女</span>
  		{{#  } else if(d.sex == 1){ }}
   		 	<span style="color: #0000FF;">男</span>
		{{#  } else{ }}
   		 	<span style="color: #800080;">保密</span>
  		{{#  } }}
	</script>
	<script type="text/html" id="statusTpl">
		{{#
 		 if(d.adminStatus=='0'){ }}
   		 <input type="checkbox" data-id="{{d.adminId}}" name="materialStatus" lay-filter="is_navigate" value="0" lay-skin="switch" lay-text="启用|禁用">
  		{{#  } else{ }}
   		 	<input type="checkbox" data-id="{{d.adminId}}" name="materialStatus" lay-filter="is_navigate" value="1" lay-skin="switch" lay-text="启用|禁用" checked>
		{{#  } }}
	</script>
	<script>
	var fromData={};
	  layui.config({
	    base: '${root }/layuiadmin/' //静态资源所在路径
	  }).extend({
	    index: 'lib/index' //主入口模块
	  }).use(['index','useradmin', 'set','form','layer','jquery','laypage','table','laytpl'],function(){
			var form = layui.form,table = layui.table,
			layer = layui.layer,
			laypage = layui.laypage,admin = layui.admin,
			$ = layui.jquery;
			//数据表格
			table.render({
				id:'adminList',
			    elem: '#adminList'
			    ,url: '${root}/sys/adminList' //数据接口
			    ,limit:20//每页默认数
				,height : 'full-68'
			    ,cols: [[ //表头
	              {field:'adminLoginName', title: '登陆名',minWidth:100}
	              ,{field:'adminNickName', title: '昵称',minWidth:100}
	              ,{field:'roleName', title: '角色',minWidth:100,templet:'#roleTpl'}
	              ,{field:'departmentName', title: '部门',minWidth:100,templet:'#departmentTpl'}
	              ,{field:'adminStatus', minWidth :'100',title: '状态',templet:'#statusTpl'}
	              ,{title: '操作',toolbar: '#barEdit',fixed:'right',width:120}
			    ]]
					,page: true //开启分页
					,where: {timestamp: (new Date()).valueOf()}
			  });
			// 监听 layui switch绑定事件
		    form.on('switch(is_navigate)', function(data){
		        dataAction({adminId:$(this).attr('data-id'),adminStatus:data.elem.checked});
		     });
			//监听工具条
			  table.on('tool(adminList)', function(obj){
			    var data = obj.data;
			    if(obj.event === 'del'){
			      layer.confirm('确定删除吗？', function(index){
			    	  $.ajax({
			    		  url:'${root}/sys/delAdmin?adminId='+data.adminId,
			    		  type : "get",
			    		  success : function(res){
			    			  if(res.result_code && res.return_code){
			    				  obj.del();
			    				  toast('操作成功');
			    				  table.reload('adminList', {});
			    			  }else{
			    				  layer.msg("权限不足，联系超管！",{icon: 5});
			    			  }
			    		  }
			    	  });
			        layer.close(index);
			      });
			    } else if(obj.event === 'edit'){
			    	layer.open({
						type: 2,
						title : "修改管理员",
						content: "${root }/sys/editAdminView?adminId="+data.adminId,
						maxmin: false,
						area: admin.screen() < 2 ? ['100%', '100%'] : ['100%', '100%'],
						btn: ['提交', '关闭'],
						btnAlign: 'c',
						yes: function(index, layero){
							var body = layer.getChildFrame('body', index);//找页面下所有套的子类
							var inputForm = body.find('#layuiadmin-form-admin');//这是你弹出层 表单对象
							if(checkedEdit(inputForm[0])){
								$.ajax({
									url : '${root}/sys/editAdmin',
									data : fromData,
									type : 'POST',
									dataType : 'json',
									success : function(res) {
										if (res.result_code && res.return_code) {
											toast('操作成功');
											table.reload('adminList', {});
										} else {
											toastErr('修改失败');
										}
									},complete:function(){
										layer.close(index);
									}
								});
							}
						}
					});
			    }
			  });
			  

		//添加管理员
		$(".adminAdd_btn").click(function(){
			layer.open({
				type: 2,
		        title: '新增管理员',
		        content: '${root}/sys/addAdminView',
		        maxmin: false,
		        area: admin.screen() < 2 ? ['100%', '100%'] : ['100%', '100%'],
		        btn: ['提交', '关闭'],
		        btnAlign: 'c',
		        yes: function(index, layero){
		        	var body = layer.getChildFrame('body', index);//找页面下所有套的子类
		            var inputForm = body.find('#layuiadmin-form-admin');//这是你弹出层 表单对象
		            if(checkedAdd(inputForm[0])){
		            	$.ajax({
							url : '${root}/sys/editAdmin',
							data : fromData,
							type : 'POST',
							dataType : 'json',
							success : function(res) {
								console.log(typeof res);
								if (res.result_code && res.return_code) {
									toast('添加成功');
									table.reload('adminList', {});
									layer.close(index);
								} else {
									toastErr('添加失败');
								}
							}
						});
		            }
		            //以下代码layer = layui.layer 有效的,可以视为另一种实现
		        	/* var iframeWindow = window['layui-layer-iframe'+ index]
		            ,submitID = 'LAY-user-front-submit'
		            ,submit = layero.find('iframe').contents().find('#'+ submitID);

		            //监听提交
		            iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
		              var field = data.field;
		              console.log(field);
		              //$.ajax({});
		              layer.close(index);
		            });
		            submit.trigger('click'); */
		        }
			});
		});
		
	});
	  /*   提交数据 */
	  function dataAction(data){
		  $.ajax({
	    	  url: '${root}/sys/editAdmin'
			      ,data:data
			      ,type:'POST'
			      ,dataType:'json'
			      ,success: function(res){
			    	  if (res.result_code && res.return_code) {
			    		  toast('操作成功');
			    	  } else {
			    		  toastErr('操作失败');
			    	  }
			      }
	      });
	  }
	//校验添加管理员数据
	function checkedAdd(div) {
		fromData={};
		let adminLoginName = $(div).find("input[name='adminLoginName']").val();
		let adminNickName = $(div).find("input[name='adminNickName']").val();
		let roleId = $(div).find("input[name='role']:checked").val();
		let departmentId = $(div).find("select[name='departmentId']").val();
		if(departmentId!='0'){
			fromData.departmentId = departmentId;
		}
		if ($.trim(adminLoginName) == '') {
			parent.layer.msg('登录名不能空');
			return false;
		}
		if ($.trim(adminNickName) == '') {
			parent.layer.msg('昵称不能空');
			return false;
		}
		if (!roleId) {
			parent.layer.msg('请分配角色');
			return false;
		}
		fromData.adminLoginName = adminLoginName;
		fromData.adminNickName = adminNickName;
		fromData.adminLoginPassword = hex_md5('123456');
		fromData.roleId = roleId;
		return true;
	}
	
	//校验修改管理员数据
	function checkedEdit(div) {
		fromData={};
		let adminLoginName = $(div).find("input[name='adminLoginName']").val();
		let adminNickName = $(div).find("input[name='adminNickName']").val();
		let roleId = $(div).find("input[name='role']:checked").val();
		let departmentId = $(div).find("select[name='departmentId']").val();
		
		if ($.trim(adminLoginName) == '') {
			parent.layer.msg('登录名不能空');
			return false;
		}
		if (!roleId) {
			parent.layer.msg('请分配角色');
			return false;
		}
		if(departmentId=='0'){
			parent.layer.msg('请分配部门');
			return false;
		}
		if ($.trim(adminNickName) != '') {
			fromData.adminNickName = adminNickName;
		}
		fromData.adminId = $(div).find("input[name='adminId']").val();
		fromData.adminLoginName = adminLoginName;
		fromData.departmentId = departmentId;
		fromData.roleId = roleId;
		return true;
	}
</script>
</body>
</html>