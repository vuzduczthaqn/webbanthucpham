package com.welcome.DAO.Impl;

import com.welcome.DAO.IMethodDAO;
import com.welcome.Model.Producer;

import java.util.List;

public class ProducerDAO implements IMethodDAO<Producer> {
    @Override
    public void insert(Producer producer) {

    }

    @Override
    public int delete(String sql, Producer producer) {
        return 0;
    }

    @Override
    public int update(String sql, Producer producer) {
        return 0;
    }

    @Override
    public List<Producer> getList() {
        return null;
    }

    @Override
    public Producer getSingle() {
        return null;
    }
}
