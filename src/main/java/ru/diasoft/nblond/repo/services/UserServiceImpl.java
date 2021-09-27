package ru.diasoft.nblond.repo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.diasoft.nblond.repo.dto.User;
import ru.diasoft.nblond.repo.repostory.UserRepository;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static final String GET_USER_BY_NAME_METHOD = "UserService.getUserByName.v1";

    private final UserRepository userRepository;

    @Resource
    private UserService self;

    @Cacheable(value = GET_USER_BY_NAME_METHOD)
    public Optional<User> getUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        User user = self.getUserByLogin(login).orElseThrow(() -> new UsernameNotFoundException(String.format("User %s is not found", login)));
        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), true, true, true, true, new HashSet<>());
    }

}