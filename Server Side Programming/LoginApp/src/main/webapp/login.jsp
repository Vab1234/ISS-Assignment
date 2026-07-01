<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login System</title>
</head>
<body>
    <h2>User Login</h2>
    
    <% 
        String error = (String) request.getAttribute("errorMessage");
        if(error != null) { 
    %>
        <p style="color:red; font-weight:bold;"><%= error %></p>
    <% } %>

    <form action="login" method="POST" onsubmit="return validateLogin()">
        <label>Username:</label>
        <input type="text" id="user" name="username"><br><br>
        
        <label>Password:</label>
        <input type="password" id="pass" name="password"><br><br>
        
        <button type="submit">Login</button>
    </form>
    
    <p>New user? <a href="register.jsp">Register here</a></p>

    <script>
        function validateLogin() {
            let u = document.getElementById("user").value;
            let p = document.getElementById("pass").value;
            if (u.trim() === "" || p.trim() === "") {
                alert("Username and Password cannot be empty!");
                return false; // Stops form from submitting
            }
            return true;
        }
    </script>
</body>
</html>