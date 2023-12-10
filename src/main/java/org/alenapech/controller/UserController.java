package org.alenapech.controller;

import org.alenapech.model.User;

import java.lang.reflect.InvocationTargetException;

public interface UserController {
    User create(String firstName, String secondName, String lastName) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException;

    void printAllUsers();
}
