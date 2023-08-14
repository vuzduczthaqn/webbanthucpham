package com.welcome.DAO.Impl;

import com.welcome.DAO.MethodDAO;
import com.welcome.DAO.ICartDAO;
import com.welcome.Model.Cart;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class CartDAO implements ICartDAO {
    @Inject
    private MethodDAO<Cart> methodDAO;

    @Override
    public void insert(Cart cart) {
        try(Session session=methodDAO.getSession()) {
            try {
                session.beginTransaction();
                session.persist(cart);
                session.getTransaction().commit();
            }catch (Exception e){
                session.getTransaction().rollback();
                e.printStackTrace();
            }
        }
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
    public List<Cart> getList(int start) {
        return null;
    }

    @Override
    public Cart getSingle(String id) {
        return null;
    }

    @Override
    public List<Cart> getList() {
        return null;
    }
    @Override
    public List<Cart> getByCondition(String condition) {
        List<Cart> cartList=new ArrayList<>();
        try(Session session= methodDAO.getSession()){
        try {
            session.beginTransaction();
            Query query=session.createQuery("from Cart where customer.customerId=:customerId");
            query.setParameter("customerId",Integer.parseInt(condition.trim()));
            cartList=query.getResultList();
            session.getTransaction().commit();
        }catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        }
        return cartList;
    }
}
