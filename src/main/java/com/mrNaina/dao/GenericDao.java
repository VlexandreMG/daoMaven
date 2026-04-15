package com.mrNaina.dao;

public interface GenericDao<T> {
    void save(T entity);
    T findById(Class<T> clazz, int id);
}
