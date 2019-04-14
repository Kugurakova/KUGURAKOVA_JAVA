package ru.kugurakova.repositories;

import ru.kugurakova.repositories.jdbc.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends CrudRepository<User> {
    Optional<User> findOneByLogin(String login);
    List<User> findAllByFirstNameAndLastName(String firstName, String lastName);
    Optional<User> findOneByCookie(String cookie);
}