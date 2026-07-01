<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register New Account</title>
</head>
<body>
    <h2>Register</h2>
    <form action="register" method="POST" onsubmit="return validateRegister()">
        <label>Choose Username:</label>
        <input type="text" id="regUser" name="username"><br><br>
        
        <label>Choose Password:</label>
        <input type="password" id="regPass" name="password"><br><br>
        
        <button type="submit">Sign Up</button>
    </form>
    
    <p>Already have an account? <a href="login.jsp">Login here</a></p>

    <script>
        function validateRegister() {
            let u = document.getElementById("regUser").value;
            let p = document.getElementById("regPass").value;
            if (u.trim() === "" || p.trim() === "") {
                alert("Please fill out all registration fields.");
                return false;
            }
            if (p.length < 4) {
                alert("Password must be at least 4 characters long.");
                return false;
            }
            return true;
        }
    </script>
</body>
</html>