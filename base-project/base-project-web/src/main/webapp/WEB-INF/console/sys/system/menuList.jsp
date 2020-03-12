<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>菜单列表</title>
<style type="text/css">
/* 数据表格复选框正常显示 */
.layui-table-cell .layui-form-checkbox[lay-skin="primary"] {
	top: 50%;
	transform: translateY(-50%);
}
</style>
<style type="text/css">
.layui-table-view .layui-form-radio>i {
    margin: 16px;
}
.isFixed{
position: fixed;top: 10px;z-index: 4;width: 100%;
}
.isFixedPad{ padding-top: 38px;}
.isFixedPad .layui-table-body{ overflow: hidden;}
</style>
</head>
<body class="layui-layout-body bodyPadding">
	<div id="header" class="layui-btn-group TableTools isFixed">
		<shiro:hasPermission name="sys:menu:save">
			<button class="layui-btn" id="addMenu">添加菜单</button>
		</shiro:hasPermission>
		<shiro:hasPermission name="sys:menu:update">
			<button class="layui-btn" id="editMenu">编辑菜单</button>
		</shiro:hasPermission>
		<shiro:hasPermission name="sys:menu:delete">
			<button class="layui-btn layui-btn-danger" id="delMenu">删除菜单</button>
		</shiro:hasPermission>
		<button class="layui-btn layui-btn-primary">（不选中为添加顶级菜单，选中添加子菜单）</button>
	</div>
	<div class="isFixedPad">
		<table class="layui-hidden" id="treeTable" lay-filter="treeTable"></table>
	</div>
	<!-- <script src="${root}/js/vue.js"></script> -->
	<script>
	let checkedId=0;
	// let vm = new Vue({
	// 	el : '#header',
	// 	data : {
	// 		isFixed:false
	// 	}
	// 	,mounted:function(){
	//         window.addEventListener('scroll', this.handleScroll);
	//     },methods:{
	//     	handleScroll(){  
	//     		this.$nextTick(() => {
	//     			let scrollTop = document.documentElement.scrollTop || document.body.scrollTop;  
	//     			let headerTop = document.getElementById("header");  
	//     			if (scrollTop > 10) {
	//     				this.isFixed = true;  
	//     			} else {
	//     				this.isFixed = false;  
	//     			}
	//     		});
	//     	}
	//     }
	// });
	layui.config({
	    base: '${root }/layuiadmin/' //静态资源所在路径
	  }).extend({
	    index: 'lib/index' //主入口模块
	  }).use(
				['index', 'element', 'layer', 'form', 'upload', 'treeGrid', 'jquery' ],
				function() {
					var treeGrid = layui.treeGrid, form = layui.form, //很重要
					$ = layui.jquery, table = layui.table,admin=layui.admin;
					var treeTable = treeGrid.render({
						id : 'treeTable',
						elem : '#treeTable',
						url : '${root }/sys/menuData',
						cellMinWidth : 100,
						treeId : 'menuId'//树形id字段名称
						,
						treeUpId : 'parentId'//树形父id字段名称
						,
						treeShowName : 'title'//以树形式显示的字段
						,
						cols : [ [ {
							field : 'menuId',
							title : ' ',
							templet : "#radioTpl",
							unresize : true,
							width: 80
						}, {
							field : 'title',
							title : '菜单名',
							minWidth: 200
						}, {
							field : 'icon',
							title : '图标',
							templet : '#iconTpl',
							width: 80
						}, {
							field : 'href',
							title : '链接',
							minWidth: 200
						}, {
							field : 'perms',
							title : '权限标识',
							minWidth: 200
						}, {
							field : 'sorting',
							title : '排序',
							event: 'sorting', 
							style:'cursor: pointer;',
							width: 80
						}         
						] ],
						page : false
					});

					//监听单元格编辑
					treeGrid.on('tool(treeTable)', function(obj) {
						 var data = obj.data;
						 if(obj.event === 'sorting'){
							 var msg='',flag=false;
						      layer.prompt({
							        formType: 2
							        ,title: '修改 ID 为 ['+ data.menuId +'] 的排序'
							        ,value: data.sorting
							      }, function(value, index){
							        layer.close(index);
							        //这里一般是发送修改的Ajax请求
							        if(data.sorting!=value){
							        	$.ajax({
							                type: "POST",
							                url: "${root}/sys/editMenu",
							                async:false,
							                data:{'menuId':data.menuId,'sorting':value},
							                success:function(res){
							                	if(res.result_code && res.return_code){
							    					msg="修改成功";
							    					flag=true;
							    				}else{
							    					msg="修改失败";
							    					value=data.sorting
							    				}
							                }
							            });
							        	if(flag){
							        		layer.msg(msg,{icon: 1});
							        	}else{
							        		layer.msg(msg,{icon: 5});
							        	}
							        }
							        //同步更新表格和缓存对应的值
							        treeGrid.reload("treeTable",{})
							      });
						 }
					});

					$("#addMenu").click(function() {
						var parentId = $("input[name='menuId']:checked").val();
						if (!parentId || parentId == 'undefined') {
							parentId = 0;
						}
						//添加菜单
						layer.open({
							type : 2,
							title : "添加菜单",
							content : "${root }/sys/addMenuView?parentId="+parentId,
							maxmin: false,
							area: admin.screen() < 2 ? ['100%', '100%'] : ['100%', '100%'],
							btn: ['提交', '关闭'],
							btnAlign: 'c',
							yes: callback
						});

					});

					$("#editMenu").click(function() {
						var menuId = $("input[name='menuId']:checked").val();
						if (menuId == undefined) {
							layer.msg("请选择要操作的菜单！", {
								icon : 5
							});
							return;
						}
						if (menuId == 1) {
							layer.msg("不允许操作的菜单！", {
								icon : 5
							});
							return;
						}
						layer.open({
							type : 2,
							title : "修改菜单",
							content : "${root }/sys/editMenuView?menuId=" + menuId,
							maxmin: false,
							area: admin.screen() < 2 ? ['100%', '100%'] : ['100%', '100%'],
							btn: ['提交', '关闭'],
							btnAlign: 'c',
							yes: callback
						});

					});

					$("#delMenu").click(function() {
						var menuId = $("input[name='menuId']:checked").val();
						if (menuId == undefined) {
							layer.msg("请选择要操作的菜单！", {
								icon : 5
							});
							return;
						}
						if (menuId == 1) {
							layer.msg("不允许删除！", {
								icon : 5
							});
							return;
						}
						layer.confirm('确定删除吗？', function(index) {
							$.ajax({
								url : '${root }/sys/delMenu?menuId=' + menuId,
								type : "post",
								success : function(res) {
									if (res.result_code && res.return_code) {
										toastANDRedirect('操作成功','${root}/sys/menuListView');
									} else {
										toast(res.msg);
									}
								},error:function(){
									toast('请求错误');
								},complete:function(){
								 layer.close(index);
								}
							});
						});

					});
					form.on('radio(noIssuer)', function(data){
						if(data.value==checkedId){
							$(this)[0].checked = false;
							checkedId=0;
							form.render('radio');
						}else{
							checkedId=data.value;
						}
					});
				});
	//监听提交回调
	var callback=function(index, layero){
		var iframeWindow = window['layui-layer-iframe'+ index],
		submitID = 'LAY-user-menu-submit',
		submit = layero.find('iframe').contents().find('#'+ submitID);
		iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
			$.ajax({
				url : '${root}/sys/editMenu',
				data : data.field,
				type : 'POST',
				dataType : 'json',
				success : function(res) {
					if (res.result_code && res.return_code) {
						toastANDRedirect('操作成功','${root}/sys/menuListView');
					} else {
						toast('操作失败');
					}
				},complete:function(){
					 layer.close(index);
				}
			});
		});
		submit.trigger('click');
	}
	</script>
	<script type="text/html" id="barTools">
<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
<a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
	<script type="text/html" id="iconTpl">
 		 {{#  if(d.icon === null){ }}
   			
		{{#  } else{ }}
			<i class="layui-icon">{{ d.icon }}</i>  
  		{{#  } }}
	</script>
<script type="text/html" id="radioTpl">
  <input type="radio" name="menuId" value="{{d.menuId}}" title=" " lay-filter="noIssuer">
</script>
</body>
</html>