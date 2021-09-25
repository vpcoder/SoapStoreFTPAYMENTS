package ru.diasoft.nblond.repo.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ru.diasoft.nblond.repo.exceptions.NotFoundException;
import ru.diasoft.nblond.repo.services.UserService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService service;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String getAuthUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth == null) {
            return "{ \"state\": \"error\" }";
        }
        org.springframework.security.core.userdetails.User data = (org.springframework.security.core.userdetails.User)auth.getPrincipal();
        service.getUserByLogin(data.getUsername()).orElseThrow(NotFoundException::new);
        return "{ \"state\": \"ok\" }";
    }

}