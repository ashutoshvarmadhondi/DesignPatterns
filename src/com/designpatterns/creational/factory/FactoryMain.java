package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.phone.OS;
import com.designpatterns.creational.factory.phone.OSFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory factory = new OSFactory();
       OS obj = factory.getInstance("Open");
       obj.spec();
    }
}
