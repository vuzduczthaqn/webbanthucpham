package com.welcome.Controller.admins;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/admin-trangchu"})
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd=req.getRequestDispatcher("/decorators/web.jsp");
        rd.forward(req,resp);
//        String user=req.getParameter("txtUser");
//        String pass=req.getParameter("txtPass");
//        UserDAO checkLogin=new UserDAO();
//        boolean check=checkLogin.Login(user,pass);
//
//        if(check){
//            rd = req.getRequestDispatcher("/decorators/web.jsp");
//        }
//        else{
//            rd = req.getRequestDispatcher("/views/web/home.jsp");
//        }
//        rd.forward(req,resp);
    }
}
