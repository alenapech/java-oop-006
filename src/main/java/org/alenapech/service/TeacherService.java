package org.alenapech.service;

import org.alenapech.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teacherList = new ArrayList<>();

    @Override
    public List<Teacher> getUserList() {
        return teacherList;
    }

    @Override
    public Class<Teacher> getUserClass() {
        return Teacher.class;
    }
}
