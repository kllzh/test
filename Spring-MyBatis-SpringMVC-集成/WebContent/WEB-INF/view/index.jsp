<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
         <table border="1" cellspacing="0">         
         <tr>
         <th>id</th>
         <th>用户名</th>
         <th>年龄</th>
         <th>部门id</th>
         <th>操作</th>
         </tr>
         
         <c:forEach items="${list}" var="item">
         
         <tr>
         <td>${item.id}</td>
         <td>${item.username}</td>
         <td>${item.age}</td>
         <td>${item.dept_id}</td>
         <td>
        <%--<a href="<%=request.getContextPath()%>/user/delete.do?id=${item.id}">删除</a> --%>
         
         <!-- 在网页编程中，一般让一个超链接点击后不链接到任何地方，而鼠标移上去仍然显示手指形状的图标，
                            就用javascript:void(0)，然后真实执行的操作，
                            是在这个a标签后面加onclick="xxxxx"，就是鼠标单击后执行某个Javascript函数进行具体的操作，这样可以做更多的事情，
                            比如根据某个值进行判断跳转到不同的页面等等。 -->
         <a href="javascript:void(1);" onclick="update(${item.id})">删除</a>
         <a href="#">修改</a>
         </td>        
         </tr>
         
         </c:forEach>
         
         </table>
         
        <script type="text/javascript">
        /*
                如果用户点击确定按钮，则 confirm() 返回 true。如果点击取消按钮，则 confirm() 返回 false。
		在用户点击确定按钮或取消按钮把对话框关闭之前，它将阻止用户对浏览器的所有输入。在调用 confirm() 时，
		将暂停对 JavaScript 代码的执行，在用户作出响应之前，不会执行下一条语句。
		        */
            function update(id){
				if (confirm("亲：你是否要删除此信息")) {
			location.href="<%=request.getContextPath()%>/user/delete.do?id="+id
				}
			}
           
      </script> 
</body>
        
</html>