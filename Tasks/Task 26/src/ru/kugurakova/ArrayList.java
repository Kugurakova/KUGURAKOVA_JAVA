package ru.kugurakova;

public class ArrayList<T> implements List<T> {
    final int MAX_SIZE = 10;
    T lines[];
    int count;

    public ArrayList() {
        this.lines = (T[])new Object[MAX_SIZE];
        this.count = 0;
    }

    public void add(T line) {
        this.lines[count] = line;
        this.count++;
    }
    public int getCount(){
        return count;
    }

    public void addToBegin(T element){// добавление в начало
        T pold;
        T pnew = element;
//        insert(element, 0);
        for (int i = 0; i <= count; i++) {
            pold = this.lines[i];
            this.lines[i] =pnew;
            pnew = pold;
        }
        count++;
    }

    public void insert(T element, int index){ // вставить по индексу со сдвигом
        T pold;
        T pnew = element;
        for (int i = index; i <= count; i++) {
            pold = this.lines[i];
            this.lines[i] =pnew;
            pnew = pold;
        }
        count++;
    }

    public T get(int index){ // получить элемент по индексу
        return this.lines[index];
    }

    public void reverse() {
        int position = count;
        T per;
        for (int i = 0; i*2 < count ; i++) {
            per = this.lines[i];
            this.lines[i]=this.lines[position-1];
            this.lines[position-1]=per;
            position=position-1;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(this.lines[i] + " ");
        }
        System.out.println();
    }

    private class ArrayListIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index != count;
        }

        @Override
        public T next() {
            T value = (T) get(index);
            index++;
            return value;
        }
    }

    public Iterator iterator() {
        return new ArrayListIterator();
    }
}