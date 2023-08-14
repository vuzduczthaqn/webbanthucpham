package com.welcome.DAO;

import com.welcome.DAO.IMethodDAO;
import com.welcome.Model.Cart;

import java.util.List;

public interface ICartDAO extends IMethodDAO<Cart> {
    @Override
    void insert(Cart cart);

    @Override
    int delete(String sql, Cart cart);

    @Override
    int update(String sql, Cart cart);

    List<Cart> getList();
    public List<Cart> getByCondition(String condition);
}
