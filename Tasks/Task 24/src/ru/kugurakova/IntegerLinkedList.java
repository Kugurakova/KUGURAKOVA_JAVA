package ru.kugurakova;

public class IntegerLinkedList implements IntegerList {
    private Node top;
    private Node tail;
    private int count;

    public IntegerLinkedList() {
        this.top = null;
        this.count = 0;
    }
    public void reverse(){// перевернуть
        int value;
        int index = count;
        if (count>1) {
            Node current = top;
            for (int j = 0; j*2 < count ; j++) {
                value =current.getValue();
                current.setValue(get(index-1));
                update(value, index-1);
                current = current.getNext();
                index=index-1;
            }
        }
    }
    public void sort() { // сортировка
        int newvalue;
        int index;
        int oldvalue;
        if (count>1) {
            Node current;
            Node update = top;
            index = 0;
            for (int j = 1; j < count ; j++) {
                current = update;
                newvalue = current.getValue();
                for (int i = j; i < count; i++) {
                    current = current.getNext();
                    if (newvalue >= current.getValue()) {
                        index = i;
                        newvalue = current.getValue();
                    }
                }
                if (update.getValue() != newvalue){
                    oldvalue = update.getValue();
                    update.setValue(newvalue);
                    update(oldvalue, index);
                }
                update = update.getNext();
            }
        }
    }

    public void addToEnd(int value) {
        Node node = new Node(value);
        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.setNext(node);
            tail = node;
        }
        count++;
    }

    public void addToBegin(int value) {
        Node node = new Node(value);
        if (top == null) {
            tail = node;
        }

        node.setNext(top);
        count++;
        top = node;
    }
    public int get(int index){ // получить элемент по индексу
        Node current;
        if (index == count-1 ) {
            current = tail;
        }
        else {
            current = top;
            if (index > 0) {
                for (int i = 0; i < index; i++) {
                    current = current.getNext();
                }
            }
        }
        return current.getValue();
    }
    public void insert(int value, int index) {// вставить по индексу со сдвигом
        Node pnew = new Node(value);
        Node pred;
        if (index == 0 ) {
            addToBegin(value);
        }
        if (index == count ) {
            addToEnd(value);
        }
        else {
            pred = top;
            for (int i = 1; i <= index; i++) {
                if (i == index ){
                    pnew.setNext(pred.getNext());
                    pred.setNext(pnew);
                }
                pred = pred.getNext();
            }
        }
        count++;
    }
    public void update(int value, int index) {// вставить по индексу со сдвигом
        Node current = top;
        if (index == 0 ) {
            top.setValue(value);
        }
        if (index == count-1 ) {
            tail.setValue(value);
        }
        else {
            for (int i = 1; i <= index; i++) {
                current = current.getNext();
                if (i == index ){
                    current.setValue(value);
                }

            }
        }
    }

    public int getCount(){
        return count;
    }

    public void remove(int index) { //удаление по индексу
        Node pred;
        pred = top;
        for (int i = 0; i < index; i++) {
            if (i == index-1) {
                pred.setNext(pred.getNext().getNext());
                count--;
            }
            pred = pred.getNext();
        }
    }
    public boolean contains(int element) { // возвращает true, если список содержит заданный элемент
        Node current = top;
        boolean result = false;
        while (current.getNext() != null) {
            if (current.getValue() == element){
                result = true;
                break;
            }
            current = current.getNext();
        }
        return result;
    }

    public int indexOf(int element) {  // возвращает индекс элемента, если он есть в списке, -1 - если не нашел ничего
        int result = -1;
        Node current = top;
        for (int i = 0; i < count; i++) {
            if (current.getValue() == element) {
                result = i;
                break;
            }
            current = current.getNext();
        }
        return result;
    }

    public void print() {
        if (top != null) {
            Node current = top;
            System.out.print(current.getValue());
            while (current.getNext() != null) {
                current = current.getNext();
                System.out.print(" " + current.getValue());
            }
        }
        System.out.println();
    }
}
