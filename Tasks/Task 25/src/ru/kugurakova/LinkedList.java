package ru.kugurakova;

public class LinkedList<T> implements List<T>{
    private Node top;
    private Node tail;
    private int count;

    public LinkedList() {
        this.top = null;
        this.count = 0;
    }
    public void add(T value) {
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

    public Node getTop(){
        return top;
    }

    public Node getTail(){
        return tail;
    }

    public int getCount(){
        return count;
    }

    public void addToBegin(T value) {
        Node node = new Node(value);
        if (top == null) {
            tail = node;
        }

        node.setNext(top);
        count++;
        top = node;
    }

    public void insert(T value, int index) {// вставить по индексу со сдвигом
        Node pnew = new Node(value);
        Node pred;
        if (index == 0 ) {
            addToBegin(value);
        }
        if (index == count ) {
            add(value);
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
    public T get(int index){ // получить элемент по индексу
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
        return (T) current.getValue();
    }

    public void update(T value, int index) {// вставить по индексу со сдвигом
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

    public void reverse(){// перевернуть
        T value;
        int index = count;
        if (count>1) {
            Node current = top;
            for (int j = 0; j*2 < count ; j++) {
                value = (T) current.getValue();
                current.setValue(get(index-1));
                update(value, index-1);
                current = current.getNext();
                index=index-1;
            }
        }
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
