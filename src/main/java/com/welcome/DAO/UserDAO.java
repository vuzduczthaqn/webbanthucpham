package com.welcome.DAO;

import com.welcome.Ultil.HibernateUtil;
import com.welcome.Model.User;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserDAO {
    public boolean Login(User user) {
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            if (sessionFactory != null) {
                try( Session session = sessionFactory.openSession()) {

                    Query query = session.createQuery("from User where username=:user and password=:pass");
                    query.setParameter("user",user.getUsername());
                    query.setParameter("pass",user.getPassword());
                    try {
                        List<User> list=query.getResultList();
                        if(list.isEmpty()){
                            return false;
                        }else {
                            return true;
                        }
                    } catch (NoResultException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (HibernateError he) {
            System.out.println(he);
        }
        return false;
    }
}
