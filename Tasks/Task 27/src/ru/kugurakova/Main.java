package ru.kugurakova;

import ru.kugurakova.models.User;
import ru.kugurakova.repositories.CarsRepository;
import ru.kugurakova.repositories.CarsRepositoryImpl;
import ru.kugurakova.repositories.UsersRepository;
import ru.kugurakova.repositories.UsersRepositoryImpl;
import ru.kugurakova.utils.IdGenerator;
import ru.kugurakova.utils.UserFromConsoleRetriever;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        UserFromConsoleRetriever retriever = new UserFromConsoleRetriever();
        IdGenerator idGenerator = new IdGenerator("users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("users.txt", idGenerator);
        IdGenerator idCar = new IdGenerator("cars_id_sequence.txt");
        CarsRepository carsRepository = new CarsRepositoryImpl("cars.txt", idCar);
//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
        System.out.println(carsRepository.find(75));
        System.out.println(usersRepository.find(0));
        System.out.println(usersRepository.find(123));
        System.out.println(usersRepository.find(32));
    }
}
