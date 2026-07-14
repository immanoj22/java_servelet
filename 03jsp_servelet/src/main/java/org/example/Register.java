package org.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hooks.db.InsertData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/register_user")
public class Register extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        String city=req.getParameter("city");

        InsertData insertnewuser=new InsertData();
        boolean status=insertnewuser.InsertNewUser(name,city,age);

//        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5));
//        List<Integer>list1=list.stream().map(x->x*2).filter(x->x%2==0).toList();
        if(status){
            res.sendRedirect(req.getContextPath()+"/status/success.jsp");
        }else{
            res.sendRedirect(req.getContextPath()+"/status/failed.jsp");
        }
    }
}
