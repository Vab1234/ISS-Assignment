<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <%
        if(session.getAttribute("activeUser") == null) {
            response.sendRedirect("login.jsp");
            return;
        }
    %>
    
    <h1 style="color:green;">Welcome, <%= session.getAttribute("activeUser") %>!</h1>
    <p>You have successfully logged in.</p>
    
    <form action="logout" method="GET">
        <button type="submit">Logout</button>
    </form>
</body>
</html>