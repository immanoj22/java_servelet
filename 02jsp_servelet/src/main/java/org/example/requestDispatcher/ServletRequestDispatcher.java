package org.example.requestDispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstServlet")
public class ServletRequestDispatcher extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher=request.getRequestDispatcher("/secondServlet");
        System.out.println("disptached");
//        dispatcher.forward(request,response);
        dispatcher.include(request,response);
        System.out.println("writeing respone");
        PrintWriter writer=response.getWriter();
        writer.println("<h1>from servlet one</h1>");
        writer.close();
        System.out.println("back again");
    }
}
