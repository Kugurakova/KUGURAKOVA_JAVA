package ru.kugurakova;

public interface List<V> {
    void add(V element);// добавление в начало
    void addToBegin(V element); // добавление в начало
    V get(int index); // получить элемент по индексу
    void insert(V element, int index); // вставить по индексу со сдвигом
    int getCount(); // количество элементов
    void reverse(); // перевернуть
//    void sort(); // сортировка
//    boolean contains(V element); // возвращает true, если список содержит заданный элемент
//    int indexOf(V element);  // возвращает индекс элемента, если он есть в списке, -1 - если не нашел ничего
//    void remove(int index); //удаление по индексу

}
