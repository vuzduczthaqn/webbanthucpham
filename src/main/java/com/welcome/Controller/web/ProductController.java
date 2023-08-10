package com.welcome.Controller.web;

import com.welcome.Model.Product;
import com.welcome.Service.ProductService;
import com.welcome.constant.SystemConstant;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@WebServlet("/chi-tiet-san-pham")
public class ProductController extends HttpServlet {
    @Inject
    private ProductService productService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ProductId=req.getParameter("id");
        try {
            List<Product> list= getListProduct(req.getCookies(),ProductId);
            req.setAttribute(SystemConstant.PRODUCT,productService.getProductFromList(list,ProductId));
            req.getRequestDispatcher("/views/web/ProductDetail.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private List<Product> getListProduct(Cookie[] cookies, String attribute){
        Optional optional= Stream.of(cookies).filter(e->attribute.equalsIgnoreCase(e.getName())).map(Cookie::getValue).findFirst();
        return (List<Product>) optional.get();
    }
}