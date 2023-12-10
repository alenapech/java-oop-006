package org.alenapech.controller;

import org.alenapech.model.User;
import org.alenapech.service.UserService;
import org.alenapech.view.View;

import java.lang.reflect.InvocationTargetException;

public class UserControllerImpl implements UserController {
    private UserService service;
    private View view;

    public UserControllerImpl(UserService service, View view) {
        this.service = service;
        this.view = view;
    }

    @Override
    public User create(String firstName, String secondName, String lastName) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return service.create(firstName, secondName, lastName);
    }

    @Override
    public void printAllUsers() {
        view.print(service.getUserList());
    }
}
