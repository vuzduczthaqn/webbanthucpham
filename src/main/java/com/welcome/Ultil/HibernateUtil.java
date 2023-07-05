package com.welcome.Ultil;

import org.hibernate.HibernateError;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private final static SessionFactory sessionFactory=buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure().buildSessionFactory();
        }catch (HibernateError he){
            System.out.println(he);
        }
        return null;
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void SessionClose(){
        getSessionFactory().close();
    }
}
