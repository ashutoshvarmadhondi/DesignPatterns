package com.designpatterns.structural.Adapter;

public class AssignmentWork {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void writeAssignemnt(String str) {
        p.write(str);
    }
}
