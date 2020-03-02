<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生管理系统</title>
</head>
<body>
   <table>
          <tr>
              <th>姓名</th>
          
              <th>学号</th>
          
              <th>性别</th>
         
              <th>年龄</th>
          </tr>
      <c:forEach items="${list }" var="li">
          <tr>
              <td>{li.getSname()}</td>
              <td>{li.getSnumber()}</td>
              <td>{li.getSsex()}</td>
              <td>{li.getSage()}</td>
          </tr>
      </c:forEach>
   </table>
</body>
</html>