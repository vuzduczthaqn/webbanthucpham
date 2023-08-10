package com.welcome.DAO.Impl;

import com.welcome.DAO.MethodDAO;
import com.welcome.Model.Bill;

import javax.inject.Inject;

public class BillDAO{
    @Inject
    private MethodDAO<Bill> querrySql;
}
