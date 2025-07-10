package com.designpatterns.structural.Adapter;

public class School {
    public static void main(String[] args) {
        AssignmentWork work = new AssignmentWork();

        Pen pen= new PenAdapter();
        work.setP(pen);

        work.writeAssignemnt("I will not write assignment ");
    }
}
