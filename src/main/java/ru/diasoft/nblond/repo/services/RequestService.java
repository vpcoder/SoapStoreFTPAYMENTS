package ru.diasoft.nblond.repo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.diasoft.nblond.repo.dto.User;
import ru.diasoft.nblond.repo.exceptions.NotFoundException;
import ru.diasoft.nblond.repo.repostory.RequestRepository;
import ru.diasoft.nblond.repo.serialization.convert.RequestConverter;
import ru.diasoft.nblond.repo.serialization.data.RequestDataModel;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RequestService {

    private final RequestRepository requestRepository;
    private final RequestConverter converter;

    public List<RequestDataModel> getRequests(User user, String method) {
        var list = requestRepository.findRequests(user.getId(), method);
        return list.stream()
                .map(converter::create)
                .collect(Collectors.toList());
    }

    public RequestDataModel addRequest(User user, String method, String name, String body) {
        var request = converter.create(user.getId(), name, method, body);
        return converter.create(requestRepository.save(request));
    }

    public void deleteRequest(RequestDataModel model, User user) {
        var request = converter.create(model, user);
        requestRepository.delete(request);
    }

    public RequestDataModel updateRequest(RequestDataModel model, User user) {
        var request = converter.create(model, user);
        var existsRequest = requestRepository.findById(request.getId()).orElseThrow(NotFoundException::new);
        if(request.getMethod() == null) {
            request.setMethod(existsRequest.getMethod());
        }
        if(request.getName() == null) {
            request.setName(existsRequest.getName());
        }
        if(request.getBody() == null) {
            request.setBody(existsRequest.getBody());
        }
        return converter.create(requestRepository.save(request));
    }

}
