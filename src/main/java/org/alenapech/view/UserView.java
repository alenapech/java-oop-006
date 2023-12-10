package org.alenapech.view;

import org.alenapech.model.User;

import java.util.List;

public interface UserView<T extends User> {
    void sedOnConsole(List<T> list);
}
