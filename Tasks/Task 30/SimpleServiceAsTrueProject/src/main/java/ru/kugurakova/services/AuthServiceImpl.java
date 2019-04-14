package ru.kugurakova.services;

import ru.kugurakova.repositories.jdbc.models.Auth;
import ru.kugurakova.repositories.jdbc.models.User;
import ru.kugurakova.repositories.AuthRepository;

import javax.servlet.http.Cookie;
import java.util.Optional;

public class AuthServiceImpl implements AuthService {

    private AuthRepository authRepository;

    public AuthServiceImpl(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @Override
    public Optional<User> findUserByCookie(Cookie cookie) {
        Optional<Auth> auth = authRepository.findByValue(cookie.getValue());
//        if (auth.isPresent()) {
//            return Optional.of(auth.get().getUser());
//        } else return Optional.empty();
        return auth.map(Auth::getUser);
    }
}