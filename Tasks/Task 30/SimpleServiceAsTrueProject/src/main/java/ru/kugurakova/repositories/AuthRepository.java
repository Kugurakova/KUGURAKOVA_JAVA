package ru.kugurakova.repositories;

import ru.kugurakova.repositories.jdbc.models.Auth;

import java.util.Optional;

public interface AuthRepository extends CrudRepository<Auth> {
    Optional<Auth> findByValue(String value);
}