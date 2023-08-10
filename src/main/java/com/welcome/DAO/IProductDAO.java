package com.welcome.DAO;

import com.welcome.Model.Product;

import java.util.List;

public interface IProductDAO extends IMethodDAO<Product> {
    @Override
    void insert(Product product);

    @Override
    int delete(String sql, Product product);

    @Override
    int update(String sql, Product product);

    @Override
    List<Product> getList();

    @Override
    Product getSingle();
}
