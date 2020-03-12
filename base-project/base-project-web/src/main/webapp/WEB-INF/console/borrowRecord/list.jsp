<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<title>记录管理</title>
	<%@ include file="/WEB-INF/console/common/includ.jsp" %>
</head>
<body>
<div class="layui-fluid">
   	<div class="search-wrap layui-form">	
	   	<div class="layui-inline">
			<div class="layui-input-inline">
			   <input class="layui-input" name="userName" id="userName" placeholder="用户名称" autocomplete="off">
			</div>
			
			<div class="layui-input-inline">
			   <input class="layui-input" name="goodsName" id="goodsName" placeholder="货物名称" autocomplete="off">
			</div>
			
			<div class="layui-input-inline">
			    <select name="state" class="layui-input" id="state" >
			      	<option value="">---归还状态---</option>
			      	<option value="1">未归还</option>
			      	<option value="2">已归还</option>
					
					
				</select>
			</div>




			<div class="layui-input-inline">
				<input type="text" id="borrowTimeStart" class="layui-input" name="borrowTimeStart" placeholder="租借时间(开始)" value="" autocomplete="off">
			</div>
			<div class="layui-input-inline">
				<input type="text" id="borrowTimeEnd" class="layui-input" name="borrowTimeEnd" placeholder="租借时间(结束)" value="" autocomplete="off">
			</div>
			
			<div class="layui-inline">
				<input type="text" id="returnTimeStart" class="layui-input" name="returnTimeStart" placeholder="归还时间(开始)" value="" autocomplete="off">
			</div>
			<div class="layui-inline">
				<input type="text" id="returnTimeEnd" class="layui-input" name="returnTimeEnd" placeholder="归还时间(结束)" value="" autocomplete="off">
			</div>
			
			
			<button class="layui-btn" id="reloadBtn" data-type="reload"><i class="layui-icon">&#xe615;</i></button>   
			<button class="layui-btn"  onclick="clearParam()"><i class="layui-icon layui-icon-fonts-clear layuiadmin-button-btn"></i></button>   
			<!-- <button class="layui-btn layuiadmin-btn-useradmin" id="add"><i class="layui-icon layuiadmin-button-btn">&#xe608;</i></button>  -->
		</div>
		<div class="container"><table id="borrowRecord" lay-filter="borrowRecord"  class="layui-hide"></table></div>
	</div>	
	
	<script type="text/html" id="operate">
		<a class="layui-btn layui-btn-xs layui-btn-normal" lay-event="edit">编辑</a>
		<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="delete">删除</a>
	</script>
	
	<!-- 状态 -->
	<script type="text/html" id="stateBox">
	{{# if(d.state == '1'){ }}
		<span class="layui-badge-dot"></span>未归还
	{{# }else if(d.state == '2'){ }}
		<span class="layui-badge-dot layui-bg-green"></span>已归还
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
			elem: '#borrowRecord',
			cellMinWidth: 40, 
			url: '${root}/borrowRecord/getData', //数据接口
			method: 'POST',
			page: true, //开启分页
			limit:20, //初始显示20条数据	
			height: 'full-88',
			id:'borrowRecord',
			cols:[[ 
				{field: 'userName',fixed:'left',minWidth :'220',align:'center', title: '用户名称'},
				{field: 'goodsName',fixed:'left',minWidth :'220',align:'center', title: '物品名称'},
				{field: 'borrowTime',fixed:'left',minWidth :'220',align:'center', title: '租借时间',templet:'<span>{{ formatTime(d.borrowTime,"yyyy-MM-dd hh:mm:ss")}}</span>'},
				{field: 'borrowNum',fixed:'left',minWidth :'220',align:'center', title: '租借数量'},
				{field: 'returnTime',fixed:'left',minWidth :'220',align:'center', title: '归还时间',templet:'<span>{{ formatTime(d.returnTime,"yyyy-MM-dd hh:mm:ss")}}</span>'}, 
				{field: 'returnNum',fixed:'left',minWidth :'220',align:'center', title: '归还数量'}, 
				{field: 'state',fixed:'left',minWidth :'220',align:'center', title: '状态',templet:'#stateBox'},
				/* {fixed: 'right', minWidth :'200',title:"操作",width:'200', align:'left', toolbar: '#operate'} */]], 
			 	done:function(){		
			 		
			 		
			 	}
		});
		  

	  var start = laydate.render({
			elem : '#borrowTimeStart',
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
			elem : '#borrowTimeEnd',
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
		
		
		 var start2 = laydate.render({
			elem : '#returnTimeStart',
			type : 'datetime',
			max : nowTime,
			btns : [ 'clear', 'confirm' ],
			done : function(value, date) {
				endMax = end.config.max;
				end.config.min = date;
				end.config.min.month = date.month - 1;
			}
		});
		var end2 = laydate.render({
			elem : '#returnTimeEnd',
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
		  table.reload('borrowRecord',{
				where:{
					userName:$("#userName").val(),
					goodsName:$("#goodsName").val(),
					state:$("#state option:selected").val(),
					borrowTimeStart:$("#borrowTimeStart").val(),
					borrowTimeEnd:$("#borrowTimeEnd").val(),
					returnTimeStart:$("#returnTimeStart").val(),
					returnTimeEnd:$("#returnTimeEnd").val()
				}
			}); 
	  });
	  
	  table.on('tool(borrowRecord)',function(obj){
		  var layEvent = obj.event;
		  if(layEvent === 'delete'){ 
			  $.ajax({
		    	  url: '${root}/borrowRecord/toDelete'
				      ,data:{borrowRecordId:obj.data.borrowRecordId}
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
		  }else if(layEvent === 'edit'){ 
			  layer.open({
		          type: 2
		          ,title: '修改记录'
		          ,content: '${root}/borrowRecord/addView?programaId='+obj.data.programaId+"&programaTitleEn="+obj.data.programaTitleEn+"&programaTitleCn="+obj.data.programaTitleCn+"&parentId="+obj.data.parentId+"&programaUrl="+obj.data.programaUrl+"&programaState="+obj.data.programaState
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
			          addDataAction(data.field,"toUpdate");
			          layer.close(index);
			        });
			        submit.trigger('click');
			      }
		        });
		  }
	  });
	  
    $('#add').on('click', function(){
    	layer.open({
          type: 2
          ,title: '新增记录'
          ,content: '${root}/borrowRecord/addView'
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
	    	  url: '${root}/borrowRecord/toUpdate'
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
	    	  url: '${root}/borrowRecord/' + url
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
		$("#state option:selected").val("");
		
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