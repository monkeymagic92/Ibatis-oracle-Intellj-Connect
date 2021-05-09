<%--
  Created by IntelliJ IDEA.
  User: Jaee
  Date: 2021-05-09
  Time: 오후 2:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${list}" var="item">
    <div>${item.i_board}</div>
    <div>${item.title}</div>
</c:forEach>
</body>
</html>