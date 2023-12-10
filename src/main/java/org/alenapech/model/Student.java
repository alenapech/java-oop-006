package org.alenapech.model;

public class Student extends User {

    public Student(int id, String firstName, String secondName, String lastName) {
        super(id, firstName, secondName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
