package com.designpatterns.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
    Component hd = new Leaf(4000,"HDD");
    Component mouse = new Leaf(400,"mouse");
    Component ram = new Leaf(2000,"ram");
    Component monitor = new Leaf(1000,"monitor");
    Component cpu = new Leaf(10000,"cpu");

    Composite ph = new Composite("peri");
    Composite cabinet = new Composite("cabinet");
    Composite motherboard = new Composite("motherboard");
    Composite computer = new Composite("computer");

    ph.addComponent(mouse);
    ph.addComponent(monitor);
    cabinet.addComponent(hd);
    cabinet.addComponent(motherboard);

    computer.addComponent(ph);
    computer.addComponent(cabinet);



    computer.showPrice();

    }
}
