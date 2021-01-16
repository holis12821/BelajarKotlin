package com.dicoding.javafundamental.collection.company;

public  class Employee {
    private String name;
    private String address;
    private int age;

    public Employee(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Employee() {

    }

    public void sayHello(String name){
        System.out.println("Hi " + name + ", My name is Employee " + this.name);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
