package com.welcome.DAO.Impl;

import com.welcome.DAO.IProductDAO;
import com.welcome.DAO.MethodDAO;
import com.welcome.Model.Product;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("ProductDAO")
public class ProductDAO implements IProductDAO {
    @Inject
    private MethodDAO<Product> querrySql;


    @Override
    public Product getSingle(String id) {
        try (Session session = querrySql.getSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                Query query = session.createQuery("FROM Product where productId=:id");
                query.setParameter("id",id);
                List<Product> productList=query.getResultList();
                if(!productList.isEmpty()){
                    return productList.get(0);
                }
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Product product) {
    }

    @Override
    public List<Product> getList(int start) {
        List<Product> list = new ArrayList<>();
        try (Session session = querrySql.getSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                Query query = session.createQuery("FROM Product");
                query.setFirstResult(start);
                query.setMaxResults(4);
                list =query.getResultList();
                transaction.commit();
            } catch (Exception e) {
                transaction.rollback();
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
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
