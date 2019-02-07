package ru.kugurakova;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        IntegerLinkedList list1 = new IntegerLinkedList();
        list1.addToEnd(1);
        list1.addToEnd(2);
        list1.addToEnd(3);
        list1.addToEnd(5);
        list1.addToBegin(7);
        list1.addToBegin(11);
        list1.addToBegin(13);
        list1.addToBegin(17);
        list1.print();
        System.out.println("index[0] - "+list1.get(0));
        System.out.println("index[3] - "+list1.get(3));
        System.out.println("Добавление элемента (19) по индексу(2) со сдвигом");
        list1.insert(19,2);
        list1.print();
        System.out.println("Удаление по индексу(3) ");
        list1.remove(3);
        list1.print();
        System.out.println("кол-во: "+list1.getCount());
        System.out.println("contains(19) - "+list1.contains(19));
        System.out.println("indexOf(19) - "+list1.indexOf(19));
        System.out.println("contains(23) - "+list1.contains(23));
        System.out.println("indexOf(23) - "+list1.indexOf(23));
        list1.print();
        System.out.println("Отсортированный");
        list1.sort();
        list1.print();
        list1.addToEnd(21);
        System.out.println("Перевернутый");
        list1.reverse();
        list1.print();
    }
}
