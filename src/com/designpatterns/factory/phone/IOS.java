package com.designpatterns.factory.phone;

public class IOS implements OS{
    @Override
    public void spec() {
        System.out.println("Secure OS:Apple");
    }
}
