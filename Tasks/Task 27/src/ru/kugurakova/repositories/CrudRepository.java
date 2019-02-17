package ru.kugurakova.repositories;

public interface CrudRepository<T> {
    void save(T model);
    T find(int id);
}
