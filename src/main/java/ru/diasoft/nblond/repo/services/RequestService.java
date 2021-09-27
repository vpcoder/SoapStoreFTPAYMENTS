package ru.diasoft.nblond.repo.services;

import ru.diasoft.nblond.repo.dto.User;
import ru.diasoft.nblond.repo.serialization.data.RequestDataModel;

import java.util.List;

public interface RequestService {

    List<RequestDataModel> getRequests(User user, String method);

    RequestDataModel addRequest(User user, String method, String name, String body);

    void deleteRequest(RequestDataModel model, User user);

    RequestDataModel updateRequest(RequestDataModel model, User user);

}
