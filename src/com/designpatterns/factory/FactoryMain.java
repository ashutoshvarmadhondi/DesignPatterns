package com.designpatterns.factory;

import com.designpatterns.factory.phone.OS;
import com.designpatterns.factory.phone.OSFactory;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory factory = new OSFactory();
       OS obj = factory.getInstance("Open");
       obj.spec();
    }
}
