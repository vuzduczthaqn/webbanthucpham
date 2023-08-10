package com.welcome.DAO.Impl;

import com.welcome.DAO.MethodDAO;
import com.welcome.DAO.ICartDAO;
import com.welcome.Model.Cart;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import javax.inject.Inject;
import java.util.List;

public class CartDAO implements ICartDAO {
    @Inject
    private MethodDAO<Cart> methodDAO;

    @Override
    public void insert(Cart cart) {

    }

    @Override
    public int delete(String sql, Cart cart) {
        return 0;
    }

    @Override
    public int update(String sql, Cart cart) {
        return 0;
    }

    @Override
    public List<Cart> getList() {
        return null;
    }

    @Override
    public Cart getSingle() {
        return null;
    }

    @Override
    public List<Cart> getByCondition(String condition) {
        Session session=null;
        try {
            session=methodDAO.getSession();
            session.beginTransaction();
            Query query=session.createQuery("from Cart where customer.customerId=:customerId");
            query.setParameter("customerId",Integer.parseInt(condition.trim()));
            List<Cart> cartList=query.getResultList();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }finally {
        }
        return null;
    }
}
