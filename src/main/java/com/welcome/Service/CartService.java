package com.welcome.Service;

import com.welcome.DAO.ICartDAO;
import com.welcome.DAO.IProductDAO;
import com.welcome.DTO.CartDTO;
import com.welcome.Model.Cart;
import com.welcome.Model.Product;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class CartService {
    @Inject
    private ICartDAO cartDAO;
    @Inject
    private IProductDAO productDAO;
    public List<CartDTO> getCart(String userId){
        List<Cart> cartList=cartDAO.getByCondition(userId);
        List<CartDTO> cartDTOList=new ArrayList<>();
        if (cartDTOList.isEmpty()==false)
        cartList.forEach(e->{
            CartDTO cartDTO=new CartDTO();
            cartDTO.setPayment(e.getPayment());
            Product pro=e.getProduct();
            cartDTO.setPathImg(pro.getPathImg());
            cartDTO.setProductId(pro.getProductId());
            cartDTO.setProductName(pro.getProductName());
            cartDTO.setPrice(pro.getPrice());
            cartDTO.setQuantity(e.getQuantity());
            cartDTOList.add(cartDTO);
        });
        return cartDTOList;
    }
}
