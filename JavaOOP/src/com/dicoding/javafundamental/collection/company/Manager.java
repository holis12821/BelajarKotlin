package com.dicoding.javafundamental.collection.company;

public class Manager extends Employee {

    private String company;

    public Manager(String name, String address, int age ) {
        super(name, address, age);
    }
    public Manager(String name, String address, int age, String company ) {
        super(name, address, age);
        this.company = company;
    }

    public void Company(){
        System.out.println("I'm " + getName() + " Job in the " + getCompany());
    }

    public Manager() {
        super();
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hi " + name + ", My name is Manager " + super.getName());
    }

    public String getCompany() {
        return company;
    }
}
