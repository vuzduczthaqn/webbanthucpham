package com.welcome.Service;

import com.welcome.DAO.ICartDAO;
import com.welcome.DAO.IProductDAO;
import com.welcome.DAO.Impl.UserDAO;
import com.welcome.DTO.CartDTO;
import com.welcome.Model.Cart;
import com.welcome.Model.Customer;
import com.welcome.Model.Product;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class CartService {
    @Inject
    private ICartDAO cartDAO;
    @Inject
    private IProductDAO productDAO;
    @Inject
    private UserDAO userDAO;

    public List<CartDTO> getCart(String userId) {
        List<Cart> cartList = cartDAO.getByCondition(userId);
        List<CartDTO> cartDTOList = new ArrayList<>();
        if (cartList.isEmpty() == false)
            cartList.forEach(e -> {
                CartDTO cartDTO = new CartDTO();
                cartDTO.setPayment(e.getPayment());
                Product pro = e.getProduct();
                cartDTO.setPathImg(pro.getPathImg());
                cartDTO.setProductId(pro.getProductId());
                cartDTO.setProductName(pro.getProductName());
                cartDTO.setPrice(pro.getPrice());
                cartDTO.setQuantity(e.getQuantity());
                cartDTOList.add(cartDTO);
            });
        return cartDTOList;
    }

    public void insertProduct(Customer customer, String id, int quantity) {
        Cart cart = new Cart();
        cart.setCustomer(customer);
        cart.setProduct(productDAO.getSingle(id));
        cart.setQuantity(quantity);
        cartDAO.insert(cart);
    }
}
