package com.welcome.Controller.web.api;

import com.welcome.Model.Product;
import com.welcome.Service.ProductService;
import com.welcome.Ultil.SesionUtil;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(urlPatterns = {"/api-load"})
public class APILoadMoreProduct extends HttpServlet {
    @Inject
    private ProductService productService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        int start= (int) SesionUtil.getInstance().getValue(req,"start")+4;
        SesionUtil.getInstance().putValue(req,"start",start);
        List<Product> list =productService.getListProduct(start);
        for(Product product:list) {
            out.println(
                    "            <form method=\"get\" action=\"chi-tiet-san-pham?id="+product.getProductId()+"\">\n" +
                            "                <div class=\"col-lg-3 col-md-4 col-sm-6 mix oranges fresh-meat\">\n" +
                            "                    <div class=\"featured__item\">\n" +
                            "                        <div class=\"featured__item__pic set-bg\"\n" +
                            "                             data-setbg=\""+"/demoweb_war"+product.getPathImg()+"\"\n" +
                            "style=\"background-image: url(&quot;"+"/demoweb_war"+product.getPathImg()+"&quot;);\">"+
                            "                        </div>\n" +
                            "                        <div class=\"featured__item__text\">\n" +
                            "                            <h6><a href=\"chi-tiet-san-pham?id="+product.getProductId()+"\">"+product.getProductName()+"</a></h6>\n" +
                            "                            <h5>"+product.getPrice()+"</h5>\n" +
                            "                        </div>\n" +
                            "                    </div>\n" +
                            "                </div>\n" +
                            "            </form>\n");
        }
        out.close();
    }
}
