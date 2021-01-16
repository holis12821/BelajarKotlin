package com.dicoding.javafundamental.collection.company;

public class VipePresident extends Manager {

    public VipePresident(String name, String address, int age) {
        super(name, address, age);
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is VP " + super.getName());
    }
}
