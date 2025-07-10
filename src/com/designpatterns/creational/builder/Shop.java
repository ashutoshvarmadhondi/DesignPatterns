package com.designpatterns.creational.builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("android").setRam(2).setProcessor("Mediatek").getPhone();
        System.out.println(phone);
    }
}
