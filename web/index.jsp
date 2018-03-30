<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%--
  Created by IntelliJ IDEA.
  User: 宇成童鞋
  Date: 2018/3/29
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Date</title>
</head>
<body>
<%
    Date dNow = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
    int hour = Integer.valueOf(sdf.format(dNow).substring(11, 13));
    String welcome;
    if (hour > 0 && hour < 12) {
        welcome = "早上好!";
    } else if (hour >= 12 && hour <= 18) {
        welcome = "下午好!";
    } else {
        welcome = "晚上好!";
    }
    out.print("<h1 align=\"center\">" + sdf.format(dNow) + "</h1>");
    out.print("<h1 align=\"center\">" + welcome + "</h1>");
    response.setHeader("Refresh", "1");
%>
</body>
</html>
