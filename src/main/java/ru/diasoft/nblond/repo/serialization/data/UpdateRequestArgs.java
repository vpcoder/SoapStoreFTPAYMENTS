package ru.diasoft.nblond.repo.serialization.data;

import lombok.Data;

import java.io.Serializable;

@Data
public class UpdateRequestArgs implements Serializable {
    private long id;
    private String method;
    private String name;
    private String body;
}
