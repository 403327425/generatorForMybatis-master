<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>  
<%@ include file="/WEB-INF/console/common/includ.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>智能仓库管理系统</title>
	<meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <style type="text/css">
      /* .layadmin-tabsbody-item .layadmin-iframe{
      padding:5px 5px 0 10px;
      } */
    </style>
</head>

<body class="layui-layout-body">
  <div id="LAY_app">
    <div class="layui-layout layui-layout-admin">
      <div class="layui-header">
        <!-- 头部区域 -->
        <ul class="layui-nav layui-layout-left">
          <li class="layui-nav-item layadmin-flexible" lay-unselect>
            <a href="javascript:;" layadmin-event="flexible" title="侧边伸缩">
              <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
            </a>
          </li>
          <li class="layui-nav-item" lay-unselect>
            <a href="javascript:;" layadmin-event="refresh" title="刷新">
              <i class="layui-icon layui-icon-refresh-3"></i>
            </a>
          </li>      
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">
      
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:;" layadmin-event="theme">
              <i class="layui-icon layui-icon-theme"></i>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:;" layadmin-event="fullscreen">
              <i class="layui-icon layui-icon-screen-full"></i>
            </a>
          </li>
          <li class="layui-nav-item" lay-unselect>
            <a href="javascript:;">
              <cite><shiro:principal property="adminNickName"/> </cite>
              <inpit type="hidden" id="adminId" value='<shiro:principal property="adminId"/>' />
            </a>
            <dl class="layui-nav-child">
              <dd><a lay-href="${root }/user/personalDataView">基本资料</a></dd>
              <dd><a lay-href="${root }/user/changePwdView">修改密码</a></dd>
             <!--  <dd><a href="javascript:showimg()">绑定微信</a></dd> -->
              <hr>
              <dd  style="text-align: center;"><a href="${root}/loginOut">退出</a></dd>
            </dl>
          </li>
           <li class="layui-nav-item layui-hide-xs" lay-unselect>
               <a href="javascript:;" layadmin-e vent="about"></a>
          </li>
        </ul>
      </div>
      
      <!-- 侧边菜单 -->
      <div class="layui-side layui-side-menu">
        <div class="layui-side-scroll">
          <div class="layui-logo">
            <span>智能仓库管理系统</span>
          </div>
          <ul class="layui-nav layui-nav-tree" lay-shrink="all" id="LAY-system-side-menu" lay-filter="layadmin-system-side-menu">
          <c:forEach var="menu" items="${menus}" varStatus="menuStatus">
	            <li data-name="home" class="layui-nav-item">
	              <a href="javascript:;" lay-tips="${menu.title }" lay-direction="2">
	                <i class="layui-icon">${menu.icon }</i>
	                <cite>${menu.title }</cite>
	              </a>
	              <dl class="layui-nav-child">
		              <c:forEach var="firstChildren" items="${menu.children}" varStatus="firstChildrenStatus">
			                <dd data-name="console">
			                  <a lay-href="${root}/${firstChildren.href }">
                          <i class="layui-icon">${firstChildren.icon }</i>
                          <cite>${firstChildren.title }</cite>
                        </a>
			                </dd>
		              </c:forEach>
		          </dl>
	            </li>
            </c:forEach>
          </ul>
        </div>
      </div>

      <!-- 页面标签 -->
      <div class="layadmin-pagetabs" id="LAY_app_tabs">
        <div class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-down">
          <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
            <li class="layui-nav-item" lay-unselect>
              <a href="javascript:;"></a>
              <dl class="layui-nav-child layui-anim-fadein">
                <dd layadmin-event="closeThisTabs"><a href="javascript:;">关闭当前标签页</a></dd>
                <dd layadmin-event="closeOtherTabs"><a href="javascript:;">关闭其它标签页</a></dd>
                <dd layadmin-event="closeAllTabs"><a href="javascript:;">关闭全部标签页</a></dd>
              </dl>
            </li>
          </ul>
        </div>
        <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="layadmin-layout-tabs">
          <ul class="layui-tab-title" id="LAY_app_tabsheader">
            <li lay-id="${root}/sys/welcome" lay-attr="${root}/view/welcome" class="layui-this"><i class="layui-icon layui-icon-home"></i></li>
          </ul>
        </div>
      </div>      
      <!-- 主体内容 -->
      <div class="layui-body" id="LAY_app_body">
        <div class="layadmin-tabsbody-item layui-show">
          <iframe src="${root}/sys/welcome" frameborder="0" class="layadmin-iframe"></iframe>
        </div>
      </div>
      <!-- 辅助元素，一般用于移动设备下遮罩 -->
      <div class="layadmin-body-shade" layadmin-event="shade"></div>
    </div>
  </div>
  <div id="wximg" style="display: none;"></div>
  <script type="text/javascript" src="${root}/js/qrcode.min.js"></script>
  <script>
  /* 跳转打开标签页面
	var topLayui = parent === self ? layui : top.layui;
   	let url="${root }/user/personalDataView/"+data.id;
   	topLayui.index.openTabsPage(url,'编辑管理员'); 
	*/
	 layui.config({
	   base: '${root}/layuiadmin/' //静态资源所在路径
	 }).extend({
	   index: 'lib/index' //主入口模块
	 }).use(['index','element'],function(){
	  var element = layui.element,
	  layer = layui.layer;
	  
	  
	 });
	
	function showimg(){
		$('#wximg').html("");
		var url = "http://sctest.wx.ge-test.com/sichen-project-web/wx/wxLogin?adminId="+$("#adminId").attr("value");
		
		var qrcode = new QRCode(document.getElementById("wximg"), {
			width : 200,
			height : 200
		});
		
		qrcode.makeCode(url);
		
		layer.open({
			  type: 1,
			  title: false,
			  closeBtn: 0,
			  
			  skin: 'layui-layer-nobg', //没有背景色
			  shadeClose: true,
			  content: $('#wximg')
		});
	}
  
  </script>  
</body>
</html>