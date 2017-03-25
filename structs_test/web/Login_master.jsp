<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="GBK"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=GBK">
    <title>后台管理员登录</title>
</head>
<body>
    <s:form method="post" action="login">
        <s:textfield name="username" key="user"/>
        <s:textfield name="password" key="pass"/>
        <s:submit key="login"/>
    </s:form>
</body>
</html>