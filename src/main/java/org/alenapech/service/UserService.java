package org.alenapech.service;

import org.alenapech.model.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface UserService<T extends User> {

    default T create(String firstName, String secondName, String lastName) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        int maxId = 0;
        for (T user : getUserList()) {
            if (maxId < user.getId()) {
                maxId = user.getId();
            }
        }
        maxId++;
        Class<T> clazz = getUserClass();
        Constructor<T> constructor = clazz.getConstructor(int.class, String.class, String.class, String.class);
        T result = constructor.newInstance(maxId, firstName, secondName, lastName);
        getUserList().add(result);
        return result;
    }

    List<T> getUserList();

    Class<T> getUserClass();

}
