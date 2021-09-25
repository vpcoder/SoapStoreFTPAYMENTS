package ru.diasoft.nblond.repo.serialization.convert;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.diasoft.nblond.repo.dto.Request;
import ru.diasoft.nblond.repo.dto.User;
import ru.diasoft.nblond.repo.serialization.data.RequestDataModel;

@Service
@RequiredArgsConstructor
public class RequestConverter {

    public RequestDataModel create(Request request) {
        var data = new RequestDataModel();
        data.setId(request.getId());
        data.setMethod(request.getMethod());
        data.setName(request.getName());
        data.setBody(request.getBody());
        return data;
    }

    public Request create(RequestDataModel model, User user) {
        Request request = new Request();
        request.setId(model.getId());
        request.setUser(user.getId());
        request.setMethod(model.getMethod());
        request.setName(model.getName());
        request.setBody(model.getBody());
        return request;
    }

    public Request create(long userId, String name, String method, String body) {
        Request request = new Request();
        request.setUser(userId);
        request.setName(name);
        request.setMethod(method);
        request.setBody(body);
        return request;
    }

}
