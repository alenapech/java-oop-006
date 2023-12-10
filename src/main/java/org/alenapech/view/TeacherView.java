package org.alenapech.view;

import org.alenapech.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {
    @Override
    public void sedOnConsole(List<Teacher> list) {
        for (Teacher i: list) {
            System.out.println(i + " ");
        }
    }
}
