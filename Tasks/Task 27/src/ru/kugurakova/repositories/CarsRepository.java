package ru.kugurakova.repositories;

import ru.kugurakova.models.User;
import ru.kugurakova.models.Car;

public interface CarsRepository extends CrudRepository<Car> {

    List<Car> findByOwner(User owner);
}