package ru.kugurakova;

public class IntegerLinkedList implements IntegerList {
    private Node top;
    private Node tail;
    private int count;

    public IntegerLinkedList() {
        this.top = null;
        this.count = 0;
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
        Node current = top;
        System.out.print(current.getValue());
        while (current.getNext() != null) {
            current = current.getNext();
            System.out.print(" " + current.getValue());
        }
        System.out.println();
    }
}
