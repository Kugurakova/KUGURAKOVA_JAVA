package ru.kugurakova.services;

import ru.kugurakova.forms.AuthUserForm;
import ru.kugurakova.repositories.jdbc.models.User;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    void signUp(AuthUserForm form);
    Optional<String> signInAndCreateCookieValue(AuthUserForm form);
    boolean isExistsByCookie(String cookie);
    List<User> getAllUsers();
}
