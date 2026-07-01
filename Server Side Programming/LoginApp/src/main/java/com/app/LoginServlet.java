package com.app;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String u = request.getParameter("username");
        String p = request.getParameter("password");
        
        // Check if the user exists and the password matches
        if (MockDatabase.users.containsKey(u) && MockDatabase.users.get(u).equals(p)) {
            
            // SUCCESS! Create a session to remember they are logged in
            HttpSession session = request.getSession();
            session.setAttribute("activeUser", u);
            response.sendRedirect("welcome.jsp");
            
        } else {
            // FAILURE! Send an error message back to the login page
            request.setAttribute("errorMessage", "Incorrect Username or Password!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}