package com.app;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String u = request.getParameter("username");
        String p = request.getParameter("password");
        
        // Save the new user into our temporary memory database
        MockDatabase.users.put(u, p);
        
        // Send them straight back to the login page to try it out
        response.sendRedirect("login.jsp");
    }
}