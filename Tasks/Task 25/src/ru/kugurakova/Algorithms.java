package ru.kugurakova;

import java.util.Comparator;

public class Algorithms {

    public static <T extends Comparable<T>> void sort(ArrayList<T> list) {
        sort0(list, null);
    }

    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        sort0(list, comparator);
    }

    private static <T> void sort0(ArrayList<T> list, Comparator<T> comparator) {
        int N = list.count;
        Object elements[] = list.lines;
        // бежим по элементам с конца в начало
        for (int i = N - 1; i >= 0; i--) {
            // для каждого шага i пробегаем все элементы
            // от начала до i
            for (int j = 0; j < i; j++) {
                // сравниваем объект
                // elements[j] с объектом elements[j+1]
                int compareResult = 0;
                if (comparator == null) {
                    compareResult = ((Comparable<T>) elements[j]).compareTo((T) elements[j + 1]);
                } else {
                    compareResult = comparator.compare((T) elements[j], (T) elements[j + 1]);
                }
                if (compareResult > 0) {
                    T temp = (T) elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(LinkedList<T> list) {
        sort1(list, null);
    }

    public static <T> void sort(LinkedList<T> list, Comparator<T> comparator) {
        sort1(list, comparator);
    }

    private static <T> void sort1(LinkedList<T> list, Comparator<T> comparator) {
        int index;
        T newvalue;
        T oldvalue;
        if (list.getCount() > 1) {
            Node current;
            Node update = list.getTop();
            index = 0;
            for (int j = 1; j < list.getCount(); j++) {
                current = update;
                newvalue = (T) current.getValue();
                for (int i = j; i < list.getCount(); i++) {
                    current = current.getNext();
                    int compareResult = 0;
                    if (comparator == null) {
                        compareResult = ((Comparable<T>) newvalue).compareTo((T) current.getValue()); }
                    else {
                        compareResult = comparator.compare(newvalue,(T) current.getValue());
                    }
                    if (compareResult > 0) {
                        index = i;
                        newvalue = (T) current.getValue();
                    }
                }
                int lastResult = 0;
                if (comparator == null) {
                    lastResult = ((Comparable<T>) newvalue).compareTo((T) update.getValue()); }
                else {
                    lastResult = comparator.compare(newvalue,(T) update.getValue());
                }
                if (lastResult != 0 ){
                    oldvalue = (T) update.getValue();
                    update.setValue(newvalue);
                    list.update(oldvalue, index);
                }
                update = update.getNext();
            }
        }

    }

}
