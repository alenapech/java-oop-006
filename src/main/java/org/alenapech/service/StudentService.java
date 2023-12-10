package org.alenapech.service;

import org.alenapech.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public List<Student> getUserList() {
        return studentList;
    }

    @Override
    public Class<Student> getUserClass() {
        return Student.class;
    }
}
