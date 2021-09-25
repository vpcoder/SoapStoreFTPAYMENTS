package ru.diasoft.nblond.repo.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import ru.diasoft.nblond.repo.rest.controller.RequestController;
import ru.diasoft.nblond.repo.repostory.UserRepository;
import ru.diasoft.nblond.repo.dto.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
@WebMvcTest(RequestController.class)
class PersonControllerTest {

    public static final String ERROR_STRING = "Таких тут нет!";
    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;

    @MockBean
    private UserRepository repository;

    @Test
    void shouldReturnCorrectPersonsList() throws Exception {
        List<User> persons = List.of(new User(1, "Person1"), new User(2, "Person2"));
        given(repository.findAll()).willReturn(persons);

        List<UserDto> expectedResult = persons.stream()
                .map(UserDto::toDto).collect(Collectors.toList());

        mvc.perform(get("/persons/all"))
                .andExpect(status().isOk())
                .andExpect(content().json(mapper.writeValueAsString(expectedResult)));
    }

    @Test
    void shouldReturnCorrectPersonByIdInRequest() throws Exception {
        User person = new User(1, "Person1");
        given(repository.findById(1L)).willReturn(Optional.of(person));
        UserDto expectedResult = UserDto.toDto(person);

        mvc.perform(get("/persons").param("id", "1"))
                .andExpect(status().isOk())
                .andExpect(content().json(mapper.writeValueAsString(expectedResult)));
    }

    @Test
    void shouldReturnCorrectPersonByIdInPath() throws Exception {
        User person = new User(1, "Person1");
        given(repository.findById(1L)).willReturn(Optional.of(person));
        UserDto expectedResult = UserDto.toDto(person);

        mvc.perform(get("/persons/1"))
                .andExpect(status().isOk())
                .andExpect(content().json(mapper.writeValueAsString(expectedResult)));
    }

    @Test
    void shouldReturnExpectedErrorWhenPersonNotFound() throws Exception {
        given(repository.findById(1L)).willReturn(Optional.empty());

        mvc.perform(get("/persons").param("id", "1"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string(ERROR_STRING));

        mvc.perform(get("/persons/1"))
                .andExpect(status().isBadRequest())
                .andExpect(content().string(ERROR_STRING));
    }


}
*/