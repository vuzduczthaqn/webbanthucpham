package com.welcome.Controller.web;

import com.welcome.DAO.IMethodDAO;
import com.welcome.DAO.IProductDAO;
import com.welcome.DAO.Impl.UserDAO;
import com.welcome.Model.Customer;
import com.welcome.Model.Product;
import com.welcome.Model.User;
import com.welcome.Service.ProductService;
import com.welcome.Ultil.SesionUtil;
import com.welcome.constant.SystemConstant;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/trang-chu", "/dang-nhap", "/thoat"})
public class HomeController extends HttpServlet {
    @Inject
    private ProductService productService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd;
        String action = req.getParameter("action");
        if (action != null && action.equalsIgnoreCase("login")) {
            rd = req.getRequestDispatcher("/views/Login.jsp");
            rd.forward(req, resp);
        } else if (action != null && action.equalsIgnoreCase("logout")) {
            SesionUtil.getInstance().removeValue(req, SystemConstant.USER);
            resp.sendRedirect(req.getContextPath() + "/trang-chu");
        } else {
            int start=1;
            List<Product> list =productService.getListProduct(start);
            SesionUtil.getInstance().putValue(req,"start",start);
            SesionUtil.getInstance().putValue(req,"listProduct",list);
            list.forEach(e-> System.out.println(e.getProductName()));
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
            user = userDAO.Login(user);
            if (user!=null) {
                SesionUtil.getInstance().putValue(req, SystemConstant.USER, user.getCustomer());
                System.out.println((user.getCustomer().getCustomerName()));
                resp.sendRedirect(req.getContextPath() + "/trang-chu");
            } else {
                resp.sendRedirect(req.getContextPath() + "/dang-nhap?action=login");
            }
        }
    }

}
