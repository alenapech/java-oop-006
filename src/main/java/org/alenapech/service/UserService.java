package org.alenapech.service;

import org.alenapech.model.User;

public interface UserService<T extends User> {

    void create(String firstName, String secondName, String lastName);

}
