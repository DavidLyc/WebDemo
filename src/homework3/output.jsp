<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
<div align="center">
    圆的周长：<%=request.getAttribute("outputGirth")%><br>
    圆的面积：<%=request.getAttribute("outputArea")%><br>
    <br>
    <a href="javascript:history.go(-1);">返回</a>
</div>
</body>
</html>
