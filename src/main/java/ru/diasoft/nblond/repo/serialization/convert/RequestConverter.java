package ru.diasoft.nblond.repo.serialization.convert;

import ru.diasoft.nblond.repo.dto.Request;
import ru.diasoft.nblond.repo.dto.User;
import ru.diasoft.nblond.repo.serialization.data.RequestDataModel;

public interface RequestConverter {

    RequestDataModel create(Request request);

    Request create(RequestDataModel model, User user);

    Request create(User user, String name, String method, String body);

}
