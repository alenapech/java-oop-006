package org.alenapech.controller;

import org.alenapech.model.Student;
import org.alenapech.service.StudentService;
import org.alenapech.view.StudentView;

public class StudentController implements UserController<Student> {
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    public void sendOnConsoleStudent() {
        studentView.sedOnConsole(studentService.getStudentList());
    }
}
