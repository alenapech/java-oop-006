package org.alenapech.controller;

import org.alenapech.model.User;

public interface UserController<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
