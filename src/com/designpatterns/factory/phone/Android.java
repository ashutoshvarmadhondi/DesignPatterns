package com.designpatterns.factory.phone;

public class Android implements OS
{
    @Override
    public void spec() {
        System.out.println("Most used and Open-Source OS: Android");
    }
}
