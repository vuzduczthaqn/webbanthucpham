package com.welcome.Test;

import com.welcome.DAO.IMethodDAO;
import com.welcome.DAO.Impl.CartDAO;
import com.welcome.Model.Product;
import com.welcome.Ultil.HibernateUtil;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
@Named("aaa")
public class example {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
    }
}
