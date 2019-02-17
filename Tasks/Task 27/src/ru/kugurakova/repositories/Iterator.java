package ru.kugurakova.repositories;

public interface Iterator<V> {
    boolean hasNext();
    V next();
}