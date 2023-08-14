package com.welcome.Controller.web;

import com.welcome.Model.Product;
import com.welcome.Service.ProductService;
import com.welcome.Ultil.SesionUtil;
import com.welcome.constant.SystemConstant;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
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
            Product product=productService.getProduct(ProductId);
            req.setAttribute(SystemConstant.PRODUCT,product);
            req.getRequestDispatcher("/views/web/ProductDetail.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
