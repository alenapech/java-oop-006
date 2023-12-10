package org.alenapech.model;

public class Teacher extends User {

    public Teacher(int id, String firstName, String secondName, String lastName) {
        super(id, firstName, secondName, lastName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
