<!-- JSTL-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<%-- <c:set var="productImgUrl" value="http://ytct.wx.ge-test.com/picture_image/" /> --%>

<!--  layui css -->
<link rel="stylesheet" href="${root}/layuiadmin/layui/css/layui.css" media="all">
<link rel="stylesheet" href="${root}/layuiadmin/style/admin.css" media="all">
<link rel="stylesheet" href="${root}/layuiadmin/style/login.css" media="all">
<!-- JS -->
<script type="text/javascript" src="${root}/js/jquery-3.1.1.js"></script>
<script type="text/javascript" src="${root}/layuiadmin/layui/layui.js"></script>
<script type="text/javascript" src="${root}/js/layer.js"></script>
<script type="text/javascript" src="${root}/js/globe.js"></script>
<!-- ico -->
<link rel="icon" href="${root}/image/favicon.ico" type="image/x-icon" />
<link rel="shortcut icon" href="${root}/image/favicon.ico" type="image/x-icon" />
<link rel="bookmark" href="${root}/image/favicon.ico" type="image/x-icon" />