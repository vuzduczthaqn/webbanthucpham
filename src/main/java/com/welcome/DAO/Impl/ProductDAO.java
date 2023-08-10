package com.welcome.DAO.Impl;

import com.welcome.DAO.MethodDAO;
import com.welcome.DAO.IProductDAO;
import com.welcome.Model.Product;
import com.welcome.constant.SystemConstant;
import org.hibernate.HibernateException;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("ProductDAO")
public class ProductDAO implements IProductDAO {
    @Inject
    private MethodDAO<Product> querrySql;

    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();
        try {
            productList = querrySql.querryList(SystemConstant.PRODUCT);
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product getSingle() {
        return null;
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public int delete(String sql, Product product) {
        return 0;
    }

    @Override
    public int update(String sql, Product product) {
        return 0;
    }

}
