<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>${titleName}</title>
<%@ include file="/WEB-INF/console/common/includ.jsp" %>

<style type="text/css">
body{text-align:center} 
.layui-form-label{
	width:100px;
}	
.layui-input-block,.layui-input-inline{
	margin-left: 130px;
}
/*layui 日期只显示时分选择*/
.layui-laydate-content>.layui-laydate-list {
    padding-bottom: 0px;
    overflow: hidden;
}
.layui-laydate-content>.layui-laydate-list>li{
    width:50%
}
.merge-box .scrollbox .merge-list {
    padding-bottom: 5px;
}
.bigbutton{
	width:200px;
	height:200px;
	font-size:150px;
}
.selectTypeBox{
	padding-top:300px;
}

.layui-table td{
	padding:0;margin:0;
}

</style>
</head>
<body>

<div id="selectTypeBox" name="selectTypeBox" class="selectTypeBox">
	<button type="button" class="layui-btn layui-btn-warm bigbutton" style="margin-right:100px"  onclick="showBorrowBox()">借</button>
	
	<button type="button" class="layui-btn layui-btn-normal bigbutton" style="margin-left:100px" onclick="showReturnBox()">还</button>
</div>

<div id="IdentityVerification" name="IdentityVerification" style="display:none">

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;text-align:left">
  <legend >身份验证</legend>
</fieldset>

	<button type="button" class="layui-btn layui-btn-normal " onclick="showIdentity()">点击验证</button>
</div>

<div id="userInfoBox" name="userInfoBox" style="display:none">
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;text-align:left">
  <legend >身份验证</legend>
</fieldset>
	<div id="userInfoName" name="userInfoName" style="font-size:50px"></div></br>
	<button type="button" class="layui-btn layui-btn-normal " onclick="">上一步</button>
	<button type="button" class="layui-btn layui-btn-normal " onclick="nextDeal()">下一步</button>
</div>

<div id="goodsBox" name="userInfoBox" style="display:none">
<div style="">
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;text-align:left">
  <legend id="typeShowbox"></legend>
</fieldset>

</div>
<div style="text-align:center">
	<form class="layui-form" action="" style="text-align:center">
		<table id="goodsListTable" class="layui-table" style="width:1200px;margin:0 auto;">
		<thead>
			<tr style="height:39px">
				<td style="width:400px">名称</td>
				<td style="width:400px">单位</td> 
				<td style="width:400px">数量</td> 
				<td style="width:400px">操作</td>
			</tr>
		</thead>	
		</table>
	</form>
</div>
</br>
<hr class="layui-bg-cyan">
<button type="button" class="layui-btn layui-btn-normal " style="float:right;margin-right:15px" >确认</button>
<button type="button" class="layui-btn layui-btn-normal " id="add" style="float:right;margin-right:15px">添加物品</button></br>
</div>


<div class="padding_top">
	<form class="layui-form" id="aa" action="" method="POST">
		
		
		
	<div class="layui-form-item layui-hide">
      <input type="button" lay-submit lay-filter="LAY-time-front-submit" id="LAY-time-front-submit" value="确认">
    </div>
	</form>
</div>
<script type="text/javascript">
	var BaseType=""
	var userId=""
	layui.config({
	    base: '${root}/layuiadmin/' //静态资源所在路径
	}).extend({
	    index: 'lib/index' //主入口模块
	}).use(['form', 'layedit', 'upload', 'laydate','index','table'], function(){
		  var form = layui.form
		  var $ = layui.$
		  ,layer = layui.layer
		  ,layedit = layui.layedit
		  ,upload = layui.upload
		  ,laydate = layui.laydate;
		  
		  
		  
		  $('#add').on('click', function(){
			  $("#goodsListTable").append("<tr>"
			  +"<td>木头</td>"
			  +"<td>桶</td>"
			  
			  +"<td><input type='text' name='title' required  lay-verify='required'  autocomplete='off' class='layui-input' value='1' style='text-align:center;border:0'></td>" 
			  +"<td><button type='button' class='layui-btn layui-btn-sm ' style='' onclick='delete()'>删除</button></td></tr>");
			  
		  })
	});//layui结束
	
	var showBorrowBox=function(){
		$("#selectTypeBox").hide();
		$("#IdentityVerification").show();
		BaseType="borrow";
	}
	var showReturnBox=function(){
		$("#selectTypeBox").hide();
		$("#IdentityVerification").show();
		BaseType="return";
	}
	var showIdentity=function(){
		$.ajax({
		    type: 'post',
		    url: '${root}/userInfo/getUser',
		    data: {
		        "icCard":"440902199511140473"
		    },
		    async: true,
		    success: function (res) {
		    	toast('校验成功');
		    	console.log(res);
		    	$("#IdentityVerification").hide();
		    	$("#userInfoBox").show();
		    	$("#userInfoName").append(res.userName);
		    	userId=res.userId;
		    },
		    error: function(data){
    	  		toastErr('校验失败');
    	  	}
		})
	}
	var nextDeal=function(){
		$("#userInfoBox").hide();
		if(BaseType=="borrow"){
			$("#typeShowbox").empty();
			$("#typeShowbox").append("借出");
		}else if(BaseType=="return"){
			$("#typeShowbox").empty();
			$("#typeShowbox").append("归还");
		}
		$("#goodsBox").show();
	}
	
	
	
</script>
</body>
</html>