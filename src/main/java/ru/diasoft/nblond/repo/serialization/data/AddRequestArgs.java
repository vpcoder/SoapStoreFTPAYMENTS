package ru.diasoft.nblond.repo.serialization.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddRequestArgs implements Serializable {
    private String method;
    private String name;
    private String body;
}
