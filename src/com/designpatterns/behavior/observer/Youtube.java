package com.designpatterns.behavior.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel chai = new Channel();
        Subscriber s1 = new Subscriber("Akshay");

        Subscriber s2 = new Subscriber("Sonam");

        Subscriber s3 = new Subscriber("Harsh");
        Subscriber s4 = new Subscriber("novan");

        Subscriber s5 = new Subscriber("meme");

        chai.subscribe(s1);
        chai.subscribe(s2);
        chai.subscribe(s3);
        chai.subscribe(s4);
        chai.subscribe(s5);

        chai.unsubscribe(s1);
        s1.subscribeChannel(chai);
        s2.subscribeChannel(chai);
        s3.subscribeChannel(chai);
        s4.subscribeChannel(chai);
        s5.subscribeChannel(chai);

        chai.upload("Chai aur charcha");

    }
}
