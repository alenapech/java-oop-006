package org.alenapech.view;

public class ConsoleView implements View {
    @Override
    public void print(Object object) {
        System.out.println(object.toString());
    }
}
