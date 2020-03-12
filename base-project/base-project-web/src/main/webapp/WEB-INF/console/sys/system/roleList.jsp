<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
<!DOCTYPE html >
<html>
<head>
	<meta charset="utf-8">
	<title>文章列表</title>
	<meta name="renderer" content="webkit">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
</head>
<body class="layui-content-wrapper bodyPadding">

	<div class="search-wrap layui-form" >
	    <shiro:hasPermission name="sys:role:save">
			<div class="layui-inline">
				<a class="layui-btn layui-btn-normal roleAdd_btn"><i
					class="layui-icon">&#xe608;</i>添加角色</a>
			</div>
		</shiro:hasPermission> 
		<!-- 数据表格 -->
		<table id="roleList" class="layui-hide" lay-filter="roleList" ></table>
	</div>
	
	<script type="text/html" id="barEdit">
  	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  	<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
	</script>
	<script type="text/html" id="descTpl">
 		 {{#  if(!d.roleRemark){ }}
   		 <span>无</span>
  		{{#  } else{ }}
   		 <span>{{d.roleRemark}}</span>
		{{#  } }}
	</script>
	<script>
	var fromData={};
	  layui.config({
	    base: '${root }/layuiadmin/' //静态资源所在路径
	  }).extend({
	    index: 'lib/index' //主入口模块
	  }).use(['index', 'set','form','layer','jquery','laypage','table'],function(){
			var form = layui.form,table = layui.table,
			layer = layui.layer,
			laypage = layui.laypage,admin = layui.admin,
			$ = layui.jquery;
			
			//数据表格
			table.render({
				id:'roleList',
			    elem: '#roleList'
			    ,url: '${root}/sys/getRoleList' //数据接口
			    ,cellMinWidth: 80
			    ,limit:20//每页默认数
				,height : 'full-68'
			    ,cols: [[ //表头
	              {field:'roleName', title: '角色名',width:100,minWidth:100}
	              ,{field:'roleRemark', title: '角色描述',minWidth:150,templet:'#descTpl'}
	              ,{title: '操作',toolbar: '#barEdit',fixed:'right',width:120}
			    ]]
					,page: true //开启分页
					,where: {timestamp: (new Date()).valueOf()}
			  });
			
			//监听工具条
			  table.on('tool(roleList)', function(obj){
			    var data = obj.data;
			    if(obj.event === 'del'){
			      layer.confirm('确定删除吗？', function(index){
			    	  $.ajax({
			    		  url:'${root }/sys/delRole?roleId='+data.roleId,
			    		  type : "get",
			    		  success : function(res){
			    			  if (res.result_code && res.return_code) {
			    				  obj.del();
			    				  toast('操作成功');
			    				  table.reload('roleList', {});
			    			  } else {
			    				  toast('修改失败');
			    			  }
			    		  }
			    	  });
			        layer.close(index);
			      });
			    } else if(obj.event === 'edit'){
			    	layer.open({
						title:"修改角色",
				          type: 2
				          ,content : "${root}/sys/editRoleView?roleId="+data.roleId
				          ,area: admin.screen() < 2 ? ['100%', '100%'] : ['100%', '100%']
				          ,btn: ['提交', '关闭']
				          ,btnAlign: 'c'
				          ,maxmin: false
				          ,yes: function(index, layero){
				        	  var body = layer.getChildFrame('body', index);//找页面下所有套的子类
					           var inputForm = body.find('#layuiadmin-form-role');//这是你弹出层 表单对象
					           if(checkedAdd(inputForm[0])){
					            	$.ajax({
										url : '${root}/sys/editRole',
										data : JSON.stringify(fromData),
										type : 'POST',
										contentType: 'application/json',
										dataType : 'json',
										success : function(res) {
											if (res.result_code && res.return_code) {
												toast('操作成功');
							    				table.reload('roleList', {});
											} else {
												toast('修改失败');
											}
										},error:function(){
											toast('系统异常');
										},complete:function(){
										 layer.close(index);
										}
									});
					            }
				          }
			        });
			    }
			  });
			  
		//添加角色
		$(".roleAdd_btn").click(function(){
			layer.open({
				title:"添加角色",
		          type: 2
		          ,content : "${root}/sys/editRoleView"
		          ,area: admin.screen() < 2 ? ['100%', '100%'] : ['100%', '100%']
		          ,btn: ['提交', '关闭']
		          ,btnAlign: 'c'
		          ,maxmin: false
		          ,yes: function(index, layero){
		        	  var body = layer.getChildFrame('body', index);//找页面下所有套的子类
			           var inputForm = body.find('#layuiadmin-form-role');//这是你弹出层 表单对象
			           if(checkedAdd(inputForm[0])){
			            	$.ajax({
								url : '${root}/sys/editRole',
								data : JSON.stringify(fromData),
								type : 'POST',
								contentType: 'application/json',
								dataType : 'json',
								success : function(res) {
									if (res.result_code && res.return_code) {
										toast('操作成功');
					    				table.reload('roleList', {});
									} else {
										toast('添加失败');
									}
								},error:function(){
									toast('系统异常');
								},complete:function(){
								 layer.close(index);
								}
							});
			            }
			          //以下代码是有效的,可以视为另一种实现当 layer = layui.layer
		        	  /*var iframeWindow = window['layui-layer-iframe'+ index]
			            ,submitID = 'LAY-user-role-submit'
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
		
		//批量删除角色
		/* $(".batchDel").click(function(){
			var checkStatus = table.checkStatus('roleList')
		      ,data = checkStatus.data,roleStr='',flag=false;
			
			if(data.length>0){
				$.each(data, function (n, value) {
		              roleStr+=value.roleId+',';
		          });
				  roleStr=roleStr.substring(0,roleStr.length-1);
				  layer.confirm('真的要删除<strong>'+data.length+'</strong>条数据吗？', function(index){
					  $.ajax({
				    		  url:'${root }/sys/delRoles/'+roleStr,//接口地址
				    		  type : "get",
				    		  success : function(d){
				    			  if(d.code==0){
				    				  //删除成功，刷新父页面
				    				  parent.location.reload();
				    			  }else{
				    				  layer.msg("权限不足，联系超管！",{icon: 5});
				    			  }
				    		  }
				    	  });
				  });
			}else{
				layer.msg("请选择要操作的数据！");
			}
			
		}); */
		
	});
	  //校验添加角色数据
	  function checkedAdd(div) {
		  fromData={};
		  let roleName=$(div).find("input[name='roleName']").val();
		  let menuList=[];
		  $(div).find("input[name='menuList']:checked").each(function(i,item){
			  menuList.push({menuId:$(item).val()});
		  });
		  let roleRemark=$(div).find("textarea[name='roleRemark']").val();
		  if($.trim(roleName)==''){
			  parent.layer.msg('角色名不能空');
			  return false;
		  }
		  if(menuList.length==0){
			  parent.layer.msg('请分配角色权限');
			  return false;
		  }
		  let roleId=$(div).find("input[name='roleId']").val();
		  if($.trim(roleId)!=''){
			  fromData.roleId = roleId;
		  }
		  fromData.roleName = roleName;
		  fromData.menuList = menuList;
		  fromData.roleRemark = roleRemark;
		  return true;
	  }
  	</script>
</body>
</html>