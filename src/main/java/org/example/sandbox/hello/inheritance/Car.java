package org.example.sandbox.hello.inheritance;

public class Car extends Vehicle {
    public Car() {
        counter++;
    }

    @Override
    public void load() {
        System.out.println("Loading car stuff");
    }

    @Override
    public void transport() {

    }

    @Override
    public void move() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void unload() {

    }
}
