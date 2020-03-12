<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
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
<body class="body_list layui-content-wrapper">
<div class="layui-fluid">
	<div class="search-wrap layui-form" >
		<div class="layui-input-inline">
		  	<input class="layui-input" name="departmentName" id="departmentName" placeholder="部门名称" autocomplete="off">
		</div>		
		<div class="layui-input-inline">
		  	<input class="layui-input" name="departmentAddress" id="departmentAddress" placeholder="部门地址" autocomplete="off">
		</div>		
		<button class="layui-btn layuiadmin-btn-useradmin" lay-submit lay-filter="LAY-user-front-search"><i class="layui-icon layui-icon-search layuiadmin-button-btn"></i> </button> 
		<button class="layui-btn layuiadmin-btn-useradmin" lay-submit lay-filter="LAY-user-front-clean"><i class="layui-icon layui-icon-fonts-clear layuiadmin-button-btn"></i></button> 
		<button class="layui-btn layuiadmin-btn-useradmin" data-type="add"><i class="layui-icon layuiadmin-button-btn">&#xe608;</i></button>  
		<div class="layui-inline">（支持模糊查询）</div>
		<div class="container">
			<table id="department" lay-filter="department" class="layui-hide"></table>
		</div>
	</div>
	
	<script type="text/html" id="operate">
		<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="delete">删除</a>
	</script>
	
	<script type="text/javascript">
	    layui.config({
	        base: '${root}/layuiadmin/' //静态资源所在路径
	    }).extend({
	        index: 'lib/index' //主入口模块
	    }).use(['form', 'table','laydate','index'], function(){
			var table = layui.table,
				form = layui.form,
				layer = layui.layer,
				layedit = layui.layedit,
			 	laydate = layui.laydate,
			 	admin = layui.admin;
			
				//第一个实例
				table.render({
					elem: '#department',
					url: '${root}/department/getData', //数据接口
					page: true, //开启分页
					limit:20, //初始显示20条数据	
					height: 'full-88',
					id:'department',
					cols: [[ //表头
						{field: 'departmentName',minWidth:250,align:'center', title: '部门名称'},
						{field: 'departmentAddress',minWidth:250,align:'center', title: '部门地址'},
						{field: 'departmentNum',minWidth:100,align:'center', title: '部门人员数'},
						{field: 'departmentPhone',minWidth:250,align:'center', title: '部门联系电话'},
						{field: 'superiorName',minWidth:250,align:'center', title: '上级部门'},
						{field: 'creatorName',width:150,align:'center', title: '创建人'},	
						{field: 'createTime',width:250,align:'center', title: '创建时间',templet : '<div>{{ formatTime(d.createTime,"yyyy-MM-dd hh:mm:ss")}}</div>'},
						{fixed: 'right', title:"操作",width:150, align:'left', toolbar: '#operate'},
					]]
				});
			
				//监听搜索
			    form.on('submit(LAY-user-front-search)', function(data){
					var field = data.field;
					//执行重载
					table.reload('department', {
						page : {
							curr : 1
						},//重新从第 1 页开始
						where: field
					});
			    });
				
			    form.on('submit(LAY-user-front-clean)', function(data){
					$(".search-wrap .layui-input-inline>input").each(function(idx, obj) {
						$(this).val("");
					});
					var field = data.field;
					for (var i in field) {
						field[i]="";
					}
					$(".search-wrap .layui-input-inline>select").val(0);
					form.render('select');
					//执行重载
	    			table.reload('department', {
	    				page : {
							curr : 1
						},//重新从第 1 页开始
	      				where: field
	    			});
			    });
			  	
				$('.layui-btn.layuiadmin-btn-useradmin').on('click', function(){
				      var type = $(this).data('type');
				      active[type] ? active[type].call(this) : '';
				});
			    
			  	//监听工具条
				table.on('tool(department)', function(obj) { //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
					var data = obj.data; //获得当前行数据
					var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
					//var tr = obj.tr; 获得当前行 tr 的DOM对象
					if (layEvent === 'edit') { //编辑
						layer.open({
						  	type: 2,
				          	title: '编辑部门',
				          	content: '${root}/department/toUpdate?departmentId='+obj.data.departmentId,
				          	maxmin: true,
				          	area: admin.screen() < 2 ? ['90%', '70%'] : ['80%', '80%'],
				          	btn: ['确定', '取消'],
				          	btnAlign: 'c',
				          	yes: editCall,
					  	});
					}else if(layEvent === 'delete'){
						layer.confirm('确定删除?', { icon : 3, title : '提示' }, function(index) {
							layer.close(index);
							$.ajax({
					      	  	url: '${root}/department/delete',
					      	  	type: 'get',
					  		  	data:{departmentId:obj.data.departmentId},
					  		  	dataType:'json',
					  		  	success: function(res){
									if (res.result_code) {
										reloadLayTable();
									 	toast('操作成功');
									} else {
										if(res.msg){
											toastErr(res.msg);
										}else{
											toastErr('操作失败');
										}
									}
								}
					        });
						});
					}
				});
			  	
				//事件
			    var active = {
			      	add: function(){
			        	layer.open({
			          		type: 2,
			          		title: '添加部门',
			          		content: '${root}/department/toInsert',
			          		maxmin: true,
			          		area: admin.screen() < 2 ? ['90%', '70%'] : ['80%', '80%'],
			          		btn: ['确定', '取消'],
			          		btnAlign: 'c',
			          		offset: 'auto',
			          		yes: editCall,
			        	});
			      	}
			    };
			  	
				var editCall=function(index, layero){
			    	var iframeWindow = window['layui-layer-iframe'+ index],
			        submitID = 'LAY-product-front-submit',
			        submit = layero.find('iframe').contents().find('#'+ submitID);
			        //监听提交
			        iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
			          	//提交 Ajax 成功后，静态更新表格中的数据
			          	dataAction(data.field);
			          	reloadLayTable();
			          	layer.close(index);
			        });
			        submit.trigger('click');
				}
				
				window.reloadLayTable = function(){
					table.reload("department",{});
				}
				
		});
	    
	    /*提交数据 */
	    function dataAction(data){
	    	var url = "";
	    	if(data.departmentId == null || data.departmentId == "" || data.departmentId == undefined){
	    		url = '${root}/department/insert';
	    	}else{
	    		url = '${root}/department/update';
	    	}
			$.ajax({
	      	  	url: url,
	  		  	data:data,
	  		  	type:'POST',
	  		  	dataType:'json',
	  		  	success: function(res){
					if (res.result_code) {
						reloadLayTable();
					 	toast('操作成功');
					} else {
						toastErr('操作失败');
					}
				}
	        });
	    }
		
	</script>
</div>
	
</body>
</html>