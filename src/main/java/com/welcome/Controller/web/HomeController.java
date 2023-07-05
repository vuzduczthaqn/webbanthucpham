package com.welcome.Controller.web;

import com.welcome.DAO.ProductDAO;
import com.welcome.DAO.UserDAO;
import com.welcome.Model.Product;
import com.welcome.Model.User;
import com.welcome.Ultil.FormUtil;
import com.welcome.Ultil.SesionUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/trang-chu", "/dang-nhap","/thoat"})
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd;
        String action = req.getParameter("action");
        if (action != null && action.equalsIgnoreCase("login")) {
            rd = req.getRequestDispatcher("/views/Login.jsp");
            rd.forward(req, resp);
        } else if (action != null && action.equalsIgnoreCase("logout")) {
           SesionUtil.getInstance().removeValue(req,"USER");
            resp.sendRedirect(req.getContextPath()+"/trang-chu");
        } else if (action != null && action.equalsIgnoreCase("cart")) {
            rd=req.getRequestDispatcher("/views/web/Cart.jsp");
    } else {
            List<Product> productList=new ProductDAO().getList();
            req.setAttribute("listProduct",productList);
            rd = req.getRequestDispatcher("/views/web/home.jsp");
            rd.forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equalsIgnoreCase("login")) {
            User user = new User();
            user.setPassword(req.getParameter("txtPass"));
            user.setUsername(req.getParameter("txtUser"));
            UserDAO userDAO = new UserDAO();
            boolean check = userDAO.Login(user);
            if (check) {
                SesionUtil.getInstance().putValue(req, "USER", user);
                resp.sendRedirect(req.getContextPath() + "/trang-chu");
            } else {
                resp.sendRedirect(req.getContextPath() + "/dang-nhap?action=login");
            }
        }
    }

}
