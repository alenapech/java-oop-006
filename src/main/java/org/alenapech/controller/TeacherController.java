package org.alenapech.controller;

import org.alenapech.model.Teacher;
import org.alenapech.service.TeacherService;
import org.alenapech.view.TeacherView;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public void sendOnConsoleTeacher() {
        teacherView.sedOnConsole(teacherService.getTeacherList());
    }
}
