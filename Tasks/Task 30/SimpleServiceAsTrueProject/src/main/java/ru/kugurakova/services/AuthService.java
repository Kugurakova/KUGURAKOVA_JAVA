package ru.kugurakova.services;

import ru.kugurakova.repositories.jdbc.models.User;

import javax.servlet.http.Cookie;
import java.util.Optional;

public interface AuthService {
    Optional<User> findUserByCookie(Cookie cookie);
}