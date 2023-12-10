package org.alenapech;

import org.alenapech.controller.StudentController;
import org.alenapech.controller.TeacherController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.create("1", "2", "3");
        studentController.create("2", "3", "4");
        studentController.create("5", "6", "7");
        studentController.create("8", "9", "10");
        studentController.sendOnConsoleStudent();

        TeacherController teacherController = new TeacherController();
        teacherController.create("1", "2", "3");
        teacherController.create("2", "3", "4");
        teacherController.create("5", "6", "7");
        teacherController.create("8", "9", "10");
        teacherController.sendOnConsoleTeacher();
    }
}