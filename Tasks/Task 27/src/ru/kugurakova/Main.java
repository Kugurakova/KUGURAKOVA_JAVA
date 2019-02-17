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
        IdGenerator idGenerator = new IdGenerator("C:\\Users\\user\\Desktop\\KUGURAKOVA_JAVA\\Tasks\\Task 27\\src\\ru\\kugurakova\\users_id_sequence.txt");
        UsersRepository usersRepository = new UsersRepositoryImpl("C:\\Users\\user\\Desktop\\KUGURAKOVA_JAVA\\Tasks\\Task 27\\src\\ru\\kugurakova\\users.txt", idGenerator);
        CarsRepository carsRepository = new CarsRepositoryImpl("C:\\Users\\user\\Desktop\\KUGURAKOVA_JAVA\\Tasks\\Task 27\\src\\ru\\kugurakova\\cars.txt", idGenerator);
//        User user = retriever.retrieveUser();
//        usersRepository.save(user);
        System.out.println(carsRepository.find(75));
        System.out.println(usersRepository.find(0));
        System.out.println(usersRepository.find(123));
        System.out.println(usersRepository.find(32));
    }
}
