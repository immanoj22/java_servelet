package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.RegisterModel;

import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res){
        String name=req.getParameter("name");
        String city=req.getParameter("city");
        int age=Integer.parseInt(req.getParameter("age"));

        RegisterModel user=new RegisterModel();

        user.setUserCity(city);
        user.setAge(age);
        user.setUserName(name);
        user.setUsernameId(8);

        boolean status=user.registerUser();

        req.setAttribute("name",name);

        try{
            if(status){
                req.getRequestDispatcher("/RegistrationStatus/success.jsp")
                        .forward(req, res);
            }else{
                req.getRequestDispatcher("/RegistrationStatus/failed.jsp")
                        .forward(req, res);
            }
        }catch (IOException exception){
           exception.printStackTrace();
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }
}
