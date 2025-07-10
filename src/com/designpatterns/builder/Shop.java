package com.designpatterns.builder;

public class Shop {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder().setOs("android").setRam(2).getPhone();
        System.out.println(phone);
    }
}
