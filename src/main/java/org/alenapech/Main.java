package org.alenapech;

import org.alenapech.controller.UserController;
import org.alenapech.controller.UserControllerImpl;
import org.alenapech.service.StudentService;
import org.alenapech.service.TeacherService;
import org.alenapech.service.UserService;
import org.alenapech.view.ConsoleView;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        UserService studentService = new StudentService();
        UserService teacherService = new TeacherService();
        ConsoleView view = new ConsoleView();

        UserController studentController = new UserControllerImpl(studentService, view);
        studentController.create("1", "2", "3");
        studentController.create("2", "3", "4");
        studentController.create("5", "6", "7");
        studentController.create("8", "9", "10");
        studentController.printAllUsers();

        UserController teacherController = new UserControllerImpl(teacherService, view);
        teacherController.create("1", "2", "3");
        teacherController.create("2", "3", "4");
        teacherController.create("5", "6", "7");
        teacherController.create("8", "9", "10");
        teacherController.printAllUsers();
    }
}