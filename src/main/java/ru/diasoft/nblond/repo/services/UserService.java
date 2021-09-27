package ru.diasoft.nblond.repo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.diasoft.nblond.repo.dto.User;

import java.util.Optional;

public interface UserService extends UserDetailsService {

    Optional<User> getUserByLogin(String login);

}
