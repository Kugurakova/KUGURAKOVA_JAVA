package ru.kugurakova;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intList1 = new ArrayList<>();
        intList1.add(2);
        intList1.add(3);
        intList1.add(5);
        intList1.addToBegin(7);
        intList1.insert(9,2);
        intList1.print();
        intList1.reverse();
        intList1.print();
        Algorithms.sort(intList1);
        intList1.print();


        LinkedList<Integer> intList2 = new LinkedList<>();
        intList2.add(11);
        intList2.add(13);
        intList2.add(17);
        intList2.addToBegin(19);
        intList2.insert(23,3);

        intList2.print();
        intList2.reverse();
        intList2.print();
        Algorithms.sort(intList2);
        intList2.print();

        ArrayList<Car> carArray = new ArrayList<>();
        carArray.add(new Car("bmw",2011,65000));
        carArray.add(new Car("kia",2014,40000));
        carArray.add(new Car("gaz",2014,10000));
        carArray.addToBegin(new Car("uaz",2017,10000));
        carArray.print();
        carArray.reverse();
//        carArray.print();
        Algorithms.sort(carArray);
        carArray.print();

        LinkedList<Car> carLinked = new LinkedList<>();
        carLinked.add(new Car("car1",2012,65000));
        carLinked.add(new Car("car2",2014,45000));
        carLinked.add(new Car("car3",2016,25000));
        carLinked.addToBegin(new Car("car4",2018,5000));
        carLinked.print();
        Algorithms.sort(carLinked);
        carLinked.reverse();
        carLinked.print();
    }
}
