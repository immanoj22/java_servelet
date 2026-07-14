package org.example.requestDispatcher;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter writer=res.getWriter();
        HttpSession session=req.getSession();

        writer.println("<h1>from second servlet " + session.getAttribute("name")+ "</h1>");
        writer.close();
        System.out.println("from second servlet");
    }
}
