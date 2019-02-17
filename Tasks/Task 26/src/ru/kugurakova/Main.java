package ru.kugurakova;

public class Main {

    public static void main(String[] args) {
        LinkedList<Car> carLinked = new LinkedList<>();
        carLinked.add(new Car("car1",2012,65000));
        carLinked.add(new Car("car2",2014,45000));
        carLinked.add(new Car("car3",2016,25000));
        carLinked.addToBegin(new Car("car4",2018,5000));
        Iterator iteratorLinked = carLinked.iterator();
        System.out.println("Linked");
        while (iteratorLinked.hasNext()) {
            System.out.println(iteratorLinked.next().toString());
        }
        ArrayList<Car> carArray = new ArrayList<>();
        carArray.add(new Car("bmw",2011,65000));
        carArray.add(new Car("kia",2014,40000));
        carArray.add(new Car("gaz",2014,10000));
        carArray.addToBegin(new Car("uaz",2017,10000));

        Iterator iteratorArray = carArray.iterator();
        System.out.println("Array");
        while (iteratorArray.hasNext()) {
            System.out.println(iteratorArray.next().toString());
        }

//        carArray.print();

    }
}
