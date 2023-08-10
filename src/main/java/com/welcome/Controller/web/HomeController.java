package com.welcome.Controller.web;

import com.welcome.DAO.IMethodDAO;
import com.welcome.DAO.IProductDAO;
import com.welcome.DAO.Impl.UserDAO;
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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
            productService.getListProduct();
            List<Product> list=new ArrayList<>();
            Product product=new Product();
            product.setProductId(123);
            product.setPrice(12000.0);
            product.setProductName("san pham 01");
            product.setPathImg("aaaaaa");
            product.setDescribe("Product product=new Product();\n" +
                    "            product.setProductId(123);\n" +
                    "            product.setPrice(12000.0);\n" +
                    "            product.setProductName(\"san pham 01\");\n" +
                    "            product.setPathImg(\"aaaaaa\");");
            list.add(product);
            Cookie cookie=new Cookie("listProduct",list.toString());
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
                SesionUtil.getInstance().putValue(req, SystemConstant.USER, user);
                resp.sendRedirect(req.getContextPath() + "/trang-chu");
            } else {
                resp.sendRedirect(req.getContextPath() + "/dang-nhap?action=login");
            }
        }
    }

}
