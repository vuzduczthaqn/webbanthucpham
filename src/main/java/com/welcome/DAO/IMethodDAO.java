package com.welcome.DAO;

public interface IMethodDAO <T>{
    public void insert(T t);
    public int delete(String sql,T t);
    public int update(String sql,Object o);
}
