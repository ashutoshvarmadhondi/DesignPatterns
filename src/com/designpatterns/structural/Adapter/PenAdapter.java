package com.designpatterns.structural.Adapter;

public class PenAdapter implements Pen {

    PilotPen ppen = new PilotPen();
    @Override
    public void write(String str) {
        ppen.mark(str);
    }
}
