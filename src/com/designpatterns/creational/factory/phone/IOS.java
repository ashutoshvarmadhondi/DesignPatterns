package com.designpatterns.creational.factory.phone;

public class IOS implements OS{
    @Override
    public void spec() {
        System.out.println("Secure OS:Apple");
    }
}
