<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="javax.servlet.http.Cookie,java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>登入</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <%@ include file="/WEB-INF/console/common/includ.jsp"%>
  <script type="text/javascript" src="${root }/js/md5.js"></script>
</head>
<body>
<%
		String username = "";
		String password = "";
		String remember="";
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				if ("username".equals(cookies[i].getName())) {
					username = URLDecoder.decode(cookies[i].getValue());
				} else if ("password".equals(cookies[i].getName())) {
					password = cookies[i].getValue();
				}else if("remember".equals(cookies[i].getName())){
					remember = cookies[i].getValue();
				}
			}
		} 
	%>
	<c:set var="remember" value="<%=remember %>"/>
  <div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">
  <input type="hidden" id="rememberMe" value="${remember }">
  <input type="hidden" id="rememberusername" value="<%=username %>">
  <input type="hidden" id="rememberpassword" value="<%=password %>">
    <div class="layadmin-user-login-main">
      <div class="layadmin-user-login-box layadmin-user-login-header">
      <!-- style="background-color: #009688;" -->
      <h2>智能仓库管理系统</h2>
        <p>华易科技提供支持</p>
        <%-- <img class="layadmin-user-login-body"  src="${root}/image/lg-logo.png"> --%>
      </div>
      <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
          <input type="text" value="<%=username %>" name="username" id="LAY-user-login-username" lay-verify="required" placeholder="用户名" class="layui-input">
        </div>
        <div class="layui-form-item">
          <label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
          <input type="password" name="password" value="<%=password %>" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
        </div>
        <div class="layui-form-item" style="margin-bottom: 20px;">
         <%--  <input type="checkbox" id="remember" name="remember" lay-filter="remember" <c:if test="${'true' eq remember }">checked='checked'</c:if> lay-skin="primary" title="记住密码"> --%>
         <%--  <a href="${root }/user/forgetView" class="layadmin-user-jump-change layadmin-link" style="margin-top: 7px;">忘记密码？</a> --%>
        </div>
        <div class="layui-form-item">
          <button id="login" class="layui-btn layui-btn-fluid" lay-submit lay-filter="LAY-user-login-submit">登 入</button>
        </div>
      </div>
    </div>
    
    <div class="layui-trans layadmin-user-login-footer">
      <p>Copyright © 佛山华易科技有限公司</p>
    </div>
    
  </div>
  <script>
  layui.config({
    base: '${root}/layuiadmin/' //静态资源所在路径
  }).extend({
    index: 'lib/index' //主入口模块
  }).use(['index', 'user'], function(){
    var $ = layui.$
    ,setter = layui.setter
    ,admin = layui.admin
    ,form = layui.form
    ,router = layui.router()
    ,search = router.search;

    form.render();
    form.on('checkbox(remember)', function(data){
    	$('#remember').val(data.elem.checked);
    }); 
    //提交
    form.on('submit(LAY-user-login-submit)', function(obj){
    	if((!$('#rememberMe').val())||($('#rememberusername').val()!=$('#LAY-user-login-username').val())||($('#rememberpassword').val()!=$('#LAY-user-login-password').val())){
    		obj.field.password=hex_md5(obj.field.password);
    	}
        admin.req({
        	url: '${root}/user/checklogin',
        	data: obj.field,
        	done: function(res){
            if (res.result_code && res.return_code) {
          	  toastANDRedirect('登录成功','${root}/sys/home');
  			} else {
  				layer.msg(res.msg);
  			}
          }
        });
    });
        
  });
  document.onkeydown = function (event) {
        var e = event || window.event;
        if (e && e.keyCode == 13) { //回车键的键值为13
            $("#login").click(); //调用登录按钮的登录事件
        }
    }; 
  </script>
</body>
</html>