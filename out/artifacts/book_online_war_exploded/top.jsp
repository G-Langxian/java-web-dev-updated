<%--
  Created by IntelliJ IDEA.
  User: 浪仙墨白
  Date: 2019/9/28
  Time: 1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.bo.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User user = (User) session.getAttribute("user");
    pageContext.setAttribute("user", user);
%>
<ul>
    <li>
        <a href="${pageContext.request.contextPath}/index">专区</a>
    </li>
    <li>
        <a href="#">焰灵姬</a>
    </li>
    <li>
        <a href="#">卫庄</a>
    </li>
    <li>
        <a href="#">韩非</a>
    </li>
    <li>
        <a href="#">紫女</a>
    </li>
    <li>
        <a href="#">盖聂</a>
    </li>
    <li>
        <a href="#">张良</a>
    </li>
    <li>
        <a href="#">更多</a>
    </li>
</ul>
<ul>

    <%
        if (user != null) {
    %>
    <li>
        <a href="${pageContext.request.contextPath}/user">
            <img src="${pageContext.request.contextPath}/images/${user.avatar}" alt="" class="avatar">
        </a>
    </li>
    <li>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </li>
    <%
    } else {
    %>
    <a href="${pageContext.request.contextPath}/login">去登录</a>
    <%
        }
    %>
</ul>