package org.example.httpSession;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/httpSessionExample")
public class HttpSessionExample extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session=req.getSession();
        session.setAttribute("name",req.getParameter("name"));
        session.setAttribute("email",req.getParameter("email"));
        RequestDispatcher disptahc=req.getRequestDispatcher("/firstServlet");
        disptahc.forward(req,res);
    }
}
