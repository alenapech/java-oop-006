package org.alenapech.view;

import org.alenapech.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sedOnConsole(List<Student> list) {
        for (Student i: list) {
            System.out.println(i + " ");
        }
    }
}
