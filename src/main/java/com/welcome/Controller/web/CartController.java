package com.welcome.Controller.web;

import com.welcome.DTO.CartDTO;
import com.welcome.Model.Product;
import com.welcome.Model.User;
import com.welcome.Service.CartService;
import com.welcome.Ultil.SesionUtil;
import com.welcome.constant.SystemConstant;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/gio-hang")
public class CartController extends HttpServlet {
    @Inject
    private CartService cartService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user= (User) SesionUtil.getInstance().getValue(req,SystemConstant.USER);
        if(true) {
            List<CartDTO> list=cartService.getCart("123");
            CartDTO cartDTO=new CartDTO();
            cartDTO.setPayment(1000.0);
            cartDTO.setPathImg("aaaaaaaa");
            cartDTO.setProductId(123);
            cartDTO.setProductName("san pham 1");
            cartDTO.setPrice(10000.0);
            cartDTO.setQuantity(9);
            list.add(cartDTO);
            req.setAttribute("listProduct",list);
            req.getRequestDispatcher("/views/web/Cart.jsp").forward(req, resp);
        }
        else{
            req.getRequestDispatcher("dang-nhap?action=login").forward(req,resp);
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
