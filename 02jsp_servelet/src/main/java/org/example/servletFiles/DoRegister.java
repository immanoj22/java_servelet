package org.example.servletFiles;
import java.io.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;

@WebServlet("/register")
public class DoRegister extends HttpServlet{

    protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
//
//        PrintWriter writeer=res.getWriter();
//        writeer.println("hi mate "+name);
//        writeer.println("you email "+email);
//
//        writeer.close();
        System.out.println(req.getContextPath());
        res.sendRedirect(req.getContextPath()+"/Register/welcome.jsp");
    }
}
