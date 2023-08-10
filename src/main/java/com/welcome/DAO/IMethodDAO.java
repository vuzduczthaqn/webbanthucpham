package com.welcome.DAO;

import com.welcome.Model.Product;

import java.util.List;
import com.welcome.Model.Product;

public interface IMethodDAO <T>{
    public void insert(T t);
    public int delete(String sql,T t);
    public int update(String sql,T t);
    public List<T> getList();
    public T getSingle();
}
