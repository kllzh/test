<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>    
   <h1>登陆页面</h1>
   <span style="color: red;">${login}</span>
   <span style="color: red;">${loginNO}</span> 
          <fieldset>
             <form action="<%=request.getContextPath()%>/user/login.do">
             用户：         <input type="text" name="username"><br>
             密码：         <input type="password" name="password"><br>
                <input type="submit" value="提交"/>
             </form>
          </fieldset>
</body>
</html>