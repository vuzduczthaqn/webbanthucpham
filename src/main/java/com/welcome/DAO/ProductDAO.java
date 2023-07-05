package com.welcome.DAO;

import com.welcome.Model.Product;
import com.welcome.Ultil.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends AbstractDAO<Product>{
        public List<Product> getList(){
            List<Product> productList=new ArrayList<>();
            try(Session session= HibernateUtil.getSessionFactory().openSession();) {
                session.getTransaction().begin();
                Query query=session.createQuery("from Product ");
                productList=query.getResultList();
                session.getTransaction().commit();
            }catch (HibernateException he){
                he.printStackTrace();
            }
            return productList;
    }
}
