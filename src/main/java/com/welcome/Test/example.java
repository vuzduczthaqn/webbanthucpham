package com.welcome.Test;

import com.welcome.DAO.IMethodDAO;
import com.welcome.DAO.Impl.CartDAO;
import com.welcome.Model.Cart;
import com.welcome.Model.Product;
import com.welcome.Ultil.HibernateUtil;
import jakarta.persistence.Query;
import jakarta.persistence.StoredProcedureQuery;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Named("aaa")
public class example {
    public static void main(String[] args) {
        List<Cart> cartList=new ArrayList<>();
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
            try {
                session.beginTransaction();
                Query query=session.createQuery("from Cart where customer.customerId=:customerId");
                query.setParameter("customerId",Integer.parseInt("1"));
                cartList=query.getResultList();
                session.getTransaction().commit();
            }catch (Exception e){
                session.getTransaction().rollback();
                e.printStackTrace();
            }
        }
        cartList.forEach(e-> System.out.println(e.getProduct().getProductName()));
    }
}
