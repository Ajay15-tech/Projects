package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FormServlet")  // URL Mapping
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");
        
        // Display response
        out.println("<html><body>");
        out.println("<h2>Thank You for Your Submission!</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Message:</strong> " + message + "</p>");
        out.println("</body></html>");
    }
}
