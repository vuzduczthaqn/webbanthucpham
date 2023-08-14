package com.welcome.DAO;

import com.welcome.Ultil.HibernateUtil;
import lombok.NonNull;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MethodDAO<T> {
    private Session session;
    private Transaction transaction;

    public Session getSession() {
        return HibernateUtil.getSessionFactory().openSession();
    }

    public void QuerryInsert(T t) {
//        try {
//            transaction.begin();
//            session.persist(t);
//            transaction.commit();
//        }catch (Exception e){
//            transaction.rollback();
//        }finally {
//            session.close();
//        }

    }

    public List<T> querryList(String name) {
        try {
            session=HibernateUtil.getSessionFactory().openSession();
            transaction.begin();
            return (List<T>) session.createQuery("from " + name);
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
            return null;
        }
    }
}
