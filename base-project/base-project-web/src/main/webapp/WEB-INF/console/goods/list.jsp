<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<title>物品管理</title>
	<%@ include file="/WEB-INF/console/common/includ.jsp" %>
</head>
<body>
<div class="layui-fluid">
   	<div class="search-wrap layui-form">	
	   	<div class="layui-inline">
			<div class="layui-input-inline">
			   <input class="layui-input" name="goodsName" id="goodsName" placeholder="物品名" autocomplete="off">
			</div>
			

			<button class="layui-btn" id="reloadBtn" data-type="reload"><i class="layui-icon">&#xe615;</i></button>   
			<button class="layui-btn"  onclick="clearParam()"><i class="layui-icon layui-icon-fonts-clear layuiadmin-button-btn"></i></button>   
			<button class="layui-btn layuiadmin-btn-useradmin" id="add"><i class="layui-icon layuiadmin-button-btn">&#xe608;</i></button> 
		</div>
		<div class="container"><table id="goods" lay-filter="goods"  class="layui-hide"></table></div>
	</div>	
	
	<script type="text/html" id="operate">
		<a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="delete">删除</a>
	</script>
	
	<script type="text/html" id="information">
		<a class="layui-btn layui-btn-xs layui-btn-warm" lay-event="barCode">条形码</a>
	</script>
	
	<!-- 栏目状态 -->
	<script type="text/html" id="programaStateView">
	{{# if(d.programaState == '1'){ }}
		未启动
	{{# }else if(d.programaState == '2'){ }}
		已启动
	{{# } }}
	</script>
	<script type="text/javascript">
	layui.config({
	    base: '${root}/layuiadmin/' //静态资源所在路径
	  }).extend({
	    index: 'lib/index' //主入口模块
	  }).use(['index','form', 'table','laydate'],function(){
		  var table = layui.table,
			form = layui.form,
			layer = layui.layer,
			layedit = layui.layedit,
		 	laydate = layui.laydate,
		 	admin = layui.admin,
		 	nowTime = new Date().valueOf()
		//第一个实例
		table.render({
			elem: '#goods',
			cellMinWidth: 40, 
			url: '${root}/goods/getData', //数据接口
			method: 'POST',
			page: true, //开启分页
			limit:20, //初始显示20条数据	
			height: 'full-88',
			id:'goods',
			cols:[[ 
				{field: 'goodsId',fixed:'left',minWidth :'220',align:'center', title: '物料Id'},
				{field: 'goodsName',fixed:'left',minWidth :'220',align:'center', title: '物品名称'},
				{field: 'goodsUnit',fixed:'left',minWidth :'220',align:'center', title: '物品单位'},
				{field: 'goodsNum',fixed:'left',minWidth :'220',align:'center', title: '库存数量'},
				{title:"信息录入", align:'center', toolbar: '#information'},
				{fixed: 'right', minWidth :'200',title:"操作",width:'200', align:'center', toolbar: '#operate'}]], 
			 	done:function(){		
			 		
			 		
			 	}
		});
		  
			/* var data=${parentName};
	 		console.log(data);
			var selects='';
			for(var b in data){
				var  its='<option value="'+data[b].programaId+'">'+data[b].programaTitleCn+'</option>';
				selects +=its;
			}
			$("#parentId").append(selects);
			form.render(); */
			
	  var start = laydate.render({
			elem : '#createTimeStart',
			type : 'datetime',
			max : nowTime,
			btns : [ 'clear', 'confirm' ],
			done : function(value, date) {
				endMax = end.config.max;
				end.config.min = date;
				end.config.min.month = date.month - 1;
			}
		});
		var end = laydate.render({
			elem : '#createTimeEnd',
			type : 'datetime',
			max : nowTime,
			done : function(value, date) {
				if ($.trim(value) == '') {
					var curDate = new Date();
					date = {
						'date' : curDate.getDate(),
						'month' : curDate.getMonth() + 1,
						'year' : curDate.getFullYear()
					};
				}
				start.config.max = date;
				start.config.max.month = date.month - 1;
			}
		})
		  
	  $('#reloadBtn').on('click', function(){
		  table.reload('goods',{
				where:{
					goodsName:$("#goodsName").val()
				}
			}); 
	  });
	  
	  table.on('tool(goods)',function(obj){
		  var layEvent = obj.event;
		  if(layEvent === 'delete'){
			  layer.confirm('确认删除?', {icon: 3, title:'提示'}, function(index){
				  $.ajax({
			    	  url: '${root}/goods/toDelete'
					      ,data:{goodsId:obj.data.goodsId}
					      ,dataType:'json'
					      ,type:'post'
					      ,success: function(res){
					    	  if (res.result_code) {
					    		  toast('操作成功');
					    		  $('#reloadBtn').click();
					    	  } else {
					    		  toastErr('操作失败');
					    	  }
					      }
			    	  	  ,error: function(data){
			    	  		toastErr('操作失败');
			    	  	  }
			      });
				  
				  layer.close(index);
				});
			  
		  }else if(layEvent === 'edit'){ 
			  layer.open({
		          type: 2
		          ,title: '修改物品'
		          ,content: '${root}/goods/addView?goodsId='+obj.data.goodsId+"&goodsUnit="+obj.data.goodsUnit+"&goodsNum="+obj.data.goodsNum+"&goodsName="+obj.data.goodsName
		          ,maxmin: true
		          ,area: admin.screen() < 2 ? ['90%', '70%'] : ['50%', '30%']
		          ,btn: ['确定', '取消']
		          ,btnAlign: 'c'
		          ,offset: 'auto'
		          ,yes: function(index, layero){
			        var iframeWindow = window['layui-layer-iframe'+ index]
			        ,submitID = 'LAY-time-front-submit'
			        ,submit = layero.find('iframe').contents().find('#'+ submitID);
			        //监听提交
			        iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
			          //提交 Ajax 成功后，静态更新表格中的数据
			          console.log(data);
			          addDataAction(data.field,"toUpdate");
			          layer.close(index);
			        });
			        submit.trigger('click');
			      }
		        });
		  }else{
			  layer.msg("暂未开放");
		  }
	  });
	  
    $('#add').on('click', function(){
    	layer.open({
          type: 2
          ,title: '新增用户'
          ,content: '${root}/goods/addView'
          ,maxmin: true
          ,area: admin.screen() < 2 ? ['90%', '70%'] : ['80%', '70%']
          ,btn: ['确定', '取消']
          ,btnAlign: 'c'
          ,offset: 'auto'
          ,yes: function(index, layero){
	        var iframeWindow = window['layui-layer-iframe'+ index]
	        ,submitID = 'LAY-time-front-submit'
	        ,submit = layero.find('iframe').contents().find('#'+ submitID);
	        //监听提交
	        iframeWindow.layui.form.on('submit('+ submitID +')', function(data){
	          //提交 Ajax 成功后，静态更新表格中的数据
	          console.log(data);
	          addDataAction(data.field,"toInsert");
		      layer.close(index);
	        });
	        submit.trigger('click');
	      }
        });
    	
    	
    	
    });
    
    
    form.on('switch(programaStateTable)', function(data){
    	console.log(data);
    	$.ajax({
	    	  url: '${root}/goods/toUpdate'
			      ,data:{programaId:data.value,programaState:data.elem.checked?2:1}
			      ,dataType:'json'
			      ,type:'post'
			      ,success: function(res){
			    	  if (!res.result_code) {
						toastErr('操作失败');
						data.othis.click();
			    	  }
			      }
	    	  	  ,error: function(data){
	    	  		toastErr('操作失败');
	    	  	  }
	      });
	}); 
	  
   });//Layui结束
	
   function getAll(){
	   $.ajax({
	    	  url: '${root}/programa/getAll'
			      ,dataType:'json'
			      ,type:'post'
			      ,success: function(res){
			    	  console.log(res);
			      }
	    	  	  ,error: function(data){
	    	  		toastErr('父级为空');
	    	  	  }
	      });
   }
   
   
	//提交数据
	function addDataAction(data,url){
		$.ajax({
	    	  url: '${root}/goods/' + url
			      ,data:data
			      ,dataType:'json'
			      ,type:'post'
			      ,success: function(res){
			    	  if (res.result_code) {
			    		  toast('操作成功');
			    		  $('#reloadBtn').click();
			    	  } else {
			    		  toastErr('操作失败');
			    	  }
			      }
	    	  	  ,error: function(data){
	    	  		toastErr('操作失败');
	    	  	  }
	      });
	}
	
	
	//搜索重置
	function clearParam() {
		$(".search-wrap  input").each(function(idx, obj) {
			$(this).val("");
			
		});
	}

	function flashlaod() {
		layer.confirm('登陆已过期，点击确认重新登陆', {
			icon : 3,
			title : '温馨提示'
		}, function(index) {
			parent.location.reload();
		});
	}
</script>
</div>
</body>
</html>