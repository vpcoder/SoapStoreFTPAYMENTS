package ru.diasoft.nblond.repo.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import ru.diasoft.nblond.repo.dto.User;
import ru.diasoft.nblond.repo.exceptions.NotFoundException;
import ru.diasoft.nblond.repo.serialization.data.AddRequestArgs;
import ru.diasoft.nblond.repo.serialization.data.RequestDataModel;
import ru.diasoft.nblond.repo.serialization.data.UpdateRequestArgs;
import ru.diasoft.nblond.repo.services.RequestService;
import ru.diasoft.nblond.repo.services.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RequestController {

    private final RequestService requestService;
    private final UserService userService;

    private User getAuth() {
        var auth = SecurityContextHolder.getContext().getAuthentication();
        var data = (org.springframework.security.core.userdetails.User)auth.getPrincipal();
        return userService.getUserByLogin(data.getUsername()).orElseThrow(NotFoundException::new);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/request/get", method = RequestMethod.POST)
    public List<RequestDataModel> getRequests(@RequestHeader("method") String method) {
        return requestService.getRequests(getAuth(), method);
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/request/add", method = RequestMethod.POST)
    public RequestDataModel addRequest(@RequestBody AddRequestArgs args) {
        return requestService.addRequest(getAuth(), args.getMethod(), args.getName(), args.getBody());
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/request/update", method = RequestMethod.POST)
    public RequestDataModel updateRequest(@RequestBody UpdateRequestArgs args) {
        var model = new RequestDataModel();
        model.setId(args.getId());
        model.setMethod(args.getMethod());
        model.setName(args.getName());
        model.setBody(args.getBody());
        return requestService.updateRequest(model, getAuth());
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/request/delete", method = RequestMethod.POST)
    public void deleteRequest(@RequestHeader("id") Long id) {
        var model = new RequestDataModel();
        model.setId(id);
        requestService.deleteRequest(model, getAuth());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleNotFound(Exception ex) {
        return ResponseEntity.badRequest().body("error: " + ex.getMessage());
    }

}
