package com.welcome.DAO;

import com.welcome.Ultil.HibernateUtil;
import com.welcome.Ultil.HttpUtil;
import jakarta.persistence.Query;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AbstractDAO<T> implements IMethodDAO {
    private Session session;
    public Transaction transaction;
    public AbstractDAO(){
        session= HibernateUtil.getSessionFactory().openSession();
        transaction=session.getTransaction();
    }
    @Override
    public void insert(Object o) {
        try {
            transaction.begin();
            session.persist(o);
            transaction.commit();
        }catch (HibernateException he){
            transaction.rollback();
            he.printStackTrace();
        }

    }
    public static void setParameter(Query query,Object obj){
        try {
            query.setParameter(1,obj.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int delete(String sql,Object o) {
        try {
            transaction.begin();
            Query query=session.createQuery(sql);
            setParameter(query,o);
            int rowEffect= query.executeUpdate();
            transaction.commit();
            return rowEffect;
        }catch (HibernateException he){
            transaction.rollback();
            he.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(String sql,Object o) {
        return 0;
    }
}
