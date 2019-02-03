package ru.kugurakova;

public interface IntegerList {
    void addToEnd (int value);
    void addToBegin(int element);// добавление в начало
    int get(int index); // получить элемент по индексу
    void insert(int element, int index); // вставить по индексу со сдвигом
    int getCount(); // количество элементов
//    void reverse(); // перевернуть
//    void sort(); // сортировка
    boolean contains(int element); // возвращает true, если список содержит заданный элемент
    int indexOf(int element);  // возвращает индекс элемента, если он есть в списке, -1 - если не нашел ничего
    void remove(int index); //удаление по индексу
    void print();
}
