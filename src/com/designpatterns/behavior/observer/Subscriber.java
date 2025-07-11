package com.designpatterns.behavior.observer;

public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println(channel.getTitle()+" Video has been uploaded "+name);
    }
    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
