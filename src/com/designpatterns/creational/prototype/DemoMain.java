package com.designpatterns.creational.prototype;

public class DemoMain {
    public static void main(String[] args) throws CloneNotSupportedException  {
        BookShop shops = new BookShop();
        shops.setShopName("Fed-ex");
        shops.loadData();



        BookShop bookShop = shops.clone();
        shops.getBooks().remove(2);
        bookShop.setShopName("target");
        bookShop.loadData();
        System.out.println(shops);
        System.out.println(bookShop);
    }
}
