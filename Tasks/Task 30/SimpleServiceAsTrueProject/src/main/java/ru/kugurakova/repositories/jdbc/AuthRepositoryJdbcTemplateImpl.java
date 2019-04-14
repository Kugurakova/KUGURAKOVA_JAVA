package ru.kugurakova.repositories.jdbc;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.kugurakova.repositories.jdbc.models.Auth;
import ru.kugurakova.repositories.jdbc.models.User;
import ru.kugurakova.repositories.AuthRepository;

import java.util.List;
import java.util.Optional;

public class AuthRepositoryJdbcTemplateImpl implements AuthRepository {

    //language=SQL
    private static final String SQL_INSERT = "insert into auth (user_id, cookie_value) values (?, ?)";

    //language=SQL
    private static final String SQL_FIND_BY_VALUE = "select u.id as u_id, a.id as a_id, a.cookie_value, u.login as u_login " +
            "from auth a " +
            "       join service_user u on a.user_id = u.id " +
            "where cookie_value = ?;";

    private JdbcTemplate template;

    private RowMapper<Auth> authRowMapper = (row, rowNumber) -> {
        Auth auth = Auth.builder()
                .id(row.getLong("a_id"))
                .value(row.getString("cookie_value"))
                .build();

        User user = User.builder()
                .id(row.getLong("u_id"))
                .login(row.getString("u_login"))
                .build();

        auth.setUser(user);

        return auth;
    };

    public AuthRepositoryJdbcTemplateImpl(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void save(Auth model) {
        template.update(SQL_INSERT, model.getUser().getId(), model.getValue());
    }

    @Override
    public Auth find(Long id) {
        return null;
    }

    @Override
    public List<Auth> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Optional<Auth> findByValue(String value) {
        try {
            return Optional.of(template.queryForObject(SQL_FIND_BY_VALUE, authRowMapper, value));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }
}