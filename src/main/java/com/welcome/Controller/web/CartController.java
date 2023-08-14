package com.welcome.Controller.web;

import com.welcome.DTO.CartDTO;
import com.welcome.Model.Customer;
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
        Customer customer= (Customer) SesionUtil.getInstance().getValue(req,SystemConstant.USER);
            List<CartDTO> list=cartService.getCart(customer.getCustomerId()+"");
            float paymenttotal=0;
            for (CartDTO cartDTO:list)
                paymenttotal+=(float) (cartDTO.getQuantity().floatValue()*cartDTO.getPrice().floatValue());
            req.setAttribute("listProduct",list);
            req.setAttribute("paymenttotal",paymenttotal);
            req.getRequestDispatcher("/views/web/Cart.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String id=req.getParameter("idProduct");
            int quantity= Integer.parseInt(req.getParameter("quantity").trim());
            Customer customer= (Customer) SesionUtil.getInstance().getValue(req,SystemConstant.USER);
            cartService.insertProduct(customer,id,quantity);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
