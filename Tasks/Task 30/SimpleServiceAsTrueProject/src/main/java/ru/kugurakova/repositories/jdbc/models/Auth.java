package ru.kugurakova.repositories.jdbc.models;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Auth {
    private Long id;
    private User user;
    private String value;
}
