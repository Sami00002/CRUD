package org.example;

interface Repository<T> {
    void add(T item);
    T get(int id);
    void update(T item);
    void delete(int id);
}