package ru.diasoft.nblond.repo.serialization.data;

import lombok.Data;

import java.io.Serializable;

/**
 * Модель для работы во вне
 */
@Data
public class RequestDataModel implements Serializable {

    private long id;

    private String method;

    private String name;

    private String body;

}
